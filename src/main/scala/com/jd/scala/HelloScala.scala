package com.jd.scala

import com.jd.java.HelloJava;

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
    val helloJava = new HelloJava()
    val name = helloJava.getName()
    println(name);
  }
}
