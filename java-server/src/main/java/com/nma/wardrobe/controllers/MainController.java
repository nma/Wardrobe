package com.nma.wardrobe.controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.nma.wardrobe.dao.DrawerDao;
import com.nma.wardrobe.dao.ShelfDao;
import com.nma.wardrobe.dao.ShelfToStackDao;
import com.nma.wardrobe.dao.StackDao;

/**
 *
 * Creates a controller that handles the management of our various data objects.
 * Used by the API layer to communicate with our datastore.
 *
 * @author Nick Ma (nickma38@gmail.com)
 */
@Singleton
public class MainController {

    private final DrawerDao drawerDao;
    private final StackDao stackDao;
    private final ShelfDao shelfDao;
    private final ShelfToStackDao shelfToStackDao;

    @Inject
    public MainController(ShelfDao shelfDao, StackDao stackDao, DrawerDao drawerDao, ShelfToStackDao shelfToStackDao) {
        this.shelfDao = shelfDao;
        this.stackDao = stackDao;
        this.drawerDao = drawerDao;
        this.shelfToStackDao = shelfToStackDao;
    }
}
