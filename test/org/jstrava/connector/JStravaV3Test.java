package org.jstrava.connector;

import org.jstrava.entities.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.*;


/**
 * Created by roberto on 12/26/13.
 */
public class JStravaV3Test {

    String accessToken;
    @Before
    public void setUp() throws Exception {

        /*REMEMBER TO SETUP YOUR API ACCESS CODE HERE!!!*/

        accessToken ="";

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

        Athlete athlete=strava.findAthlete(5455);
        assertNotNull(athlete);
        assertEquals("Roberto Betancourt", athlete.toString());
        assertFalse(athlete.getBikes().isEmpty());
        assertFalse(athlete.getShoes().isEmpty());
        assertTrue(athlete.getClubs().isEmpty());
    }


    @Test
    public void testFindActivity() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Activity activity= strava.findActivity(101737199);
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
        List<Comment> comments= strava.findActivityComments(100349929);
        assertFalse(comments.isEmpty());
        for (Comment comment:comments)
        {
            System.out.println(comment.getText());
        }

    }


    @Test
    public void testFindActivityKudos() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findActivityKudos(100349929);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println(athlete.toString());
        }

    }

    @Test
    public void testFindAthleteFriends() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findAthleteFriends(5455);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println("Athlete Friends "+athlete.toString());
        }

    }

    @Test
    public void testFindAthleteFollowers() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findAthleteFollowers(5455);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println("Athlete Followers "+athlete.toString());
        }

    }

    @Test
    public void testFindAthleteBothFollowing() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findAthleteBothFollowing(5455);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println("Athletes Both Following "+athlete.toString());
        }

    }



    @Test
    public void testFindGear() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Gear gear= strava.findGear("b1069668");
        assertNotNull(gear);
        System.out.println("Gear Name " + gear.toString());

    }


    @Test
    public void testFindClub() throws Exception {

        JStravaV3 strava= new JStravaV3(accessToken);

        Club club= strava.findClub(4111);
        assertNotNull(club);
        System.out.println("Club Name " + club.toString());

    }


    @Test
    public void testFindClubMembers() throws Exception{

        JStravaV3 strava= new JStravaV3(accessToken);
        List<Athlete> athletes= strava.findClubMembers(4111);
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
        List<Activity> activities= strava.findClubActivities(4111);
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
    

}
