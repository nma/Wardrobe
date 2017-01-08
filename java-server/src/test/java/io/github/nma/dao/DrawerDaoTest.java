package io.github.nma.dao;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Date;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import com.google.inject.Inject;
import io.github.nma.WardrobeTestModule;

import io.swagger.model.Drawer;

/**
 * @author Nick Ma (nickma38@gmail.com)
 */
@Guice(modules = WardrobeTestModule.class)
public class DrawerDaoTest {

    @Inject
    DrawerDao dao;

    @AfterMethod
    public void tearDown() {
        dao.dropCollection();
    }

    @Test
    public void testSaveAndUpdate() {
        Drawer drawer = TestFactory.createDrawer();

        assertThat(dao.retrieveDrawers().size(), equalTo(0));
        dao.save(drawer);
        assertThat(dao.retrieveDrawers().size(), equalTo(1));

        drawer.setDateAdded(new Date());
        dao.save(drawer);
        assertThat(dao.count(), equalTo(1l));
    }

    @Test
    public void testRetrieveByDateAddedAndID() throws DaoExceptions.NoMatchFound {
        Drawer expectedDrawer = TestFactory.createDrawer();

        dao.save(expectedDrawer);
        assertThat(dao.retrieveDrawers().size(), equalTo(1));

        Drawer gotDrawer = dao.retrieveDrawerbyID(expectedDrawer.getId());
        assertThat(gotDrawer, notNullValue());

        Drawer gotDrawerAgain = dao.retrieveDrawerbyDateAdded(gotDrawer.getDateAdded());
        assertThat(gotDrawerAgain, notNullValue());

        assertEquals(gotDrawer, gotDrawerAgain);
    }

    @Test(expectedExceptions = DaoExceptions.NoMatchFound.class)
    public void testNoMatchFound() throws DaoExceptions.NoMatchFound {
        dao.retrieveDrawerbyID("fail");
    }

}
