package com.nma.wardrobe;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.mongodb.DB;
import org.jongo.Jongo;

/**
 * The guice modules that the app requires to setup our services
 *
 * @author Nick Ma (nick.ma@maluuba.com)
 */
public class WardrobeModule extends AbstractModule {

    private boolean installServiceModules = true;

    @Override protected void configure() {
        if (installServiceModules) {
            install(new MongoModule());
        }
    }

    public WardrobeModule doNotInstallServiceModules() {
        this.installServiceModules = false;
        return this;
    }

    @Provides
    @Singleton
    public Jongo getJongo(DB db) {
        return new Jongo(db);
    }

}
