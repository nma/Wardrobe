package io.github.nma.utils.aws;

import io.github.nma.WardrobeTestModule;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;

/**
 * @author Nick Ma (nick@nickma.com)
 */
@Guice(modules = WardrobeTestModule.class)
public class S3ControllerTest {

    @Test
    public void detectBucketIsVersionedOrNot() {

    }

    @Test
    public void increaseVersionOfObject() {

    }

    @Test
    public void rollBackObject() {

    }

    @Test
    public void deleteVersionOfObject() {

    }
}