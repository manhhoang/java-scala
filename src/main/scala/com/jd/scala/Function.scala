package com.jd.scala

import org.junit.{Assert, Test}

class Function {

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }

  def main(args: Array[String]) {
    println(addInt(1, 2))
  }

  @Test def test1() {
    Assert.assertEquals(3, addInt(1, 2))
  }
}