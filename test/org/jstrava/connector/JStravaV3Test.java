package org.jstrava.connector;

import org.jstrava.entities.Activity;
import org.jstrava.entities.Athlete;
import org.jstrava.entities.Comment;
import org.jstrava.entities.SegmentEffort;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static junit.framework.Assert.*;


/**
 * Created by roberto on 12/26/13.
 */
public class JStravaV3Test {
    @Before
    public void setUp() throws Exception {

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

        JStravaV3 strava= new JStravaV3("f1680106c792fac952c650441ed80ff697a7b24d");

        Athlete athlete=strava.getCurrentAthlete();
        assertNotNull(athlete);

    }



    @Test
    public void testFindAthlete() throws Exception {

        JStravaV3 strava= new JStravaV3("f1680106c792fac952c650441ed80ff697a7b24d");

        Athlete athlete=strava.findAthlete(5455);
        assertNotNull(athlete);
        assertEquals("Roberto Betancourt", athlete.toString());
        assertFalse(athlete.getBikes().isEmpty());
        assertFalse(athlete.getShoes().isEmpty());
        assertTrue(athlete.getClubs().isEmpty());
    }


    @Test
    public void testFindActivity() throws Exception {

        JStravaV3 strava= new JStravaV3("f1680106c792fac952c650441ed80ff697a7b24d");

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

        JStravaV3 strava= new JStravaV3("f1680106c792fac952c650441ed80ff697a7b24d");
        List<Comment> comments= strava.findActivityComments(100349929);
        assertFalse(comments.isEmpty());
        for (Comment comment:comments)
        {
            System.out.println(comment.getText());
        }

    }


    @Test
    public void testFindActivityKudos() throws Exception{

        JStravaV3 strava= new JStravaV3("f1680106c792fac952c650441ed80ff697a7b24d");
        List<Athlete> athletes= strava.findActivityKudos(100349929);
        assertFalse(athletes.isEmpty());
        for (Athlete athlete:athletes)
        {
            System.out.println(athlete.toString());
        }

    }

}
