package com.jd.scala

import java.io.File
import java.io.PrintWriter

object FileIO {
  
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt"))

    writer.write("Hello Scala")
    writer.close()
  }
}