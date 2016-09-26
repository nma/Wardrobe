package com.nma.wardrobe;

import com.github.fakemongo.Fongo;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.mongodb.DB;

import java.net.UnknownHostException;

/**
 * @author Nick Ma (nickma38@gmail.com)
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
