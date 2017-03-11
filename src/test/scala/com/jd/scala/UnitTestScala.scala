package com.jd.scala

import org.junit.{Assert, Test}

class UnitTestScala {

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }

  @Test def test1() {
    Assert.assertEquals(3, addInt(1, 2))
  }
}