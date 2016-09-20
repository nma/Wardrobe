package com.nma.wardrobe.dao;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

import org.jongo.Jongo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.github.fakemongo.Fongo;
import com.mongodb.DB;

import io.swagger.model.Stack;

/**
 * @author Nick Ma (nick.ma@maluuba.com)
 */
public class StackDaoTest {

    private final static String WARDROBE = "wardrobe_data";
    private Jongo jongoDriver = null;

    @BeforeMethod
    public void setUp() throws Exception {
        if (jongoDriver == null) {
            Fongo fongo = new Fongo("wardrobe");
            DB db = fongo.getDB(WARDROBE);
            jongoDriver = new Jongo(db);
        }
    }

    @AfterMethod
    public void tearDown() throws Exception {
        jongoDriver.getDatabase().dropDatabase();
    }

    @Test
    public void testThatOurStackCanBeSaved() {
        StackDao dao = new StackDao(jongoDriver);
        Stack stack = new Stack();
        stack.setId(1);
        stack.setName("w3m");

        assertThat(dao.retrieveStacks().size(), equalTo(0));
        dao.save(stack);
        assertThat(dao.retrieveStacks().size(), equalTo(1));
    }

    @Test
    public void testThatWeCanRetrieveStacksByID() {
        StackDao dao = new StackDao(jongoDriver);
        Stack gotStack = dao.retrieveStackById("w3m");
        assertThat(gotStack, notNullValue());
    }
}
