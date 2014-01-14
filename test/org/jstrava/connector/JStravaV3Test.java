package org.jstrava.connector;

import org.jstrava.entities.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;

import static junit.framework.Assert.*;


/**
 * Created by roberto on 12/26/13.
 */
public class JStravaV3Test {

    String accessToken;
    Integer athleteId;
    Integer activityId;
    Integer clubId;
    String gearId;
    Long segmentId;

    @Before
    public void setUp() throws Exception {

        /*REMEMBER TO SETUP YOUR API ACCESS CODE AND OTHER PARAMETERS HERE!!!*/

        accessToken ="";
        athleteId=0;
        activityId=0;
        clubId=0;
        gearId="";
        segmentId=0L;
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test(expected = RuntimeException.class)
    public void testFailedConnection()
    {

            JStravaV3 strava= new JStravaV3("xxxxxxxx");

    }


    @Test
    public void testJStravaV3() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Athlete athlete=strava.getCurrentAthlete();
        assertNotNull(athlete);

    }



    @Test
    public void testFindAthlete() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Athlete athlete=strava.findAthlete(athleteId);
        assertNotNull(athlete);
        assertFalse(athlete.getBikes().isEmpty());
        assertFalse(athlete.getShoes().isEmpty());
        assertTrue(athlete.getClubs().isEmpty());
    }


    @Test
    public void testFindActivity() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Activity activity= strava.findActivity(activityId);
        assertNotNull(activity);
        System.out.println("Activity Name "+activity.toString());
        assertNotNull(activity.getAthlete());
        System.out.println("Athlete "+activity.getAthlete().getId());
        System.out.println("MAP"+activity.getMap().toString());

        assertFalse(activity.getSegment_efforts().isEmpty());
        for (SegmentEffort segmentEffort: activity.getSegment_efforts())
        {
            System.out.println("Segment Effort "+segmentEffort.toString());
            System.out.println("  Segment Effort Athlete"+segmentEffort.getAthlete().getId());
            assertNotNull(segmentEffort.getSegment());
            System.out.println("        Matching Segment "+segmentEffort.getSegment().toString());
        }

    }

    @Test
    public void testFindActivityComments() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Comment> comments= strava.findActivityComments(activityId);
        assertFalse(comments.isEmpty());
        for (Comment comment:comments)
        {
            System.out.println(comment.getText());
        }

    }


    @Test
    public void testFindActivityKudos() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findActivityKudos(activityId);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println(athlete.toString());
        }

    }

    @Test
    public void testFindAthleteFriends() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findAthleteFriends(athleteId);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println("Athlete Friends "+athlete.toString());
        }

    }

    @Test
    public void testFindAthleteFriendsWithParameters() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        HashMap optionalParameters= new HashMap();
        optionalParameters.put("page",3);
        optionalParameters.put("per_page",1);
        List<Athlete> athletes= strava.findAthleteFriends(athleteId,optionalParameters);
        assertFalse(athletes.isEmpty());

        for (Athlete athlete:athletes)
        {
            System.out.println("OPTIONAL PARAMETER Athlete Friends "+athlete.toString());
        }

    }



    @Test
    public void testFindAthleteFollowers() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findAthleteFollowers(athleteId);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println("Athlete Followers "+athlete.toString());
        }

    }

    @Test
    public void testFindAthleteBothFollowing() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findAthleteBothFollowing(athleteId);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println("Athletes Both Following "+athlete.toString());
        }

    }



    @Test
    public void testFindGear() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Gear gear= strava.findGear(gearId);
        assertNotNull(gear);
        System.out.println("Gear Name " + gear.toString());

    }


    @Test
    public void testFindClub() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Club club= strava.findClub(clubId);
        assertNotNull(club);
        System.out.println("Club Name " + club.toString());

    }


    @Test
    public void testFindClubMembers() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findClubMembers(clubId);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println("Club Member "+athlete.toString());
        }

    }

    ////////Remove EXPECTED annotation if you point to a club you are member of.
    @Test(expected=RuntimeException.class)
    public void testFindClubActivities(){

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Activity> activities= strava.findClubActivities(clubId);
        assertFalse(activities.isEmpty());
        for (Activity activity:activities)
        {
            System.out.println("Club Activity Name "+activity.toString());
        }

    }



    ////////Change assert if you do have clubs
    @Test
    public void testGetCurrentAthleteClubs(){

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Club> clubs= strava.getCurrentAthleteClubs();
        assertTrue(clubs.isEmpty());
        for (Club club:clubs)
        {
            System.out.println("Club Name " + club.toString());
        }

    }






    @Test
    public void testFindAthleteKOMs(){

        JStravaV3 strava= new JStravaV3(accessToken);
        List<SegmentEffort> efforts= strava.findAthleteKOMs(athleteId);

        assertFalse(efforts.isEmpty());
        for (SegmentEffort effort:efforts)
        {
            System.out.println("Segment Effort KOM " + effort.toString());

        }

    }



    /*Expect exception if you dont have an activity with photos*/
    @Test(expected = RuntimeException.class)
    public void testFindActivityPhotos(){

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Photo> photos= strava.findActivityPhotos(activityId);

        assertFalse(photos.isEmpty());
        for (Photo photo: photos)
        {
            System.out.println("Photo " + photo.toString());

        }

    }

    @Test
    public void testFindSegmentLeaderBoard() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        SegmentLeaderBoard board= strava.findSegmentLeaderBoard(segmentId);
        assertNotNull(board);
        for (LeaderBoardEntry entry:board.getEntries())
        {
            System.out.println("Segment LeaderBoard "+entry.toString());
        }

    }

    @Test
    public void testFindSegmentLeaderBoardWithParameters() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        HashMap optionalParameters= new HashMap();
        optionalParameters.put("page",1);
        optionalParameters.put("per_page",1);
        SegmentLeaderBoard board= strava.findSegmentLeaderBoard(segmentId,optionalParameters);
        assertNotNull(board);

        for (LeaderBoardEntry entry:board.getEntries())
        {
            System.out.println("Segment LeaderBoard "+entry.toString());
        }

    }

    @Test
    public void testFindSegment() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        Segment segment= strava.findSegment(segmentId);
        assertNotNull(segment);

        System.out.println("SEGMENT "+segment.toString());
    }


    @Test
    public void testFindCurrentStarredSegments() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Segment>segments=strava.getCurrentStarredSegment();

        assertFalse(segments.isEmpty());

        for (Segment segment:segments)
        {
            System.out.println("Starred Segment "+ segment);
        }
    }


    @Test
    public void testFindActivityLaps() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<LapEffort>laps=strava.findActivityLaps(activityId);

        assertFalse(laps.isEmpty());

        for (LapEffort lap:laps)
        {
            System.out.println("Lap "+ lap.toString());
        }
    }





}
