package com.test.scala

class HelloWorld {
  def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
  
}

object Main {
  def main(args: Array[String]) {
    println("Hello, world!")
    val test = new TestJava();
    val testString = test.getName()
    println(testString);
  }
}
