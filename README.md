JStrava
=======

Java Libraries for the Strava API

Objective
=======
The objective of the project is to provide a Java wrapper which mirrors as closely as possible the Strava API in it's latest version.


Example Usage
=======

    /*Finds the currently authenticated athlete*/
   JStravaV3 strava= new JStravaV3(accessToken);
   Athlete athlete=strava.getCurrentAthlete();

       /*Finds another athlete*/
      JStravaV3 strava= new JStravaV3(accessToken);
      Athlete athlete=strava.findAthlete(athleteId);


Status
=======
Currently on a very early stage. Check out the Issues and Milestone pages to see what's missing.
