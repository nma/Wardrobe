package com.nma.wardrobe

import org.scalatest.{BeforeAndAfterEach, FunSuite}

/**
  * Created by nickma on 2016-04-14.
  */
class StackDaoTest extends FunSuite with BeforeAndAfterEach {

  override def beforeEach() {

  }

  override def afterEach() {

  }

  test("testRetrieveStacks") {
    val testStackDao = new StackDao();
    val stacks = testStackDao.retrieveStacks();

    stacks
  }

  test("testRetrieveStackById") {

  }

}
