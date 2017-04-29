package com.jd.scala

object Classes {

  class Point(var x: Int, var y: Int) {
    def move(dx: Int, dy: Int): Unit = {
      x = x + dx
      y = y + dy
    }
    override def toString: String =
      s"($x, $y)"
  }

  def main(args: Array[String]): Unit = {
    val point1 = new Point(2, 3)
    point1.x  // 2
    println(point1)  // prints (x, y)
  }
}
