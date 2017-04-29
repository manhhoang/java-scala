package com.jd.scala

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException

object Exceptions {

  def main(args: Array[String]) {
    try {
      val f = new FileReader("input.txt")
    } catch {
      case ex: FileNotFoundException => {
        println("Missing file exception")
      }
      case ex: IOException => {
        println("IO Exception")
      }
    }
  }
}