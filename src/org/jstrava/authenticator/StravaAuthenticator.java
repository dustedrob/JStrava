package org.jstrava.authenticator;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

/**
 * Created by roberto on 2/10/14.
 */
public class StravaAuthenticator {

    private static final String TOKEN_URL = "https://www.strava.com/oauth/token";

    private int clientId;
    private String secrete;
    private String redirectUri;


    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getRedirectUri() {
        return redirectUri;
    }

    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    public String getSecrete() { return secrete; }

    public void setSecrete(String secrete) { this.secrete = secrete; }

    public StravaAuthenticator(int clientId, String redirectUri) {
        this.clientId = clientId;
        this.redirectUri = redirectUri;
    }

    public StravaAuthenticator(int clientId, String redirectUri, String secrete) {
        this.clientId = clientId;
        this.redirectUri = redirectUri;
        this.secrete = secrete;
    }


    public String getRequestAccessUrl(String approvalPrompt, boolean viewPrivate, boolean write, String state)
    {
        String url = "https://www.strava.com/oauth/authorize?client_id=" + clientId + "&response_type=code&redirect_uri=" + redirectUri;

        StringBuilder sb = new StringBuilder(url);

        if (viewPrivate || write)
        {
            sb.append("&scope=");

            if (viewPrivate) {
                sb.append("view_private");
            }
            if (viewPrivate && write) {
                sb.append(",");
            }
            if (write) {
                sb.append("write");
            }
        }
        sb.append("&state=" + state);
        if (!approvalPrompt.equals("force") && !approvalPrompt.equals("auto")) {
            throw new IllegalArgumentException("approvalPrompt should be 'force' or 'auto'");
        }
        sb.append("&approval_prompt=" + approvalPrompt);

        return sb.toString();
    }

    public AuthResponse getToken(String code) {
        if (secrete == null) {
            throw new IllegalStateException("Application secrete is not set");
        }

        try {

            URI uri = new URI(TOKEN_URL);
            URL url = uri.toURL();

            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            try {
                StringBuilder sb = new StringBuilder();
                sb.append("client_id=" + clientId);
                sb.append("&client_secret=" + secrete);
                sb.append("&code=" + code);

                conn.setRequestMethod("POST");
                conn.setRequestProperty("Accept", "application/json");
                conn.setDoOutput(true);
                OutputStream os = conn.getOutputStream();
                os.write(sb.toString().getBytes("UTF-8"));

                if (conn.getResponseCode() != 200) {
                    throw new RuntimeException("Failed : HTTP error code : "
                            + conn.getResponseCode());
                }

                Reader br = new InputStreamReader((conn.getInputStream()));
                Gson gson = new Gson();
                return gson.fromJson(br, AuthResponse.class);

            } finally {
                conn.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
