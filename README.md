JStrava
=======

Java Libraries for the Strava API

[![Build Status](https://drone.io/github.com/keilw/JStrava/status.png)](https://drone.io/github.com/keilw/JStrava/latest)

Objective
=======
The objective of the project is to provide a Java wrapper which mirrors as closely as possible the Strava API in it's latest version.


Example Usage
=======

    JStravaV3 strava= new JStravaV3(accessToken);
    Athlete athlete=strava.getCurrentAthlete();
    Athlete anotherAthlete=strava.findAthlete(athleteId);


Setup
=======
Please copy or rename the file:

    /src/test/resources/testconfig.properties.template
to

    /src/test/resources/testconfig.properties

And adjust your application properties like 

    accessToken=<yourAccessToken>
    athleteId=<yourAthleteId>
    [...]

Before running the JUnit tests.


Status
=======
Currently on a pre-release stage. Check out the Issues and Milestone pages to see what's missing.
