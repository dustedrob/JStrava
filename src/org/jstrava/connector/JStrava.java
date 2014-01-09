package org.jstrava.connector;

import org.jstrava.entities.*;

import java.util.HashMap;
import java.util.List;

/**
 * Created by roberto on 12/26/13.
 */
public interface JStrava {



    public Athlete findAthlete(Integer id);
    public List<Athlete> findActivityKudos(Integer activityId);
    public List<Athlete> findAthleteFriends(Integer id);
    public List<Athlete> findAthleteFriends(Integer id, HashMap optionalParameters);
    public List<Athlete> findAthleteFollowers(Integer id);
    public List<Athlete> findAthleteBothFollowing(Integer id);
    public Activity findActivity(Integer id);
    public List<Comment> findActivityComments(Integer activityId);
    public Gear findGear(String id);
    public Club findClub(Integer id);
    public List<Athlete> findClubMembers(Integer clubId);
    public List<Activity> findClubActivities(Integer clubId);
    public SegmentEffort findSegmentEffort(Integer id);
    public List<SegmentEffort> findAthleteKOMs(Integer athleteId);
    public List<Photo>findActivityPhotos(Integer activityId);
}
