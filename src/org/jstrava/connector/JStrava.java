package org.jstrava.connector;

import org.jstrava.entities.Activity;
import org.jstrava.entities.Athlete;
import org.jstrava.entities.Comment;
import org.jstrava.entities.Gear;

import java.util.List;

/**
 * Created by roberto on 12/26/13.
 */
public interface JStrava {



    public Athlete findAthlete(Integer id);
    public List<Athlete> findActivityKudos(Integer activityId);
    public List<Athlete> findAthleteFriends(Integer id);
    public List<Athlete> findAthleteFollowers(Integer id);
    public List<Athlete> findAthleteBothFollowing(Integer id);
    public Activity findActivity(Integer id);
    public List<Comment> findActivityComments(Integer activityId);
    public Gear findGear(String id);
}
