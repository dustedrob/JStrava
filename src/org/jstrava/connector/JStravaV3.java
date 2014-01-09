package org.jstrava.connector;


import com.google.gson.Gson;
import org.jstrava.entities.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class JStravaV3 implements JStrava {

    private String accessToken;


    public void setCurrentAthlete(Athlete currentAthlete) {
        this.currentAthlete = currentAthlete;
    }

    private Athlete currentAthlete;


    public Athlete getCurrentAthlete() {
        return currentAthlete;
    }

    public List<Activity> getCurrentActivities() {
        String URL="https://www.strava.com/api/v3/athlete/activities?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }

    public List<Activity> getCurrentFriendsActivities() {
        String URL="https://www.strava.com/api/v3/activities/following?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentFriendsActivities= Arrays.asList(activitiesArray);
        return currentFriendsActivities;
    }


    public List<Athlete> getCurrentAthleteFollowers() {
        String URL="https://www.strava.com/api/v3/athlete/followers?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    public List<Athlete> getCurrentAthleteFriends() {
        String URL="https://www.strava.com/api/v3/athlete/clubs?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    public List<Club> getCurrentAthleteClubs() {
        String URL="https://www.strava.com/api/v3/athlete/clubs?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Club[] clubsArray= gson.fromJson(result,Club[].class);


        List<Club>clubs= Arrays.asList(clubsArray);


        return clubs;
    }

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
        System.out.println(result);
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
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteFriends(Integer id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/friends?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteFriends(Integer id,HashMap optionalParameters) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/friends?access_token="+accessToken;
        String result=getResult(URL,optionalParameters);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }



    @Override
    public List<Athlete> findAthleteFollowers(Integer id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/followers?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteBothFollowing(Integer id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/both-following?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


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

    @Override
    public Club findClub(Integer id) {
        String URL="https://www.strava.com/api/v3/clubs/"+id+"?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Club club= gson.fromJson(result,Club.class);

        return club;
    }

    @Override
    public List<Athlete> findClubMembers(Integer clubId) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/members?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Activity> findClubActivities(Integer clubId) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/activities"+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>clubActivities= Arrays.asList(activitiesArray);
        return clubActivities;
    }

    @Override
    public SegmentEffort findSegmentEffort(Integer id) {
        String URL="https://www.strava.com/api/v3/segment_efforts/"+id+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        SegmentEffort segmentEffort= gson.fromJson(result,SegmentEffort.class);
        return segmentEffort;
    }

    @Override
    public List<SegmentEffort> findAthleteKOMs(Integer athleteId) {
        String URL="https://www.strava.com/api/v3/athletes/"+athleteId+"/koms?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        SegmentEffort[] segmentEffortArray=gson.fromJson(result,SegmentEffort[].class);
        List<SegmentEffort>segmentEfforts= Arrays.asList(segmentEffortArray);
        return segmentEfforts;
    }

    @Override
    public List<Photo> findActivityPhotos(Integer activityId) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/photos?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Photo[] photosArray =gson.fromJson(result,Photo[].class);
        List<Photo>photos= Arrays.asList(photosArray);
        return photos;
    }


    public JStravaV3(String access_token){
        this.accessToken = access_token;
        String URL="https://www.strava.com/api/v3/athlete"+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
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

    private String getResult(String URL, HashMap optionalParameters){
        StringBuilder sb= new StringBuilder();
        sb.append(URL);
        try {

            Iterator iterator= optionalParameters.keySet().iterator();

            while(iterator.hasNext())
            {
                sb.append("&");
                String key=(String)iterator.next();
                sb.append(key);
                sb.append("=");
                sb.append(optionalParameters.get(key));
            }

            URL url = new URL(sb.toString());

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
            sb=new StringBuilder();
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
