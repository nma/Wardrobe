package com.nma.wardrobe.dao;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import com.google.inject.Inject;
import io.swagger.model.Shelf;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

import io.swagger.model.Stack;

/**
 * @author Nick Ma (nick.ma@maluuba.com)
 */
@Guice(modules = WardrobeTestModule.class)
public class StackDaoTest {

    @Inject
    StackDao dao;

    @Inject
    ShelfToStackDao lookUpDao;

    @Inject
    ShelfDao shelfDao;

    @AfterMethod
    public void tearDown() {
        dao.dropCollection();
    }

    @Test
    public void testThatOurStackCanBeSavedAndUpdated() {
        Stack stack = TestFactory.createStack("bob");

        assertThat(dao.retrieveStacks().size(), equalTo(0));
        dao.save(stack);
        assertThat(dao.retrieveStacks().size(), equalTo(1));

        stack.setAuthGroup("duck");
        dao.save(stack);
        assertThat(dao.count(), equalTo(1l));
    }

    @Test
    public void testThatWeCanRetrieveStacksByIDAndName() throws DaoExceptions.NoMatchFound {
        Stack expectedStack = TestFactory.createStack("W3M");

        dao.save(expectedStack);
        assertThat(dao.retrieveStacks().size(), equalTo(1));

        Stack gotStack = dao.retrieveStackByID("w3m");
        assertThat(gotStack, notNullValue());

        Stack gotStackAgain = dao.retrieveStackByName("W3M");
        assertThat(gotStackAgain, notNullValue());

        assertEquals(gotStack, gotStackAgain);
    }

    @Test(expectedExceptions = DaoExceptions.NoMatchFound.class)
    public void testNoMatchFound() throws DaoExceptions.NoMatchFound {
        dao.retrieveStackByID("fail");
    }

    public void testRetrieveShelves() {
        Stack expectedStack = TestFactory.createStack("testStack");

    }

}
