package com.nma.wardrobe.dao;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import org.jongo.Jongo;
import org.jongo.MongoCollection;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
@Singleton
public class ShelfToStackDao {

    private static final String SHELF_BELONGS_COLLECTION = "wardrobe_shelf_belongs";

    private Jongo jongoDriver;
    private MongoCollection mongoCollection;

    @Inject
    public ShelfToStackDao(Jongo jongoDriver) {
        this.jongoDriver = jongoDriver;
        this.mongoCollection = jongoDriver.getCollection(SHELF_BELONGS_COLLECTION);
    }
}
