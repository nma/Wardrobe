package com.nma.wardrobe.dao;

import java.util.List;

import org.jongo.Jongo;
import org.jongo.MongoCollection;

import io.swagger.model.Stack;

/**
 * Data Object for coordinating state changes in Mongo.
 *
 * Created by nickma on 2016-04-14.
 */
public class StackDao {
    private static final String STACK_COLLECTION = "wardrobe-stack";

    private Jongo jongoDriver;
    private MongoCollection mongoCollection;

    public StackDao(Jongo jongoDriver) {
        this.jongoDriver = jongoDriver;
        this.mongoCollection = jongoDriver.getCollection(STACK_COLLECTION);
    }

    public List<Stack> retrieveStacks() {
        MongoCollection mongoCollection = jongoDriver.getCollection(STACK_COLLECTION);

        mongoCollection.find().as(Stack.class);
        return null;
    }

    public Stack retrieveStackById(String id) {
        return null;
    }

    public void save(Stack stack) {

    }
}
