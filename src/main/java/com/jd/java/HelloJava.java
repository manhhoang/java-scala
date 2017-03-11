package com.jd.java;

import com.jd.scala.HelloWorld;

public class HelloJava {
  public String hello(){
    return "Hello, world!";
  }

  public static void main(String[] args) {
    HelloWorld hello = new HelloWorld();
    System.out.println(hello.addInt(1, 2));
  }
}
