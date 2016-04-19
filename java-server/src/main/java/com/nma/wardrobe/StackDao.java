package com.nma.wardrobe;

import com.fasterxml.jackson.databind.JsonNode;
import com.mongodb.DB;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;
import com.nma.wardrobe.app.model.Shelf;
import com.nma.wardrobe.app.model.Stack;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickma on 2016-04-14.
 */
public class StackDao {

    private Jongo jongo;

    public StackDao() {
        //DB db = new MongoClient(new MongoClientURI("mongodb://host:27017,host2:27017/?replicaSet=rs0")).getDB("wardrobe-dev");
        //jongo = new Jongo(db);
    }

    public List<Stack> retrieveStacks() {
        //MongoCollection stacks = jongo.getCollection("stacks");
        return null;
    }

    public JsonNode retrieveStackById(String id) {
        return null;
    }

}
