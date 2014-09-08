package org.jstrava.connector;

import java.lang.reflect.Type;

import javax.measure.Quantity;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

public class QuantityDeserializer implements JsonDeserializer<Quantity> {



	    @Override
	    public Quantity<?> deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
	            throws JsonParseException {
	        try {
	            JsonObject obj = (JsonObject) json;
	            Class clazz = Class.forName(obj.get("class").getAsString());
	            return (Quantity<?>) clazz.newInstance();
	        } catch (Exception e) {
	            throw new JsonParseException(e.getMessage());
	        }
	    }

	}