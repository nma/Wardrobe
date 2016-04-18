package com.nma.wardrobe;

import com.fasterxml.jackson.databind.JsonNode;
import com.nma.wardrobe.app.model.Shelf;
import com.nma.wardrobe.app.model.Stack;
import scala.collection.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickma on 2016-04-18.
 */
public class ModelParsers {

    private Shelf parseShelf(JsonNode node) {
        return null;
    }

    private Stack parseStack(JsonNode node) {
        List<Shelf> shelfList = new ArrayList<>();
        node.get("shelves").forEach(jsonNode -> shelfList.add(parseShelf(jsonNode)));

        return new Stack(
                node.get("id").asInt(),
                node.get("name").asText(),
                node.get("authGroup").asText(),
                (scala.collection.immutable.List<Shelf>) JavaConversions.iterableAsScalaIterable(shelfList)
        );
    }

}
