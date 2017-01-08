package com.nma.wardrobe.controllers;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;
import com.nma.wardrobe.WardrobeTestModule;
import com.nma.wardrobe.dao.DrawerDao;
import com.nma.wardrobe.dao.ShelfDao;
import com.nma.wardrobe.dao.ShelfToStackDao;
import com.nma.wardrobe.dao.StackDao;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
@Guice(modules = WardrobeTestModule.class)
public class MainControllerTest {

    @Inject
    StackDao stackDao;

    @Inject
    ShelfDao shelfDao;

    @Inject
    DrawerDao drawerDao;

    @Inject
    ShelfToStackDao shelfBelongsToStackDao;

    @Inject
    MainController controller;

    @Test
    public void testShowListShelves() {

    }

    @Test
    public void testShowListOfStacks() {

    }

    @Test
    public void testStacksHasShelves() {

    }
}
