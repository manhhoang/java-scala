package com.jd.scala

object Function {

  def addInt(a: Int, b: Int): Int = {
    var sum: Int = 0
    sum = a + b

    return sum
  }

  def main(args: Array[String]) {
    println(addInt(1, 2))
  }
}