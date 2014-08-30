package org.jstrava.connector;

import org.jstrava.entities.activity.*;
import org.jstrava.entities.athlete.Athlete;
import org.jstrava.entities.club.Club;
import org.jstrava.entities.gear.Gear;
import org.jstrava.entities.segment.Bound;
import org.jstrava.entities.segment.Segment;
import org.jstrava.entities.segment.SegmentEffort;
import org.jstrava.entities.segment.SegmentLeaderBoard;
import org.jstrava.entities.stream.Stream;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * Created by roberto on 12/26/13.
 * Updated by keilw on 08/30/14.
 */
public interface JStrava {

    public Athlete getCurrentAthlete();
    public Athlete updateAthlete(Map optionalParameters);
    public Athlete findAthlete(int id);
    public List<SegmentEffort> findAthleteKOMs(int athleteId);
    public List<SegmentEffort> findAthleteKOMs(int athleteId,int page, int per_page);
    public List<Athlete> getCurrentAthleteFriends();
    public List<Athlete> getCurrentAthleteFriends(int page, int per_page);
    public List<Athlete> findAthleteFriends(int id);
    public List<Athlete> findAthleteFriends(int id, int page, int per_page);
    public List<Athlete> getCurrentAthleteFollowers();
    public List<Athlete> getCurrentAthleteFollowers(int page, int per_page);
    public List<Athlete> findAthleteFollowers(int id);
    public List<Athlete> findAthleteFollowers(int id, int page, int per_page);
    public List<Athlete> findAthleteBothFollowing(int id);
    public List<Athlete> findAthleteBothFollowing(int id, int page, int per_page);
    public Activity createActivity(String name, String type, String start_date_local, int elapsed_time);
    public Activity createActivity(String name, String type, String start_date_local, int elapsed_time, String description, float distance );
    public void deleteActivity(int activityId);
    public Activity findActivity(int id);
    public Activity findActivity(int id,boolean include_all_efforts);
    public Activity updateActivity(int activityId, Map optionalParameters);
    public List<Activity> getCurrentAthleteActivities();
    public List<Activity> getCurrentAthleteActivities( int page, int per_page);
    public List<Activity> getCurrentAthleteActivitiesBeforeDate( long before);
    public List<Activity> getCurrentAthleteActivitiesAfterDate( long after);
    public List<Activity> getCurrentFriendsActivities();
    public List<Activity> getCurrentFriendsActivities( int page, int per_page);
    public List<Zone> getActivityZones (int activityId);
    public List<LapEffort> findActivityLaps(int activityId);
    public List<Comment> findActivityComments(int activityId);
    public List<Comment> findActivityComments(int activityId,boolean markdown, int page, int per_page);
    public List<Athlete> findActivityKudos(int activityId);
    public List<Athlete> findActivityKudos(int activityId,int page, int per_page);
    public List<Photo>findActivityPhotos(int activityId);
    public List<Athlete> findClubMembers(int clubId);
    public List<Athlete> findClubMembers(int clubId,int page, int per_page);
    public List<Activity> findClubActivities(int clubId);
    public List<Activity> findClubActivities(int clubId, int page, int per_page);
    public Club findClub(int id);
    public List<Club> getCurrentAthleteClubs();
    public Gear findGear(String id);
    public Segment findSegment(long segmentId);
    public List<Segment> getCurrentStarredSegment();
    public SegmentLeaderBoard findSegmentLeaderBoard (long segmentId);
    public SegmentLeaderBoard findSegmentLeaderBoard (long segmentId, int page, int per_page);
    public SegmentLeaderBoard findSegmentLeaderBoard (long segmentId, Map optionalParameters);
    public List<Segment>findSegments(Bound bound);
    public List<Segment>findSegments(Bound bound, Map optionalParameters);
    public SegmentEffort findSegmentEffort(int id);
    public List<Stream>findActivityStreams(int activityId,String[]types);
    public List<Stream>findActivityStreams(int activityId,String[]types,String resolution, String series_type);
    public List<Stream>findEffortStreams(int id,String[]types);
    public List<Stream>findEffortStreams(int activityId,String[]types,String resolution,String series_type);
    public List<Stream>findSegmentStreams(int activityId,String[]types);
    public List<Stream>findSegmentStreams(int activityId,String[]types,String resolution,String series_type);
    public UploadStatus uploadActivity(String data_type,File file);
    public UploadStatus uploadActivity(String activity_type,String name,String description,int is_private,int trainer,String data_type,String external_id,File file);
    public UploadStatus checkUploadStatus(int uploadId);

}
