/**
 * Copyright (c) 2014, 2015 Roberto Betancourt, Werner Keil
 * 
 * See LICENSE for details.
 */
package org.jstrava.connector;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.jstrava.entities.activity.Activity;
import org.jstrava.entities.activity.Comment;
import org.jstrava.entities.activity.LapEffort;
import org.jstrava.entities.activity.Photo;
import org.jstrava.entities.athlete.Athlete;
import org.jstrava.entities.club.Club;
import org.jstrava.entities.gear.Gear;
import org.jstrava.entities.segment.*;
import org.jstrava.entities.stream.Stream;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import static org.junit.Assert.*;

/**
 * Created by roberto on 12/26/13.
 * Updated by keilw on 22/02/15.
 */
public class JStravaV3Test {
	private static final Logger logger = LogManager.getLogger();
	private static String accessToken;
	private static int athleteId;
	private static int activityId;
	private static int updateActivityId;
	private static int clubId;
	private static String gearId;
	private static long segmentId;

	private static boolean hasAthlete() {
		return athleteId > 0;
	}
	
	private static boolean hasActivity() {
		return activityId > 0;
	}
	
	private static boolean hasClub() {
		return clubId > 0;
	}
	
	private static boolean hasGear() {
		return gearId != null && gearId.length() > 0;
	}
	
	private static boolean hasSegment() {
		return segmentId > 0;
	}
	
	@BeforeClass
    public static void setUpClass() throws Exception {  	
		final Properties config = new Properties();
		config.load(JStravaV3Test.class.getResourceAsStream("/testconfig.properties"));
		
        accessToken = config.getProperty("accessToken");
        athleteId = Integer.parseInt(config.getProperty("athleteId", "0"));
        activityId = Integer.parseInt(config.getProperty("activityId", "0"));
        clubId = Integer.parseInt(config.getProperty("clubId", "0"));
        gearId = config.getProperty("gearId");
        segmentId = Long.parseLong(config.getProperty("segmentId", "0"));
        updateActivityId = Integer.parseInt(config.getProperty("updateActivityId", "0"));
    }

	@AfterClass
	public static void tearDownClass() throws Exception {

	}

	@Test(expected = RuntimeException.class)
	public void testFailedConnection() {

		@SuppressWarnings("unused")
		JStravaV3 strava = new JStravaV3("xxxxxxxx");

	}

	@Test
	public void testJStravaV3() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);

		Athlete athlete = strava.getCurrentAthlete();
		assertNotNull(athlete);

	}

	@Test
	public void testFindAthlete() throws Exception {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			
			Athlete athlete = strava.findAthlete(athleteId);
			assertNotNull(athlete);
			if (athlete.getBikes() != null) {
				assertFalse(athlete.getBikes().isEmpty());
			}
			if (athlete.getShoes() != null) {
				assertFalse(athlete.getShoes().isEmpty());
			}
			if (athlete.getClubs() != null) {
				assertTrue(athlete.getClubs().isEmpty());
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Test
	@Ignore
	public void testUpdateAthlete() throws Exception {

		JStrava strava = new JStravaV3(accessToken);

		@SuppressWarnings("rawtypes")
		final Map optionalParameters = new HashMap();

		optionalParameters.put("weight", 71);
		Athlete athlete = strava.updateAthlete(optionalParameters);
		assertNotNull(athlete);
	}

	@Test
	@Ignore
	public void testFindAthleteKOMs() {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<SegmentEffort> efforts = strava.findAthleteKOMs(athleteId);
	
			assertFalse(efforts.isEmpty());
			for (SegmentEffort effort : efforts) {
				logger.debug("Segment Effort KOM " + effort.toString());
	
			}
		} else {
			logger.warn("No athlete found.");
		}
	}

	@Test
	@Ignore
	public void testFindAthleteKOMsWithPagination() {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<SegmentEffort> efforts = strava.findAthleteKOMs(athleteId, 2, 1);
	
			assertFalse(efforts.isEmpty());
			assertTrue(efforts.size() == 1);
			for (SegmentEffort effort : efforts) {
				logger.debug("Segment Effort KOM " + effort.toString());
	
			}
		} else {
			logger.warn("No athlete found.");
		}

	}

	@Test
	public void testGetCurrentAthleteFriends() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.getCurrentAthleteFriends();
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			logger.debug("Current Athlete Friends " + athlete.toString());
		}

	}

	@Test
	public void testGetCurrentAthleteFriendsWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.getCurrentAthleteFriends(2, 1);
		assertFalse(athletes.isEmpty());
		assertTrue(athletes.size() == 1);
		for (Athlete athlete : athletes) {
			logger.info("Current Athlete Friends (Pagination) " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteFriends() throws Exception {
		if(hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findAthleteFriends(athleteId);
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				logger.info("Athlete Friends " + athlete.toString());
			}
		} else {
			logger.warn("No athlete found.");
		}
	}

	@Test
	public void testFindAthleteFriendsWithPagination() throws Exception {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findAthleteFriends(athleteId, 2, 1);
			assertFalse(athletes.isEmpty());
			assertTrue(athletes.size() == 1);
			for (Athlete athlete : athletes) {
				logger.debug("Athlete Friends with pagination "
						+ athlete.toString());
			}
		} else {
			logger.warn("No athlete found.");
		}
	}

	@Test
	@Ignore
	public void testGetCurrentAthleteFollowers() throws Exception {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.getCurrentAthleteFollowers();
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				logger.debug("Athlete Followers " + athlete.toString());
			}
		} else {
			logger.warn("No athlete found.");
		}	
	}

	@Test
	public void testGetCurrentAthleteFollowersWithPagination() throws Exception {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.getCurrentAthleteFollowers(2, 1);
			if (athletes.isEmpty()) {
				logger.warn("No athlete followers.");
			} else {
				assertFalse(athletes.isEmpty());
				assertTrue(athletes.size() == 1);
				for (Athlete athlete : athletes) {
					logger.debug("Athlete Followers " + athlete.toString());
				}
			}
		} else {
			logger.warn("No athlete found.");
		}
	}

	@Test
	public void testFindAthleteFollowers() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findAthleteFollowers(athleteId);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			logger.info("Athlete Followers " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteFollowersWithPagination() throws Exception {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findAthleteFollowers(athleteId, 2, 1);
			assertTrue(athletes.size() == 1);
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				logger.debug("Athlete Followers " + athlete.toString());
			}
		} else {
			logger.warn("No athlete found.");
		}

	}

	@Test
	@Ignore
	public void testFindAthleteBothFollowing() throws Exception {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findAthleteBothFollowing(athleteId);
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				logger.debug("Athletes Both Following " + athlete.toString());
			}
		} else {
			logger.warn("No athlete found.");
		}
	}

	@Test
	@Ignore
	public void testFindAthleteBothFollowingWithPagination() throws Exception {
		if (hasAthlete()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findAthleteBothFollowing(athleteId, 2,
					1);
			assertTrue(athletes.size() == 1);
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				logger.debug("Athletes Both Following " + athlete.toString());
			}
		} else {
			logger.warn("No athlete found.");
		}

	}

	@Test
	@Ignore
	public void testCreateAndDeleteActivity() throws Exception {
		JStravaV3 strava = new JStravaV3(accessToken);

		Activity activity = strava.createActivity("Test Manual Activity",
				"ride", "2014-09-14T09:00:00Z", 10);
		assertNotNull(activity);
		logger.debug("Activity Name " + activity.toString());
		Activity activityExtra = strava.createActivity("Test Manual Activity",
				"ride", "2014-09-14T09:00:00Z", 10, "Testing manual creation",
				100);
		assertNotNull(activityExtra);
		logger.debug("Activity Name " + activityExtra.toString());
		strava.deleteActivity(activity.getId());
		strava.deleteActivity(activityExtra.getId());
	}

	@Test
	@Ignore
	public void testFindActivity() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
	
			Activity activity = strava.findActivity(activityId);
			assertNotNull(activity);
			logger.info("Activity Name " + activity.toString());
			assertNotNull(activity.getAthlete());
			logger.info("Athlete " + activity.getAthlete().getId());
			logger.info("MAP" + activity.getMap().toString());
	
			assertFalse(activity.getSegment_efforts().isEmpty());
			for (SegmentEffort segmentEffort : activity.getSegment_efforts()) {
				logger.debug("Segment Effort " + segmentEffort.toString());
				logger.debug("  Segment Effort Athlete"
						+ segmentEffort.getAthlete().getId());
				assertNotNull(segmentEffort.getSegment());
				logger.debug("        Matching Segment "
						+ segmentEffort.getSegment().toString());
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	@Ignore
	public void testUpdateActivity() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);

		Map optionalParameters = new HashMap();

//		double weight = 71;
		String description = "Autodromo mañanero";
		String name = "Autodromo en la mañana";
		optionalParameters.put("description", description);
		optionalParameters.put("name", name);
		Activity activity = strava.updateActivity(updateActivityId,
				optionalParameters);
		assertNotNull(activity);
	}

	@Test
	@Ignore
	public void testGetCurrentAthleteActivities() {
		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.getCurrentAthleteActivities();
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			logger.debug("Current Athlete Activity "
					+ activity.toString());
		}

	}

	@Test
	@Ignore("adding primitive methods to Activity or register quantity")
	public void testGetCurrentAthleteActivitiesWithPagination() {
		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.getCurrentAthleteActivities(2, 1);
		assertTrue(activities.size() == 1);
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			logger.debug("Current Athlete Activity With Pagination "
					+ activity.toString());
		}

	}

	@Test
	@Ignore
	public void testGetCurrentFriendsActivities() {
		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.getCurrentFriendsActivities();
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			logger.debug("Friend Activity " + activity.toString());
		}

	}

	@Test
	@Ignore
	public void testGetCurrentFriendsActivitiesWithPagination() {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Activity> activities = strava.getCurrentFriendsActivities(2, 1);
			assertTrue(activities.size() == 1);
			assertFalse(activities.isEmpty());
			for (Activity activity : activities) {
				logger.debug("Friend Activity " + activity.toString());
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	@Ignore
	public void testFindActivityLaps() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<LapEffort> laps = strava.findActivityLaps(activityId);
	
			assertFalse(laps.isEmpty());
	
			for (LapEffort lap : laps) {
				logger.debug("Lap " + lap.toString());
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindActivityComments() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Comment> comments = strava.findActivityComments(activityId);
			assertFalse(comments.isEmpty());
			for (Comment comment : comments) {
				logger.info(comment.getText());
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindActivityCommentsWithPagination() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Comment> comments = strava.findActivityComments(activityId, false,
					2, 1);
			if (!comments.isEmpty()) {
				assertEquals(1, comments.size());
				assertFalse(comments.isEmpty());
				for (Comment comment : comments) {
					logger.debug(comment.getText());
				}
			} else {
				logger.warn("No comments found.");
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindActivityKudos() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findActivityKudos(activityId);
			if (!athletes.isEmpty()) {
				assertFalse(athletes.isEmpty());
				for (Athlete athlete : athletes) {
					logger.debug(athlete.toString());
				}
			} else {
				logger.warn("No athletes found.");
			}
		}
	}

	@Test
	public void testFindActivityKudosWithPagination() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findActivityKudos(activityId, 2, 1);
			if (!athletes.isEmpty()) {
				assertEquals(1, athletes.size());
				assertFalse(athletes.isEmpty());
				for (Athlete athlete : athletes) {
					logger.debug(athlete.toString());
				}
			} else {
				logger.warn("No athletes found.");
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	/* Expect exception if you dont have an activity with photos */
//	@Test(expected = RuntimeException.class)
	@Test
	@Ignore
	public void testFindActivityPhotos() {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Photo> photos = strava.findActivityPhotos(activityId);
	
			assertFalse(photos.isEmpty());
			for (Photo photo : photos) {
				logger.debug("Photo " + photo.toString());
	
			}
		} else {
			logger.warn("No activity found.");
		}

	}

	@Test
	public void testFindClubMembers() throws Exception {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findClubMembers(clubId);
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				logger.debug("Club Member " + athlete.toString());
			}
		} else {
			logger.warn("No club found.");
		}
	}

	@Test
	public void testFindClubMembersWithPagination() throws Exception {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findClubMembers(clubId, 2, 1);
			if (!athletes.isEmpty()) {
				assertTrue(athletes.size() == 1);
				assertFalse(athletes.isEmpty());
				for (Athlete athlete : athletes) {
					logger.debug("Club Member " + athlete.toString());
				}
			} else {
				logger.warn("No athletes found for club " + clubId + ".");
			}
		}
	}

	// //////Remove EXPECTED annotation if you point to a club you are member
	// of.
//	@Test(expected = RuntimeException.class)
	@Test
	@Ignore
	public void testFindClubActivities() {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Activity> activities = strava.findClubActivities(clubId);
			assertFalse(activities.isEmpty());
			for (Activity activity : activities) {
				logger.debug("Club Activity Name " + activity.toString());
			}
		} else {
			logger.warn("No club found.");
		}
	}

	// //////Remove EXPECTED annotation if you point to a club you are member
	// of.
//	@Test(expected = RuntimeException.class)
	@Test
	public void testFindClubActivitiesWithPagination() {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Activity> activities = strava.findClubActivities(clubId, 2, 1);
			assertNotNull(activities);
			if (!activities.isEmpty()) {
				assertTrue(activities.size() == 1);
				assertFalse(activities.isEmpty());
				for (Activity activity : activities) {
					logger.debug("Club Activity Name " + activity.toString());
				}
			} else {
				logger.warn("No activity found in club " + clubId + ".");
			}
		} else {
			logger.warn("No club found.");
		}
	}

	@Test
	public void testFindClub() throws Exception {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
	
			Club club = strava.findClub(clubId);
			assertNotNull(club);
			logger.debug("Club Name " + club.toString());
		} else {
			logger.warn("No club found.");
		}

	}

	// //////Change assert if you do have clubs
	@Test
	public void testGetCurrentAthleteClubs() {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Club> clubs = strava.getCurrentAthleteClubs();
			assertNotNull(clubs);
			assertFalse(clubs.isEmpty());
			for (Club club : clubs) {
				logger.info("Club Name " + club.toString() + " (" + club.getId() + ")");
			}
		} else {
			logger.warn("No club found.");
		}
	}

	@Test
	public void testFindGear() throws Exception {
		if (hasGear()) {
			JStravaV3 strava = new JStravaV3(accessToken);
	
			Gear gear = strava.findGear(gearId);
			assertNotNull(gear);
			logger.debug("Gear Name " + gear.toString());
		} else {
			logger.warn("No gear found.");
		}
	}

	@Test
	public void testFindSegment() throws Exception {
		if (hasSegment()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			Segment segment = strava.findSegment(segmentId);
			assertNotNull(segment);
	
			logger.debug("SEGMENT " + segment.toString());
		}
	}

	@Test
	public void testFindCurrentStarredSegments() throws Exception {
		if (hasSegment()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Segment> segments = strava.getCurrentStarredSegment();
	
			assertFalse(segments.isEmpty());
	
			for (Segment segment : segments) {
				logger.debug("Starred Segment " + segment);
			}
		} else {
			logger.warn("No segment found.");
		}
	}

	@Test
	public void testFindSegmentLeaderBoard() throws Exception {
		if (hasSegment()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			SegmentLeaderBoard board = strava.findSegmentLeaderBoard(segmentId);
			assertNotNull(board);
			for (LeaderBoardEntry entry : board.getEntries()) {
				logger.debug("Segment LeaderBoard " + entry.toString());
			}
		} else {
			logger.warn("No segment found.");
		}
	}

	@Test
	public void testFindSegmentLeaderBoardWithParameters() throws Exception {
		if (hasSegment()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			final HashMap optionalParameters = new HashMap();
			optionalParameters.put("gender", "F");
			optionalParameters.put("page", 1);
			optionalParameters.put("per_page", 3);
			SegmentLeaderBoard board = strava.findSegmentLeaderBoard(segmentId,
					optionalParameters);
			assertNotNull(board);
	
			assertTrue(board.getEntries().size() == 3);
			for (LeaderBoardEntry entry : board.getEntries()) {
				assertEquals("F", entry.getAthlete_gender());
				logger.debug("Segment LeaderBoard with Parameters "
						+ entry.toString());
			}
		} else {
			logger.warn("No segment found.");
		}

	}

	@Test
	public void testFindSegmentExplorer() throws Exception {
		if (hasSegment()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			Bound bound = new Bound(37.821362, -122.505373, 37.842038, -122.465977);
			List<Segment> segments = strava.findSegments(bound);
			assertNotNull(segments);
	
			for (Segment segment : segments) {
				logger.debug("Segment Explorer " + segment.toString());
				logger.debug("CLIMB CATEGORY DESCRIPTION"
						+ segment.getClimb_category_desc());
			}
		} else {
			logger.warn("No segment found.");
		}

	}

	@Test
	public void testFindActivityStreams() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Stream> streams = strava.findActivityStreams(activityId,
					new String[] { "latlng", "time", "distance" });
			assertNotNull(streams);
	
			for (Stream stream : streams) {
				logger.debug("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					logger.debug("STREAM " + stream.getData().get(i));
				}
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindActivityStreamsWithResolution() throws Exception {
		if (hasActivity()) {
		JStravaV3 strava = new JStravaV3(accessToken);
			List<Stream> streams = strava.findActivityStreams(activityId,
					new String[] { "latlng", "time", "distance" }, "low", null);
			assertNotNull(streams);
	
			for (Stream stream : streams) {
				logger.debug("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					assertEquals("low", stream.getResolution());
					logger.debug("STREAM " + stream.getData().get(i));
				}
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindEffortStreams() throws Exception {
		if (activityId > 0) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Stream> streams = strava.findEffortStreams(activityId,
					new String[] { "latlng", "time", "distance" });
			assertNotNull(streams);
	
			for (Stream stream : streams) {
				logger.debug("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					logger.debug("STREAM " + stream.getData().get(i));
				}
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindEffortStreamsWithResolution() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Stream> streams = strava.findEffortStreams(activityId,
					new String[] { "latlng", "time", "distance" }, "low", null);
			assertNotNull(streams);
	
			for (Stream stream : streams) {
				logger.debug("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					assertEquals("low", stream.getResolution());
					logger.debug("STREAM " + stream.getData().get(i));
				}
			}
		}
	}

	@Test
	public void testFindSegmentStreams() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Stream> streams = strava.findActivityStreams(activityId,
					new String[] { "latlng", "time", "distance" });
			assertNotNull(streams);
	
			for (Stream stream : streams) {
				logger.debug("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					logger.debug("STREAM " + stream.getData().get(i));
				}
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindSegmentStreamsWithResolution() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Stream> streams = strava.findActivityStreams(activityId,
					new String[] { "latlng", "time", "distance" }, "low", null);
			assertNotNull(streams);
	
			for (Stream stream : streams) {
				logger.debug("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					assertEquals("low", stream.getResolution());
					logger.debug("STREAM " + stream.getData().get(i));
				}
			}
		} else {
			logger.warn("No activity found.");
		}
	}
}
