package com.nma.wardrobe.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mongodb.BasicDBObject;
import com.nma.wardrobe.utils.stream.StreamUtils;
import org.jongo.FindOne;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import io.swagger.model.Stack;

/**
 * Data Object for coordinating state changes in Mongo.
 *
 * Created by nickma on 2016-04-14.
 */
@Singleton
public class StackDao {
    private static final String STACK_COLLECTION = "wardrobe_stack";

    private Jongo jongoDriver;
    private MongoCollection mongoCollection;

    @Inject
    public StackDao(Jongo jongoDriver) {
        this.jongoDriver = jongoDriver;
        this.mongoCollection = jongoDriver.getCollection(STACK_COLLECTION);
        createUniqueIndices();
    }

    private void createUniqueIndices() {
        mongoCollection.ensureIndex("{ id: 1}", "{ unique: true }");
    }

    public List<Stack> retrieveStacks() {
        List<Stack> foundStacks = new ArrayList<>();
        mongoCollection.find().as(Stack.class).forEach(
                foundStacks::add
        );
        return foundStacks;
    }

    public Stack retrieveStackByID(String id) throws DaoExceptions.NoMatchFound {
        BasicDBObject findQuery = new BasicDBObject("id", id);
        Iterable<Stack> iter = mongoCollection.find(findQuery.toString()).as(Stack.class);
        Optional<Stack> optional = StreamUtils.asStream(iter)
                .findFirst();
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new DaoExceptions.NoMatchFound(
                    String.format("No items with id {} found in collection {}", id, STACK_COLLECTION));
        }
    }

    public void save(Stack stack) {
        BasicDBObject findQuery = new BasicDBObject("id", stack.getId());
        FindOne findOne = this.mongoCollection.findOne(findQuery.toString());
        Stack foundStack = findOne.as(Stack.class);
        if (foundStack != null) {
            this.mongoCollection.update(findQuery.toString()).with(stack);
        } else {
            this.mongoCollection.save(stack);
        }
    }

    @VisibleForTesting
    void dropCollection() {
        mongoCollection.drop();
    }

    public Stack retrieveStackByName(String name) throws DaoExceptions.NoMatchFound {
        BasicDBObject findQuery = new BasicDBObject("name", name);
        Iterable<Stack> iter = mongoCollection.find(findQuery.toString()).as(Stack.class);
        Optional<Stack> optional = StreamUtils.asStream(iter)
                .findFirst();
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new DaoExceptions.NoMatchFound(
                    String.format("No items with id {} found in collection {}", name, STACK_COLLECTION));
        }
    }

    public long count() {
        return mongoCollection.count();
    }
}
