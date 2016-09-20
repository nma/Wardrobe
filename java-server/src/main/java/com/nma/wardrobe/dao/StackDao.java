package com.nma.wardrobe.dao;

import java.util.List;

import org.jongo.Jongo;

import io.swagger.model.Stack;

/**
 * Created by nickma on 2016-04-14.
 */
public class StackDao {

    private Jongo jongoDriver;

    public StackDao(Jongo jongoDriver) {
        this.jongoDriver = jongoDriver;
        //DB db = new MongoClient(new MongoClientURI("mongodb://host:27017,host2:27017/?replicaSet=rs0")).getDB("wardrobe-dev");
        //jongo = new Jongo(db);
    }

    public List<Stack> retrieveStacks() {
        //MongoCollection stacks = jongo.getCollection("stacks");
        return null;
    }

    public Stack retrieveStackById(String id) {
        return null;
    }

    public void save(Stack stack) {
    }
}
