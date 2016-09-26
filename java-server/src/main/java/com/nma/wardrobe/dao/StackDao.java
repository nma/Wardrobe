package com.nma.wardrobe.dao;

import java.util.ArrayList;
import java.util.List;

import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import io.swagger.model.Stack;

/**
 * Data Object for coordinating state changes in Mongo.
 *
 * @author Nick Ma (nickma38@gmail.com)
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
        return QueryBuilder.find(mongoCollection, "id", id, Stack.class);
    }

    public void save(Stack stack) {
        QueryBuilder.upsert(mongoCollection, "id", stack.getId(), stack, Stack.class);
    }

    @VisibleForTesting
    void dropCollection() {
        mongoCollection.drop();
    }

    public Stack retrieveStackByName(String name) throws DaoExceptions.NoMatchFound {
        return QueryBuilder.find(mongoCollection, "name", name, Stack.class);
    }

    public long count() {
        return mongoCollection.count();
    }
}
