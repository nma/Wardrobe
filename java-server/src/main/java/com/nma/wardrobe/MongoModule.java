package com.nma.wardrobe;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.mongodb.DB;
import com.mongodb.Mongo;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by nma on 24/09/16.
 */
public class MongoModule extends AbstractModule{
    @Override
    protected void configure() {

    }

    @Provides
    public DB mongoDb() throws UnknownHostException {
        MongoClient mongoClient = new MongoClient();

        return mongoClient.getDB("wardrobe");
    }
}
