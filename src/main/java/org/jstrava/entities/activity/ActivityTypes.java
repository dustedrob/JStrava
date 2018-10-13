package org.jstrava.entities.activity;

public enum ActivityTypes {
    Ride("ride"), Run("run"), Swim("swim"), Workout("workout"), Hike("hike"), Walk("walk"), Nordicski("nordicski"), Alpineski("alpineski"), Iceskate(
	    "iceskate"), Inlineskate("inlineskate"), Rollerski("rollerski"), Windsurf("windsurf"), Snowboard("snowboard"), Snowshoe("snowshoe"), Ebikeride(
	    "ebikeride"), Virtualride("virtualride");

    private String code;

    private ActivityTypes(String value) {
	this.code = value;
    }

    public String getCode() {
	return this.code;
    }
}
