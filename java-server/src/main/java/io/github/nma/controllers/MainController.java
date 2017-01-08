package io.github.nma.controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import io.github.nma.dao.ShelfDao;
import io.github.nma.dao.ShelfToStackDao;
import io.github.nma.dao.StackDao;

/**
 *
 * Creates a controller that handles the management of our various data objects.
 * Used by the API layer to communicate with our datastore.
 *
 * @author Nick Ma (nickma38@gmail.com)
 */
@Singleton
public class MainController {

    private final StackDao stackDao;
    private final ShelfDao shelfDao;
    private final ShelfToStackDao shelfToStackDao;

    @Inject
    public MainController(ShelfDao shelfDao, StackDao stackDao, ShelfToStackDao shelfToStackDao) {
        this.shelfDao = shelfDao;
        this.stackDao = stackDao;
        this.shelfToStackDao = shelfToStackDao;
    }
}
