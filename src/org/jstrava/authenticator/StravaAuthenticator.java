package org.jstrava.authenticator;

/**
 * Created by roberto on 2/10/14.
 */
public class StravaAuthenticator {

    private int clientId;
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

    public StravaAuthenticator(int clientId, String redirectUri) {
        this.clientId = clientId;
        this.redirectUri = redirectUri;
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


}
