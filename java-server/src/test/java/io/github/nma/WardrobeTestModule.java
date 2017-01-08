package io.github.nma;

import com.google.inject.AbstractModule;

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
