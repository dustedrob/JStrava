package org.jstrava.connector;

import org.jstrava.entities.Activity;
import org.jstrava.entities.Athlete;
import org.jstrava.entities.Comment;

import java.util.List;

/**
 * Created by roberto on 12/26/13.
 */
public interface JStrava {



    public Athlete findAthlete(Integer id);
    public Activity findActivity(Integer id);
    public List<Comment> findActivityComments(Integer activityId);
    public List<Athlete> findActivityKudos(Integer activityId);
}
