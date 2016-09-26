package com.nma.wardrobe;

import com.google.inject.AbstractModule;
import com.nma.wardrobe.WardrobeModule;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
public class WardrobeTestModule extends AbstractModule{
    @Override
    protected void configure() {
        install(new FongoModule());
        install(new WardrobeModule().doNotInstallServiceModules());
    }
}
