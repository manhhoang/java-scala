package com.jd.scala

object ArrayScala {

  def main(args: Array[String]) {
    var z = new Array[String](3)
    z(0) = "Zara"; z(1) = "Nuha"; z(4 / 2) = "Ayan"
    z.foreach { x => print(x + " ") }
    println();

    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // Print all the array elements
    for (x <- myList) {
      println(x)
    }

    // Summing all elements
    var total = 0.0;
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i);
    }
    println("Total is " + total);

    // Finding the largest element
    var max = myList(0);
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) max = myList(i);
    }
    println("Max is " + max);

  }
}