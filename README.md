JStrava
=======

Java Libraries for the Strava API

Objective
=======
The objective of the project is to provide a Java wrapper which mirrors as closely as possible the Strava API in it's latest version.


Example Usage
=======

    JStravaV3 strava= new JStravaV3(accessToken);
    Athlete athlete=strava.getCurrentAthlete();
    Athlete anotherAthlete=strava.findAthlete(athleteId);


Status
=======
Currently on a pre-release stage. Check out the Issues and Milestone pages to see what's missing.
