package com.nma.wardrobe.dao;

import com.google.inject.Inject;
import io.swagger.model.Shelf;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author Nick Ma (nick.ma@maluuba.com)
 */
@Guice(modules = WardrobeTestModule.class)
public class ShelfDaoTest {

    @Inject
    ShelfDao dao;

    @AfterMethod
    public void tearDown() {
        dao.dropCollection();
    }

    @Test
    public void testSaveAndUpdate() {
        Shelf shelf = TestFactory.createShelf("serviceName");

        assertThat(dao.retrieveShelves().size(), equalTo(0));
        dao.save(shelf);
        assertThat(dao.retrieveShelves().size(), equalTo(1));

        shelf.setUrl("s3://place/of/file");
        dao.save(shelf);
        assertThat(dao.count(), equalTo(1l));
    }

    @Test
    public void testRetrieveByNameAndID() {

    }
}
