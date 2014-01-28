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
    private Athlete currentAthlete;


    @Override
    public Athlete getCurrentAthlete() {
        return currentAthlete;
    }


    @Override
    public Athlete findAthlete(int id) {

        String URL="https://www.strava.com/api/v3/athletes/"+id+"?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete athlete= gson.fromJson(result,Athlete.class);

        return athlete;

    }

    @Override
    public List<SegmentEffort> findAthleteKOMs(int athleteId) {
        String URL="https://www.strava.com/api/v3/athletes/"+athleteId+"/koms?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        SegmentEffort[] segmentEffortArray=gson.fromJson(result,SegmentEffort[].class);
        List<SegmentEffort>segmentEfforts= Arrays.asList(segmentEffortArray);
        return segmentEfforts;
    }

    @Override
    public List<SegmentEffort> findAthleteKOMs(int athleteId,int page,int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+athleteId+"/koms?access_token="+accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        SegmentEffort[] segmentEffortArray=gson.fromJson(result,SegmentEffort[].class);
        List<SegmentEffort>segmentEfforts= Arrays.asList(segmentEffortArray);
        return segmentEfforts;
    }

    @Override
    public List<Athlete> getCurrentAthleteFriends() {
        String URL="https://www.strava.com/api/v3/athlete/friends?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> getCurrentAthleteFriends(int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athlete/friends?access_token="+ accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findAthleteFriends(int id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/friends?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteFriends(int id,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/friends?access_token="+accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> getCurrentAthleteFollowers() {
        String URL="https://www.strava.com/api/v3/athlete/followers?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> getCurrentAthleteFollowers(int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athlete/followers?access_token="+ accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findAthleteFollowers(int id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/followers?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteFollowers(int id,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/followers?access_token="+ accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findAthleteBothFollowing(int id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/both-following?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteBothFollowing(int id,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/both-following?access_token="+ accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public Activity findActivity(int id) {
        String URL="https://www.strava.com/api/v3/activities/"+id+"?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity activity= gson.fromJson(result,Activity.class);

        return activity;
    }

    @Override
    public Activity findActivity(int id,boolean include_all_efforts) {
        String URL="https://www.strava.com/api/v3/activities/"+id+"?access_token="+ accessToken+"&include_all_efforts="+include_all_efforts;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity activity= gson.fromJson(result,Activity.class);

        return activity;
    }

    @Override
    public List<Activity> getCurrentAthleteActivities() {
        String URL="https://www.strava.com/api/v3/athlete/activities?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }

    @Override
    public List<Activity> getCurrentAthleteActivities(int page,int per_page) {
        String URL="https://www.strava.com/api/v3/athlete/activities?access_token="+accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }

    @Override
    public List<Activity> getCurrentAthleteActivitiesBeforeDate(long before) {
        String URL="https://www.strava.com/api/v3/athlete/activities?access_token="+accessToken+"&before="+before;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }

    @Override
    public List<Activity> getCurrentAthleteActivitiesAfterDate(long after) {
        String URL="https://www.strava.com/api/v3/athlete/activities?access_token="+accessToken+"&after="+after;
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

    public List<Activity> getCurrentFriendsActivities(int page, int per_page) {
        String URL="https://www.strava.com/api/v3/activities/following?access_token="+accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentFriendsActivities= Arrays.asList(activitiesArray);
        return currentFriendsActivities;
    }


    @Override
    public List<LapEffort> findActivityLaps(int activityId) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/laps"+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        LapEffort[] lapEffortsArray =gson.fromJson(result,LapEffort[].class);
        List<LapEffort>lapEfforts= Arrays.asList(lapEffortsArray);
        return lapEfforts;
    }


    @Override
    public List<Comment> findActivityComments(int activityId) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/comments?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Comment[] commentsArray= gson.fromJson(result,Comment[].class);


        List<Comment>comments= Arrays.asList(commentsArray);


        return comments;
    }

    @Override
    public List<Comment> findActivityComments(int activityId,boolean markdown, int page, int per_page) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/comments?access_token="+ accessToken+"&markdown="+markdown+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Comment[] commentsArray= gson.fromJson(result,Comment[].class);


        List<Comment>comments= Arrays.asList(commentsArray);


        return comments;
    }


    @Override
    public List<Athlete> findActivityKudos(int activityId) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/kudos?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findActivityKudos(int activityId, int page, int per_page) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/kudos?access_token="+ accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findClubMembers(int clubId) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/members?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findClubMembers(int clubId,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/members?access_token="+ accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Activity> findClubActivities(int clubId) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/activities"+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>clubActivities= Arrays.asList(activitiesArray);
        return clubActivities;
    }


    @Override
    public List<Activity> findClubActivities(int clubId,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/activities"+"?access_token="+accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>clubActivities= Arrays.asList(activitiesArray);
        return clubActivities;
    }

    @Override
    public Club findClub(int id) {
        String URL="https://www.strava.com/api/v3/clubs/"+id+"?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Club club= gson.fromJson(result,Club.class);

        return club;
    }



    public List<Club> getCurrentAthleteClubs() {
        String URL="https://www.strava.com/api/v3/athlete/clubs?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Club[] clubsArray= gson.fromJson(result,Club[].class);


        List<Club>clubs= Arrays.asList(clubsArray);


        return clubs;
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
    public Segment findSegment(long segmentId) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Segment segment= gson.fromJson(result,Segment.class);
        return segment;
    }


    public List<Segment> getCurrentStarredSegment() {
        String URL="https://www.strava.com/api/v3/segments/starred?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Segment[] segmentsArray= gson.fromJson(result,Segment[].class);


        List<Segment>segments= Arrays.asList(segmentsArray);


        return segments;
    }





    @Override
    public List<Photo> findActivityPhotos(int activityId) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/photos?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        Photo[] photosArray =gson.fromJson(result,Photo[].class);
        List<Photo>photos= Arrays.asList(photosArray);
        return photos;
    }

    @Override
    public SegmentLeaderBoard findSegmentLeaderBoard(long segmentId) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId+"/leaderboard?access_token="+ accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        SegmentLeaderBoard segmentLeaderBoard= gson.fromJson(result,SegmentLeaderBoard.class);
        return segmentLeaderBoard;
    }


    @Override
    public SegmentLeaderBoard findSegmentLeaderBoard(long segmentId, int page, int per_page) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId+"/leaderboard?access_token="+ accessToken+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson= new Gson();
        SegmentLeaderBoard segmentLeaderBoard= gson.fromJson(result,SegmentLeaderBoard.class);
        return segmentLeaderBoard;
    }



    @Override
    public SegmentLeaderBoard findSegmentLeaderBoard(long segmentId, HashMap optionalParameters) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId+"/leaderboard?access_token="+ accessToken;
        String result=getResult(URL,optionalParameters);
        Gson gson= new Gson();
        SegmentLeaderBoard segmentLeaderBoard= gson.fromJson(result,SegmentLeaderBoard.class);
        return segmentLeaderBoard;
    }





    @Override
    public List<Segment> findSegments(Bound bound) {
        String URL="https://www.strava.com/api/v3/segments/explore?access_token="+ accessToken+"&bounds="+bound.toString();
        String result=getResult(URL);


        //////////UGLY HACK TO ALLOW GSON TO PARSE THE JSON STRING AND RETURN A LIST OF SEGMENTS

        String segmentString="\\{\"segments\":";
        if (result.contains(segmentString))
        {
            result=result.replaceFirst(segmentString, "");
            result=result.substring(0,result.lastIndexOf("}"));
        }


        Gson gson= new Gson();
        Segment[]segmentsArray= gson.fromJson(result,Segment[].class);
        List<Segment> segments=Arrays.asList(segmentsArray);
        return segments;
    }

    @Override
    public List<Segment> findSegments(Bound bound, HashMap optionalParameters) {
        String URL="https://www.strava.com/api/v3/segments/explore?access_token="+ accessToken+"&bounds="+bound.toString();
        String result=getResult(URL,optionalParameters);


        //////////UGLY HACK TO ALLOW GSON TO PARSE THE JSON STRING AND RETURN A LIST OF SEGMENTS

        String segmentString="\\{\"segments\":";
        if (result.contains(segmentString))
        {
            result=result.replaceFirst(segmentString, "");
            result=result.substring(0,result.lastIndexOf("}"));
        }


        Gson gson= new Gson();
        Segment[]segmentsArray= gson.fromJson(result,Segment[].class);
        List<Segment> segments=Arrays.asList(segmentsArray);
        return segments;
    }




    @Override
    public SegmentEffort findSegmentEffort(int id) {
        String URL="https://www.strava.com/api/v3/segment_efforts/"+id+"?access_token="+accessToken;
        String result=getResult(URL);
        Gson gson= new Gson();
        SegmentEffort segmentEffort= gson.fromJson(result,SegmentEffort.class);
        return segmentEffort;
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



    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
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
