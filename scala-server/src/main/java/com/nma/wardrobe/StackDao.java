package com.nma.wardrobe;

import com.fasterxml.jackson.databind.JsonNode;
import org.jongo.Jongo;
import scala.NotImplementedError;

/**
 * Created by nickma on 2016-04-14.
 */
public class StackDao {

    Jongo jongo;

    public JsonNode retrieveStacksJson() {
        jongo.getCollection("stack");
        return null;
    }

    public JsonNode retrieveStackById(String id) {
        return null;
    }

}
