package com.nma.wardrobe.dao;

import com.google.inject.AbstractModule;
import com.nma.wardrobe.WardrobeModule;

/**
 * Created by nma on 24/09/16.
 */
public class WardrobeTestModule extends AbstractModule{
    @Override
    protected void configure() {
        install(new FongoModule());
        install(new WardrobeModule().doNotInstallServiceModules());
    }
}
