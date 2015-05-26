package com.jd.java;

import com.jd.scala.HelloWorld;

public class HelloJava {
  public String getName(){
    return "Testabc";
  }
  
  public static void main(String[] args) {
    HelloWorld hello = new HelloWorld();
    System.out.print(hello.addInt(1, 2));
  }
}
