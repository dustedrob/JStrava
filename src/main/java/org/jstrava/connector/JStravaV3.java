package org.jstrava.connector;


import com.google.gson.Gson;
import org.jstrava.entities.activity.*;
import org.jstrava.entities.athlete.Athlete;
import org.jstrava.entities.club.Club;
import org.jstrava.entities.gear.Gear;
import org.jstrava.entities.segment.Bound;
import org.jstrava.entities.segment.Segment;
import org.jstrava.entities.segment.SegmentEffort;
import org.jstrava.entities.segment.SegmentLeaderBoard;
import org.jstrava.entities.stream.Stream;

import java.io.*;
import java.net.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class JStravaV3 implements JStrava {

    private String accessToken;
    private Athlete currentAthlete;

    private Gson getGson() {
    	return new Gson(); //GsonBuilder().registerTypeAdapter(Quantity.class, new InterfaceAdapter<Quantity>())
                //.create();
    }
    
    public String getAccessToken() {
        return accessToken;
    }

    @Override
    public Athlete getCurrentAthlete() {
        return currentAthlete;
    }

    @Override
    public Athlete updateAthlete(Map optionalParameters) {
        String URL="https://www.strava.com/api/v3/athlete";
        String result=putResult(URL,optionalParameters);
        Gson gson = getGson();
        Athlete athlete= gson.fromJson(result,Athlete.class);

        return athlete;
    }


    @Override
    public Athlete findAthlete(int id) {

        String URL="https://www.strava.com/api/v3/athletes/"+id;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete athlete= gson.fromJson(result,Athlete.class);

        return athlete;

    }



    @Override
    public List<SegmentEffort> findAthleteKOMs(int athleteId) {
        String URL="https://www.strava.com/api/v3/athletes/"+athleteId+"/koms";
        String result=getResult(URL);
        Gson gson = getGson();
        SegmentEffort[] segmentEffortArray=gson.fromJson(result,SegmentEffort[].class);
        List<SegmentEffort>segmentEfforts= Arrays.asList(segmentEffortArray);
        return segmentEfforts;
    }

    @Override
    public List<SegmentEffort> findAthleteKOMs(int athleteId,int page,int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+athleteId+"/koms?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        SegmentEffort[] segmentEffortArray=gson.fromJson(result,SegmentEffort[].class);
        List<SegmentEffort>segmentEfforts= Arrays.asList(segmentEffortArray);
        return segmentEfforts;
    }

    @Override
    public List<Athlete> getCurrentAthleteFriends() {
        String URL="https://www.strava.com/api/v3/athlete/friends";
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> getCurrentAthleteFriends(int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athlete/friends?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findAthleteFriends(int id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/friends";
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteFriends(int id,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/friends?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> getCurrentAthleteFollowers() {
        String URL="https://www.strava.com/api/v3/athlete/followers";
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> getCurrentAthleteFollowers(int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athlete/followers?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findAthleteFollowers(int id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/followers";
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteFollowers(int id,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/followers?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findAthleteBothFollowing(int id) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/both-following";
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findAthleteBothFollowing(int id,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/athletes/"+id+"/both-following?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public Activity createActivity(String name, String type, String start_date_local, int elapsed_time) {
        String URL="https://www.strava.com/api/v3/activities?name="+name+"&type="+type+"&start_date_local="+start_date_local+"&elapsed_time="+elapsed_time;
        String result=postResult(URL);
        Gson gson = getGson();
        System.out.println("RESULTADO"+result);
        Activity activity=gson.fromJson(result,Activity.class);
        return activity;
    }

    @Override
    public Activity createActivity(String name, String type, String start_date_local, int elapsed_time, String description, float distance) {
        String URL="https://www.strava.com/api/v3/activities?name="+name+"&type="+type+"&start_date_local="+start_date_local+"&elapsed_time="+elapsed_time+"&description="+description+"&distance="+distance;
        String result=postResult(URL);
        Gson gson = getGson();
        Activity activity=gson.fromJson(result,Activity.class);
        return activity;
    }

    @Override
    public void deleteActivity(int activityId) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId;
        String result=deleteResult(URL);
        Gson gson = getGson();
        gson.fromJson(result,String.class);


    }

    @Override
    public Activity findActivity(int id) {
        String URL="https://www.strava.com/api/v3/activities/"+id;
        String result=getResult(URL);
        Gson gson = getGson();
        Activity activity= gson.fromJson(result,Activity.class);

        return activity;
    }

    @Override
    public Activity findActivity(int id,boolean include_all_efforts) {
        String URL="https://www.strava.com/api/v3/activities/"+id+"?include_all_efforts="+include_all_efforts;
        String result=getResult(URL);
        Gson gson = getGson();
        Activity activity= gson.fromJson(result,Activity.class);

        return activity;
    }

    @Override
    public Activity updateActivity(int activityId, Map optionalParameters) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId;
        String result=putResult(URL,optionalParameters);
        Gson gson = getGson();
        Activity activity= gson.fromJson(result,Activity.class);

        return activity;
    }

    @Override
    public List<Activity> getCurrentAthleteActivities() {
        String URL="https://www.strava.com/api/v3/athlete/activities";
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }

    @Override
    public List<Activity> getCurrentAthleteActivities(int page,int per_page) {
        String URL="https://www.strava.com/api/v3/athlete/activities?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }

    @Override
    public List<Activity> getCurrentAthleteActivitiesBeforeDate(long before) {
        String URL="https://www.strava.com/api/v3/athlete/activities?before="+before;
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }

    @Override
    public List<Activity> getCurrentAthleteActivitiesAfterDate(long after) {
        String URL="https://www.strava.com/api/v3/athlete/activities?after="+after;
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentActivities= Arrays.asList(activitiesArray);
        return currentActivities;
    }


    public List<Activity> getCurrentFriendsActivities() {
        String URL="https://www.strava.com/api/v3/activities/following";
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentFriendsActivities= Arrays.asList(activitiesArray);
        return currentFriendsActivities;
    }

    public List<Activity> getCurrentFriendsActivities(int page, int per_page) {
        String URL="https://www.strava.com/api/v3/activities/following?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>currentFriendsActivities= Arrays.asList(activitiesArray);
        return currentFriendsActivities;
    }

    @Override
    public List<Zone> getActivityZones(int activityId) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/zones";
        String result=getResult(URL);
        Gson gson = getGson();
        Zone[] zonesArray=gson.fromJson(result,Zone[].class);
        List<Zone> zones=Arrays.asList(zonesArray);
        return zones;
    }


    @Override
    public List<LapEffort> findActivityLaps(int activityId) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/laps";
        String result=getResult(URL);
        Gson gson = getGson();
        LapEffort[] lapEffortsArray =gson.fromJson(result,LapEffort[].class);
        List<LapEffort>lapEfforts= Arrays.asList(lapEffortsArray);
        return lapEfforts;
    }


    @Override
    public List<Comment> findActivityComments(int activityId) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/comments";
        String result=getResult(URL);
        Gson gson = getGson();
        Comment[] commentsArray= gson.fromJson(result,Comment[].class);


        List<Comment>comments= Arrays.asList(commentsArray);


        return comments;
    }

    @Override
    public List<Comment> findActivityComments(int activityId,boolean markdown, int page, int per_page) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/comments?markdown="+markdown+"&page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Comment[] commentsArray= gson.fromJson(result,Comment[].class);


        List<Comment>comments= Arrays.asList(commentsArray);


        return comments;
    }


    @Override
    public List<Athlete> findActivityKudos(int activityId) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/kudos";
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findActivityKudos(int activityId, int page, int per_page) {
        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/kudos?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Athlete> findClubMembers(int clubId) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/members";
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }

    @Override
    public List<Athlete> findClubMembers(int clubId,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/members?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Athlete[] athletesArray= gson.fromJson(result,Athlete[].class);


        List<Athlete>athletes= Arrays.asList(athletesArray);


        return athletes;
    }


    @Override
    public List<Activity> findClubActivities(int clubId) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/activities";
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>clubActivities= Arrays.asList(activitiesArray);
        return clubActivities;
    }


    @Override
    public List<Activity> findClubActivities(int clubId,int page, int per_page) {
        String URL="https://www.strava.com/api/v3/clubs/"+clubId+"/activities"+"?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        Activity[] activitiesArray =gson.fromJson(result,Activity[].class);
        List<Activity>clubActivities= Arrays.asList(activitiesArray);
        return clubActivities;
    }

    @Override
    public Club findClub(int id) {
        String URL="https://www.strava.com/api/v3/clubs/"+id;
        String result=getResult(URL);
        Gson gson = getGson();
        Club club= gson.fromJson(result,Club.class);

        return club;
    }



    public List<Club> getCurrentAthleteClubs() {
        String URL="https://www.strava.com/api/v3/athlete/clubs";
        String result=getResult(URL);
        Gson gson = getGson();
        Club[] clubsArray= gson.fromJson(result,Club[].class);

        if (clubsArray != null) {
	        final List<Club>clubs= Arrays.asList(clubsArray);
	        return clubs;
        } else return null;
    }


    @Override
    public Gear findGear(String id) {
        String URL="https://www.strava.com/api/v3/gear/"+id;
        String result=getResult(URL);
        Gson gson = getGson();
        Gear gear= gson.fromJson(result,Gear.class);

        return gear;
    }

    @Override
    public Segment findSegment(long segmentId) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId;
        String result=getResult(URL);
        Gson gson = getGson();
        Segment segment= gson.fromJson(result,Segment.class);
        return segment;
    }


    public List<Segment> getCurrentStarredSegment() {
        String URL="https://www.strava.com/api/v3/segments/starred";
        String result=getResult(URL);
        Gson gson = getGson();
        Segment[] segmentsArray= gson.fromJson(result,Segment[].class);


        List<Segment>segments= Arrays.asList(segmentsArray);


        return segments;
    }





    @Override
    public List<Photo> findActivityPhotos(int activityId) {

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/photos";
        String result=getResult(URL);
        Gson gson = getGson();
        Photo[] photosArray =gson.fromJson(result,Photo[].class);
        List<Photo>photos= Arrays.asList(photosArray);
        return photos;
    }

    @Override
    public SegmentLeaderBoard findSegmentLeaderBoard(long segmentId) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId+"/leaderboard";
        String result=getResult(URL);
        Gson gson = getGson();
        SegmentLeaderBoard segmentLeaderBoard= gson.fromJson(result,SegmentLeaderBoard.class);
        return segmentLeaderBoard;
    }


    @Override
    public SegmentLeaderBoard findSegmentLeaderBoard(long segmentId, int page, int per_page) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId+"/leaderboard?page="+page+"&per_page="+per_page;
        String result=getResult(URL);
        Gson gson = getGson();
        SegmentLeaderBoard segmentLeaderBoard= gson.fromJson(result,SegmentLeaderBoard.class);
        return segmentLeaderBoard;
    }



    @Override
    public SegmentLeaderBoard findSegmentLeaderBoard(long segmentId, Map optionalParameters) {
        String URL="https://www.strava.com/api/v3/segments/"+segmentId+"/leaderboard";
        String result=getResult(URL,optionalParameters);
        Gson gson = getGson();
        SegmentLeaderBoard segmentLeaderBoard= gson.fromJson(result,SegmentLeaderBoard.class);
        return segmentLeaderBoard;
    }





    @Override
    public List<Segment> findSegments(Bound bound) {
        String URL="https://www.strava.com/api/v3/segments/explore?bounds="+bound.toString();
        String result=getResult(URL);


        //////////UGLY HACK TO ALLOW GSON TO PARSE THE JSON STRING AND RETURN A LIST OF SEGMENTS

        String segmentString="\\{\"segments\":";

            result=result.replaceFirst(segmentString, "");
            result=result.substring(0,result.lastIndexOf("}"));

        Gson gson = getGson();
        Segment[]segmentsArray= gson.fromJson(result,Segment[].class);
        List<Segment> segments=Arrays.asList(segmentsArray);
        return segments;
    }

    @Override
    public List<Segment> findSegments(Bound bound, Map optionalParameters) {
        String URL="https://www.strava.com/api/v3/segments/explore?bounds="+bound.toString();
        String result=getResult(URL,optionalParameters);


        //////////UGLY HACK TO ALLOW GSON TO PARSE THE JSON STRING AND RETURN A LIST OF SEGMENTS

        String segmentString="\\{\"segments\":";
        if (result.contains(segmentString))
        {
            result=result.replaceFirst(segmentString, "");
            result=result.substring(0,result.lastIndexOf("}"));
        }


        Gson gson = getGson();
        Segment[]segmentsArray= gson.fromJson(result,Segment[].class);
        List<Segment> segments=Arrays.asList(segmentsArray);
        return segments;
    }




    @Override
    public SegmentEffort findSegmentEffort(int id) {
        String URL="https://www.strava.com/api/v3/segment_efforts/"+id;
        String result=getResult(URL);
        Gson gson = getGson();
        SegmentEffort segmentEffort= gson.fromJson(result,SegmentEffort.class);
        return segmentEffort;
    }


    @Override
    public List<Stream> findActivityStreams(int activityId, String[] types) {

        StringBuilder builder= new StringBuilder();

        for (int i=0;i<types.length;i++)
        {
            if (i!=0)
            {
                builder.append(",");
            }
            builder.append(types[i]);
        }

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/streams/"+builder.toString();
        String result= getResult(URL);
        Gson gson = getGson();
        Stream[] streamsArray=gson.fromJson(result,Stream[].class);
        List<Stream> streams=Arrays.asList(streamsArray);
        return streams;

    }

    @Override
    public List<Stream> findActivityStreams(int activityId, String[] types, String resolution, String series_type) {
        StringBuilder builder= new StringBuilder();

        for (int i=0;i<types.length;i++)
        {
            if (i!=0)
            {
                builder.append(",");
            }
            builder.append(types[i]);
        }

        String URL="https://www.strava.com/api/v3/activities/"+activityId+"/streams/"+builder.toString()+"?resolution="+resolution;

        if (series_type!=null && !series_type.isEmpty())
        {
            URL+="&series_type="+series_type;
        }

        String result= getResult(URL);
        Gson gson = getGson();
        Stream[] streamsArray=gson.fromJson(result,Stream[].class);
        List<Stream> streams=Arrays.asList(streamsArray);
        return streams;
    }


    @Override
    public List<Stream> findEffortStreams(int id, String[] types) {
        final StringBuilder builder = new StringBuilder();

        for (int i=0;i<types.length;i++)
        {
            if (i!=0)
            {
                builder.append(",");
            }
            builder.append(types[i]);
        }

        String URL="https://www.strava.com/api/v3/segment_efforts/"+id+"/streams/"+builder.toString();
        String result= getResult(URL);
        Gson gson = getGson();
        Stream[] streamsArray=gson.fromJson(result,Stream[].class);
        List<Stream> streams=Arrays.asList(streamsArray);
        return streams;
    }

    @Override
    public List<Stream> findEffortStreams(int id, String[] types, String resolution, String series_type) {
        final StringBuilder builder = new StringBuilder();

        for (int i=0;i<types.length;i++)
        {
            if (i!=0)
            {
                builder.append(",");
            }
            builder.append(types[i]);
        }

        String URL="https://www.strava.com/api/v3/segment_efforts/"+id+"/streams/"+builder.toString()+"?resolution="+resolution;

        if (series_type!=null && !series_type.isEmpty())
        {
            URL+="&series_type="+series_type;
        }

        String result= getResult(URL);
        Gson gson = getGson();
        Stream[] streamsArray=gson.fromJson(result,Stream[].class);
        List<Stream> streams=Arrays.asList(streamsArray);
        return streams;
    }

    @Override
    public List<Stream> findSegmentStreams(int id, String[] types) {
        final StringBuilder builder = new StringBuilder();

        for (int i=0;i<types.length;i++)
        {
            if (i!=0)
            {
                builder.append(",");
            }
            builder.append(types[i]);
        }

        String URL="https://www.strava.com/api/v3/segments/"+id+"/streams/"+builder.toString();
        String result= getResult(URL);
        Gson gson = getGson();
        Stream[] streamsArray=gson.fromJson(result,Stream[].class);
        List<Stream> streams=Arrays.asList(streamsArray);
        return streams;
    }

    @Override
    public List<Stream> findSegmentStreams(int id, String[] types, String resolution, String series_type) {
        StringBuilder builder= new StringBuilder();

        for (int i=0;i<types.length;i++)
        {
            if (i!=0)
            {
                builder.append(",");
            }
            builder.append(types[i]);
        }

        String URL="https://www.strava.com/api/v3/segments/"+id+"/streams/"+builder.toString()+"?resolution="+resolution;

        if (series_type!=null && !series_type.isEmpty())
        {
            URL+="&series_type="+series_type;
        }

        String result= getResult(URL);
        Gson gson = getGson();
        Stream[] streamsArray=gson.fromJson(result,Stream[].class);
        List<Stream> streams=Arrays.asList(streamsArray);
        return streams;
    }

    @Override
    public UploadStatus uploadActivity(String data_type, File file) {
        return null;
    }

    @Override
    public UploadStatus uploadActivity(String activity_type, String name, String description, int is_private, int trainer, String data_type, String external_id, File file) {
        return null;
    }

    @Override
    public UploadStatus checkUploadStatus(int uploadId) {

        String URL="https://www.strava.com/api/v3/uploads/"+uploadId;
        String result= getResult(URL);
        Gson gson = getGson();
        UploadStatus status=gson.fromJson(result,UploadStatus.class);

        return status;
    }


    public JStravaV3(String access_token){
        this.accessToken = access_token;
        String URL="https://www.strava.com/api/v3/athlete";
        String result=getResult(URL);
        Gson gson = getGson();
        currentAthlete =gson.fromJson(result,Athlete.class);

    }



    private String getResult(String URL){
        StringBuilder sb= new StringBuilder();

        try {
            URL url = new URL(URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization","Bearer "+getAccessToken());

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





    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }



    private String getResult(String URL, Map optionalParameters){
        StringBuilder sb= new StringBuilder();
        sb.append(URL);
        try {

            Iterator iterator= optionalParameters.keySet().iterator();

            int index=0;
            while(iterator.hasNext())
            {
                if (index==0)
                {
                    sb.append("?");
                }
                else
                {
                    sb.append("&");
                }
                String key=(String)iterator.next();
                sb.append(key);
                sb.append("=");
                sb.append(URLEncoder.encode(optionalParameters.get(key).toString(), "UTF-8"));
                index++;
            }



                URI uri = new URI(String.format(sb.toString()));
                URL url= uri.toURL();


            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization","Bearer "+getAccessToken());
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
        catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        return sb.toString();

    }


    private String postResult(String URL){
        StringBuffer sb= new StringBuffer();
        try {

            String finalUrl="";

                String[] parsedUrl=URL.split("\\?");
                String params=URLEncoder.encode(parsedUrl[1], "UTF-8").replace("%3D","=").replace("%26","&");

            URL url= new URL(parsedUrl[0]+"?"+params);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization","Bearer "+getAccessToken());

           conn.setDoOutput(true);
            DataOutputStream wr = new DataOutputStream(conn.getOutputStream());
            wr.writeBytes(params);
            wr.flush();
            wr.close();



            boolean redirect = false;
            // normally, 3xx is redirect
            int status = conn.getResponseCode();
            if (status != HttpURLConnection.HTTP_OK) {
                if (status == HttpURLConnection.HTTP_MOVED_TEMP
                        || status == HttpURLConnection.HTTP_MOVED_PERM
                        || status == HttpURLConnection.HTTP_SEE_OTHER)
                    redirect = true;
            }


            if (redirect) {

                // get redirect url from "location" header field
                String newUrl = conn.getHeaderField("Location");


                // open the new connnection again
                conn = (HttpURLConnection) new URL(newUrl).openConnection();
                conn.setRequestProperty("Accept", "application/json");
                conn.setRequestProperty("Authorization","Bearer "+getAccessToken());



            }

            BufferedReader in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String inputLine;


            while ((inputLine = in.readLine()) != null) {
                sb.append(inputLine);
            }
            in.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        return sb.toString();
    }







    private String putResult(String URL){
        StringBuilder sb= new StringBuilder();

        try {
            String finalUrl="";
            if (URL.contains("?"))
            {
                String[] parsedUrl=URL.split("\\?");
                String params=URLEncoder.encode(parsedUrl[1], "UTF-8");
                finalUrl=parsedUrl[0]+"?"+params;
            }
            else
            {
                finalUrl=URL;
            }

            URL url= new URL(finalUrl);
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization","Bearer "+getAccessToken());
            if (conn.getResponseCode() != 200 | conn.getResponseCode() != 201 ) {
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




    private String putResult(String URL, Map optionalParameters){
        StringBuilder sb= new StringBuilder();
        sb.append(URL);
        try {

            Iterator iterator= optionalParameters.keySet().iterator();

            int index=0;
            while(iterator.hasNext())
            {
                if (index==0)
                {
                    sb.append("?");
                }
                else
                {
                    sb.append("&");
                }
                String key=(String)iterator.next();
                sb.append(key);
                sb.append("=");
                sb.append(URLEncoder.encode(optionalParameters.get(key).toString(), "UTF-8"));
                index++;
            }

            URI uri = new URI(sb.toString());
            URL url= uri.toURL();



            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("PUT");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization","Bearer "+getAccessToken());
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
        catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        return sb.toString();

    }


    private String deleteResult(String URL){
        StringBuilder sb= new StringBuilder();
        sb.append(URL);
        try {


            URI uri = new URI(String.format(sb.toString()));
            URL url= uri.toURL();



            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("DELETE");
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("Authorization","Bearer "+getAccessToken());
            if (conn.getResponseCode() != 204) {
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
        catch (URISyntaxException e) {
            e.printStackTrace();
            return null;
        }
        return sb.toString();

    }

}
