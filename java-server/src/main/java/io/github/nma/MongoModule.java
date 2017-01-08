package io.github.nma;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * @author Nick Ma (nickma38@gmail.com)
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
