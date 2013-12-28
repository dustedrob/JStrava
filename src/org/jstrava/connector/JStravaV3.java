package org.jstrava.connector;


import com.google.gson.Gson;
import org.jstrava.entities.Activity;
import org.jstrava.entities.Athlete;
import org.jstrava.entities.Comment;
import org.jstrava.entities.Gear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class JStravaV3 implements JStrava {

    private String accessToken;

    public Athlete getCurrentAthlete() {
        return currentAthlete;
    }

    public void setCurrentAthlete(Athlete currentAthlete) {
        this.currentAthlete = currentAthlete;
    }

    private Athlete currentAthlete;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public Athlete findAthlete(Integer id) {

        String URL="https://www.strava.com/api/v3/athletes/"+id+"?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete athlete= gson.fromJson(result,Athlete.class);

        return athlete;

    }

    @Override
    public Activity findActivity(Integer id) {
        String URL="https://www.strava.com/api/v3/activities/"+id+"?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity activity= gson.fromJson(result,Activity.class);

        return activity;
    }

    @Override
    public List<Comment> findActivityComments(Integer activityId) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/comments?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Comment[] commentsArray= gson.fromJson(result,Comment[].class);


        List<Comment>comments= Arrays.asList(commentsArray);


        return comments;
    }

    @Override
    public List<Athlete> findActivityKudos(Integer activityId) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/kudos?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] commentsArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(commentsArray);


        return athletes;
    }

    @Override
    public Gear findGear(String id) {
        String URL="https://www.strava.com/api/v3/gear/"+id+"?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Gear gear= gson.fromJson(result,Gear.class);

        return gear;
    }


    public JStravaV3(String access_token){
        this.accessToken = access_token;
        String URL="https://www.strava.com/api/v3/athlete"+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        System.out.println(result);
        currentAthlete =gson.fromJson(result,Athlete.class);

    }




    private String getResult(String URL){
        StringBuilder sb= new StringBuilder();

        try {
            URL url = new URL(URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output;
            while ((output = br.readLine()) != null) {
                sb.append(output);
            }

            conn.disconnect();

        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
        return sb.toString();

    }
}
