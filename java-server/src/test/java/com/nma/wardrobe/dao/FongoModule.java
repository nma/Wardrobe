package com.nma.wardrobe.dao;

import com.github.fakemongo.Fongo;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.mongodb.DB;

import java.net.UnknownHostException;

/**
 * Created by nma on 24/09/16.
 */
public class FongoModule extends AbstractModule{
    @Override
    protected void configure() {

    }

    @Provides
    public DB mongoDb() throws UnknownHostException {
        return new Fongo("test").getDB("wardrobe");
    }
}
