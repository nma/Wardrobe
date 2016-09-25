package com.nma.wardrobe.dao;

import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.mongodb.BasicDBObject;
import io.swagger.model.Shelf;
import org.jongo.FindOne;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nickma on 2016-04-14.
 */
@Singleton
public class ShelfDao {
    private static final String SHELF_COLLECTION = "wardrobe_shelf";

    private Jongo jongoDriver;
    private MongoCollection mongoCollection;

    @Inject
    public ShelfDao(Jongo jongoDriver) {
        this.jongoDriver = jongoDriver;
        this.mongoCollection = jongoDriver.getCollection(SHELF_COLLECTION);
        createUniqueIndices();
    }

    private void createUniqueIndices() {
        mongoCollection.ensureIndex("{ id: 1}", "{ unique: true }");
    }

    @VisibleForTesting
    void dropCollection() {
        mongoCollection.drop();
    }

    public void save(Shelf shelf) {
        BasicDBObject findQuery = new BasicDBObject("id", shelf.getId());
        FindOne findOne = this.mongoCollection.findOne(findQuery.toString());
        Shelf foundShelf = findOne.as(Shelf.class);
        if (foundShelf != null) {
            this.mongoCollection.update(findQuery.toString()).with(shelf);
        } else {
            this.mongoCollection.save(shelf);
        }
    }

    public List<Shelf> retrieveShelves() {
        List<Shelf> foundShelves = new ArrayList<>();
        mongoCollection.find().as(Shelf.class).forEach(
                foundShelves::add
        );
        return foundShelves;
    }

    public Long count() {
        return mongoCollection.count();
    }
}
