package com.nma.wardrobe.dao;

import com.google.common.annotations.VisibleForTesting;
import com.google.inject.Inject;
import com.mongodb.BasicDBObject;
import com.mongodb.BasicDBObjectBuilder;
import io.swagger.model.Drawer;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
public class DrawerDao {

    private static final String DRAWER_COLLECTION = "wardrobe_drawer";

    private Jongo jongoDriver;
    private MongoCollection mongoCollection;

    @Inject
    public DrawerDao(Jongo jongoDriver) {
        this.jongoDriver = jongoDriver;
        this.mongoCollection = jongoDriver.getCollection(DRAWER_COLLECTION);
        createUniqueIndices();
    }

    private void createUniqueIndices() {
        mongoCollection.ensureIndex("{ id: 1}", "{ unique: true }");
    }

    public List<Drawer> retrieveDrawers() {
        List<Drawer> foundShelves = new ArrayList<>();
        mongoCollection.find().as(Drawer.class).forEach(
                foundShelves::add
        );
        return foundShelves;
    }

    @VisibleForTesting
    void dropCollection() {
        mongoCollection.drop();
    }

    public void save(Drawer drawer) {
        QueryBuilder.upsert(this.mongoCollection, "id", drawer.getId(), drawer, Drawer.class);
    }

    public Drawer retrieveDrawerbyID(String id) throws DaoExceptions.NoMatchFound {
        return QueryBuilder.find(mongoCollection, "id", id, Drawer.class);
    }

    public Drawer retrieveDrawerbyDateAdded(Date dateAdded) throws DaoExceptions.NoMatchFound {
        BasicDBObject query = new BasicDBObject();
        query.put("dateAdded", BasicDBObjectBuilder.start("$gte", dateAdded).add("$lte", dateAdded).get());

        return QueryBuilder.find(mongoCollection, query, Drawer.class);
    }

    public long count() {
        return mongoCollection.count();
    }
}
