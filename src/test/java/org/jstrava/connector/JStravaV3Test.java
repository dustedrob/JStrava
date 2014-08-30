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
 * Updated by keilw on 08/30/14
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
			assertFalse(athlete.getBikes().isEmpty());
			assertFalse(athlete.getShoes().isEmpty());
			assertTrue(athlete.getClubs().isEmpty());
		}
	}

	@Test
	public void testUpdateAthlete() throws Exception {

		JStrava strava = new JStravaV3(accessToken);

		final Map optionalParameters = new HashMap();

		double weight = 71;
		optionalParameters.put("weight", weight);
		Athlete athlete = strava.updateAthlete(optionalParameters);
		assertNotNull(athlete);
	}

	@Test
	public void testFindAthleteKOMs() {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<SegmentEffort> efforts = strava.findAthleteKOMs(athleteId);

		assertFalse(efforts.isEmpty());
		for (SegmentEffort effort : efforts) {
			System.out.println("Segment Effort KOM " + effort.toString());

		}

	}

	@Test
	public void testFindAthleteKOMsWithPagination() {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<SegmentEffort> efforts = strava.findAthleteKOMs(athleteId, 2, 1);

		assertFalse(efforts.isEmpty());
		assertTrue(efforts.size() == 1);
		for (SegmentEffort effort : efforts) {
			System.out.println("Segment Effort KOM " + effort.toString());

		}

	}

	@Test
	public void testGetCurrentAthleteFriends() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.getCurrentAthleteFriends();
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Current Athlete Friends " + athlete.toString());
		}

	}

	@Test
	public void testGetCurrentAthleteFriendsWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.getCurrentAthleteFriends(2, 1);
		assertFalse(athletes.isEmpty());
		assertTrue(athletes.size() == 1);
		for (Athlete athlete : athletes) {
			System.out.println("Current Athlete Friends " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteFriends() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findAthleteFriends(athleteId);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Athlete Friends " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteFriendsWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findAthleteFriends(athleteId, 2, 1);
		assertFalse(athletes.isEmpty());
		assertTrue(athletes.size() == 1);
		for (Athlete athlete : athletes) {
			System.out.println("Athlete Friends with pagination "
					+ athlete.toString());
		}

	}

	@Test
	public void testGetCurrentAthleteFollowers() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.getCurrentAthleteFollowers();
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Athlete Followers " + athlete.toString());
		}

	}

	@Test
	public void testGetCurrentAthleteFollowersWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.getCurrentAthleteFollowers(2, 1);
		assertTrue(athletes.size() == 1);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Athlete Followers " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteFollowers() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findAthleteFollowers(athleteId);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Athlete Followers " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteFollowersWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findAthleteFollowers(athleteId, 2, 1);
		assertTrue(athletes.size() == 1);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Athlete Followers " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteBothFollowing() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findAthleteBothFollowing(athleteId);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Athletes Both Following " + athlete.toString());
		}

	}

	@Test
	public void testFindAthleteBothFollowingWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findAthleteBothFollowing(athleteId, 2,
				1);
		assertTrue(athletes.size() == 1);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Athletes Both Following " + athlete.toString());
		}

	}

	@Test
	public void testCreateAndDeleteActivity() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);

		Activity activity = strava.createActivity("Test Manual Activity",
				"ride", "2014-03-14T09:00:00Z", 10);
		assertNotNull(activity);
		System.out.println("Activity Name " + activity.toString());
		Activity activityExtra = strava.createActivity("Test Manual Activity",
				"ride", "2014-03-14T09:00:00Z", 10, "Testing manual creation",
				100);
		assertNotNull(activityExtra);
		System.out.println("Activity Name " + activityExtra.toString());
		strava.deleteActivity(activity.getId());
		strava.deleteActivity(activityExtra.getId());

	}

	@Test
	public void testFindActivity() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
	
			Activity activity = strava.findActivity(activityId);
			assertNotNull(activity);
			System.out.println("Activity Name " + activity.toString());
			assertNotNull(activity.getAthlete());
			System.out.println("Athlete " + activity.getAthlete().getId());
			System.out.println("MAP" + activity.getMap().toString());
	
			assertFalse(activity.getSegment_efforts().isEmpty());
			for (SegmentEffort segmentEffort : activity.getSegment_efforts()) {
				System.out.println("Segment Effort " + segmentEffort.toString());
				System.out.println("  Segment Effort Athlete"
						+ segmentEffort.getAthlete().getId());
				assertNotNull(segmentEffort.getSegment());
				System.out.println("        Matching Segment "
						+ segmentEffort.getSegment().toString());
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testUpdateActivity() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);

		HashMap optionalParameters = new HashMap();

		double weight = 71;
		String description = "Autodromo mañanero";
		String name = "Autodromo en la mañana";
		optionalParameters.put("description", description);
		optionalParameters.put("name", name);
		Activity activity = strava.updateActivity(updateActivityId,
				optionalParameters);
		assertNotNull(activity);
	}

	@Test
	public void testGetCurrentAthleteActivities() {
		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.getCurrentAthleteActivities();
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			System.out.println("Current Athlete Activity "
					+ activity.toString());
		}

	}

	@Test
	public void testGetCurrentAthleteActivitiesWithPagination() {
		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.getCurrentAthleteActivities(2, 1);
		assertTrue(activities.size() == 1);
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			System.out.println("Current Athlete Activity With Pagination "
					+ activity.toString());
		}

	}

	@Test
	public void testGetCurrentFriendsActivities() {
		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.getCurrentFriendsActivities();
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			System.out.println("Friend Activity " + activity.toString());
		}

	}

	@Test
	public void testGetCurrentFriendsActivitiesWithPagination() {
		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.getCurrentFriendsActivities(2, 1);
		assertTrue(activities.size() == 1);
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			System.out.println("Friend Activity " + activity.toString());
		}
	}

	@Test
	public void testFindActivityLaps() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<LapEffort> laps = strava.findActivityLaps(activityId);
	
			assertFalse(laps.isEmpty());
	
			for (LapEffort lap : laps) {
				System.out.println("Lap " + lap.toString());
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
				System.out.println(comment.getText());
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindActivityCommentsWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Comment> comments = strava.findActivityComments(activityId, false,
				2, 1);
		assertTrue(comments.size() == 1);
		assertFalse(comments.isEmpty());
		for (Comment comment : comments) {
			System.out.println(comment.getText());
		}

	}

	@Test
	public void testFindActivityKudos() throws Exception {
		if (hasActivity()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findActivityKudos(activityId);
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				System.out.println(athlete.toString());
			}
		}
	}

	@Test
	public void testFindActivityKudosWithPagination() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findActivityKudos(activityId, 2, 1);
		assertTrue(athletes.size() == 1);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println(athlete.toString());
		}

	}

	/* Expect exception if you dont have an activity with photos */
	@Test(expected = RuntimeException.class)
	public void testFindActivityPhotos() {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Photo> photos = strava.findActivityPhotos(activityId);

		assertFalse(photos.isEmpty());
		for (Photo photo : photos) {
			System.out.println("Photo " + photo.toString());

		}

	}

	@Test
	public void testFindClubMembers() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Athlete> athletes = strava.findClubMembers(clubId);
		assertFalse(athletes.isEmpty());
		for (Athlete athlete : athletes) {
			System.out.println("Club Member " + athlete.toString());
		}

	}

	@Test
	public void testFindClubMembersWithPagination() throws Exception {
		if (clubId>0) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Athlete> athletes = strava.findClubMembers(clubId, 2, 1);
			assertTrue(athletes.size() == 1);
			assertFalse(athletes.isEmpty());
			for (Athlete athlete : athletes) {
				System.out.println("Club Member " + athlete.toString());
			}
		}
	}

	// //////Remove EXPECTED annotation if you point to a club you are member
	// of.
	@Test(expected = RuntimeException.class)
	public void testFindClubActivities() {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			List<Activity> activities = strava.findClubActivities(clubId);
			assertFalse(activities.isEmpty());
			for (Activity activity : activities) {
				System.out.println("Club Activity Name " + activity.toString());
			}
		} else {
			logger.warn("No club found.");
		}
	}

	// //////Remove EXPECTED annotation if you point to a club you are member
	// of.
	@Test(expected = RuntimeException.class)
	public void testFindClubActivitiesWithPagination() {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Activity> activities = strava.findClubActivities(clubId, 2, 1);
		assertTrue(activities.size() == 1);
		assertFalse(activities.isEmpty());
		for (Activity activity : activities) {
			System.out.println("Club Activity Name " + activity.toString());
		}

	}

	@Test
	public void testFindClub() throws Exception {
		if (hasClub()) {
			JStravaV3 strava = new JStravaV3(accessToken);
	
			Club club = strava.findClub(clubId);
			assertNotNull(club);
			System.out.println("Club Name " + club.toString());
		} else {
			logger.warn("No club found.");
		}

	}

	// //////Change assert if you do have clubs
	@Test
	public void testGetCurrentAthleteClubs() {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Club> clubs = strava.getCurrentAthleteClubs();
		assertNotNull(clubs);
		assertTrue(clubs.isEmpty());
		for (Club club : clubs) {
			System.out.println("Club Name " + club.toString());
		}

	}

	@Test
	public void testFindGear() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);

		Gear gear = strava.findGear(gearId);
		assertNotNull(gear);
		System.out.println("Gear Name " + gear.toString());

	}

	@Test
	public void testFindSegment() throws Exception {
		if (hasSegment()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			Segment segment = strava.findSegment(segmentId);
			assertNotNull(segment);
	
			System.out.println("SEGMENT " + segment.toString());
		}
	}

	@Test
	public void testFindCurrentStarredSegments() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Segment> segments = strava.getCurrentStarredSegment();

		assertFalse(segments.isEmpty());

		for (Segment segment : segments) {
			System.out.println("Starred Segment " + segment);
		}
	}

	@Test
	public void testFindSegmentLeaderBoard() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		SegmentLeaderBoard board = strava.findSegmentLeaderBoard(segmentId);
		assertNotNull(board);
		for (LeaderBoardEntry entry : board.getEntries()) {
			System.out.println("Segment LeaderBoard " + entry.toString());
		}

	}

	@Test
	public void testFindSegmentLeaderBoardWithParameters() throws Exception {
		if (hasSegment()) {
			JStravaV3 strava = new JStravaV3(accessToken);
			HashMap optionalParameters = new HashMap();
			optionalParameters.put("gender", "F");
			optionalParameters.put("page", 1);
			optionalParameters.put("per_page", 3);
			SegmentLeaderBoard board = strava.findSegmentLeaderBoard(segmentId,
					optionalParameters);
			assertNotNull(board);
	
			assertTrue(board.getEntries().size() == 3);
			for (LeaderBoardEntry entry : board.getEntries()) {
				assertEquals("F", entry.getAthlete_gender());
				System.out.println("Segment LeaderBoard with Parameters "
						+ entry.toString());
			}
		} else {
			logger.warn("No segment found.");
		}

	}

	@Test
	public void testFindSegmentExplorer() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		Bound bound = new Bound(37.821362, -122.505373, 37.842038, -122.465977);
		List<Segment> segments = strava.findSegments(bound);
		assertNotNull(segments);

		for (Segment segment : segments) {
			System.out.println("Segment Explorer " + segment.toString());
			System.out.println("CLIMB CATEGORY DESCRIPTION"
					+ segment.getClimb_category_desc());
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
				System.out.println("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					System.out.println("STREAM " + stream.getData().get(i));
				}
			}
		} else {
			logger.warn("No activity found.");
		}
	}

	@Test
	public void testFindActivityStreamsWithResolution() throws Exception {

		JStravaV3 strava = new JStravaV3(accessToken);
		List<Stream> streams = strava.findActivityStreams(activityId,
				new String[] { "latlng", "time", "distance" }, "low", null);
		assertNotNull(streams);

		for (Stream stream : streams) {
			System.out.println("STREAM TYPE " + stream.getType());
			for (int i = 0; i < stream.getData().size(); i++) {
				assertEquals("low", stream.getResolution());
				System.out.println("STREAM " + stream.getData().get(i));
			}
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
				System.out.println("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					System.out.println("STREAM " + stream.getData().get(i));
				}
			}
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
				System.out.println("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					assertEquals("low", stream.getResolution());
					System.out.println("STREAM " + stream.getData().get(i));
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
				System.out.println("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					System.out.println("STREAM " + stream.getData().get(i));
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
				System.out.println("STREAM TYPE " + stream.getType());
				for (int i = 0; i < stream.getData().size(); i++) {
					assertEquals("low", stream.getResolution());
					System.out.println("STREAM " + stream.getData().get(i));
				}
			}
		} else {
			logger.warn("No activity found.");
		}
	}
}
