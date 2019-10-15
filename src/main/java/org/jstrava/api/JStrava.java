package org.jstrava.api;


import java.io.File;
import java.util.HashMap;
import java.util.List;
import org.jstrava.entities.*;

/**
 * Created by roberto on 12/26/13.
 */
public interface JStrava {




    Athlete getCurrentAthlete();
    Athlete updateAthlete(HashMap optionalParameters);
    Athlete findAthlete(int id);
    List<SegmentEffort> findAthleteKOMs(int athleteId);
    List<SegmentEffort> findAthleteKOMs(int athleteId, int page, int per_page);
    List<Athlete> getCurrentAthleteFriends();
    List<Athlete> getCurrentAthleteFriends(int page, int per_page);
    List<Athlete> findAthleteFriends(int id);
    List<Athlete> findAthleteFriends(int id, int page, int per_page);
    List<Athlete> getCurrentAthleteFollowers();
    List<Athlete> getCurrentAthleteFollowers(int page, int per_page);
    List<Athlete> findAthleteFollowers(int id);
    List<Athlete> findAthleteFollowers(int id, int page, int per_page);
    List<Athlete> findAthleteBothFollowing(int id);
    List<Athlete> findAthleteBothFollowing(int id, int page, int per_page);
    Activity createActivity(String name, String type, String start_date_local, int elapsed_time);
    Activity createActivity(String name, String type, String start_date_local, int elapsed_time, String description, float distance);
    void deleteActivity(long activityId);
    Activity findActivity(long id);
    Activity findActivity(long id, boolean include_all_efforts);
    Activity updateActivity(long activityId, HashMap optionalParameters);
    List<Activity> getCurrentAthleteActivitiesAll();
    List<Activity> getCurrentAthleteActivities();
    List<Activity> getCurrentAthleteActivities(int page, int per_page);
    List<Activity> getCurrentAthleteActivitiesBeforeDate(long before);
    List<Activity> getCurrentAthleteActivitiesAfterDate(long after);
    List<Activity> getCurrentFriendsActivities();
    List<Activity> getCurrentFriendsActivities(int page, int per_page);
    List<ActivityZone> getActivityZones(long activityId);
    List<LapsItem> findActivityLaps(long activityId);
    List<Comment> findActivityComments(long activityId);
    List<Comment> findActivityComments(long activityId, boolean markdown, int page, int per_page);
    List<Athlete> findActivityKudos(long activityId);
    List<Athlete> findActivityKudos(long activityId, int page, int per_page);
    List<Athlete> findClubMembers(int clubId);
    List<Athlete> findClubMembers(int clubId, int page, int per_page);
    List<Activity> findClubActivities(int clubId);
    List<Activity> findClubActivities(int clubId, int page, int per_page);
    Club findClub(int id);
    List<Club> getCurrentAthleteClubs();
    Gear findGear(String id);

    Route findRoute(int routeId);

    List<Route> findAthleteRoutes(int athleteId);

    Segment findSegment(long segmentId);
    List<Segment> getCurrentStarredSegment();
    SegmentLeaderBoard findSegmentLeaderBoard(long segmentId);
    SegmentLeaderBoard findSegmentLeaderBoard(long segmentId, int page, int per_page);
    SegmentLeaderBoard findSegmentLeaderBoard(long segmentId, HashMap optionalParameters);
    List<Segment>findSegments(double[] bounds);
    List<Segment>findSegments(double[] bounds, HashMap optionalParameters);
    SegmentEffort findSegmentEffort(int id);
    List<Stream>findActivityStreams(long activityId, String[] types);
    List<Stream>findActivityStreams(long activityId, String[] types, String resolution, String series_type);
    List<Stream>findEffortStreams(int id, String[] types);
    List<Stream>findEffortStreams(long activityId, String[] types, String resolution, String series_type);
    List<Stream>findSegmentStreams(long activityId, String[] types);
    List<Stream>findSegmentStreams(long activityId, String[] types, String resolution, String series_type);
    UploadStatus uploadActivity(String data_type, File file);
    UploadStatus uploadActivity(String activity_type, String name, String description, int is_private, int trainer, String data_type, String external_id, File file);
    UploadStatus checkUploadStatus(int uploadId);

}
