package com.nma.wardrobe.dao;

import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.swagger.model.Shelf;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Nick Ma (nickma38@gmail.com)
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
        QueryBuilder.upsert(mongoCollection, "id", shelf.getId(), shelf, Shelf.class);
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

    public Shelf retrieveShelfbyID(String id) throws DaoExceptions.NoMatchFound {
        return QueryBuilder.find(mongoCollection, "id", id, Shelf.class);
    }

    public Shelf retrieveShelfByName(String name) throws DaoExceptions.NoMatchFound {
        return QueryBuilder.find(mongoCollection, "name", name, Shelf.class);
    }
}
