package com.jd.scala

object SetType {
  type Set = Int => Boolean

  def contains(s: Set, i: Int): Boolean = s(i)

  def filter(s: Set, i: Int => Boolean): Set = x => s(x) && i(x)

  def forall(s: Set, i: Int => Boolean): Boolean = {
    val f = filter(s, x => !i(x))
    def iter(x: Int): Boolean = {
      if (f(x)) false
      else if (x > 1000) true
      else iter(x + 1)
    }
    iter(-1000)
  }

  def set(elem: Int): Set = a => elem == a
  def union(s: Set, t: Set): Set = a => s(a) || t(a)

  def main(args: Array[String]) {
    val s123 = union(set(1), union(set(2), set(3)))
    println("1 contains 1? (by hand) " + contains((x: Int) => x == 1, 1))
    println("123 contains 1? " + contains(s123, 1))
    println("123 contains 4? " + contains(s123, 4))

    val s1234 = union(union(union(set(1), set(2)), set(3)), set(4))
    val s12345 = union(union(union(union(set(1), set(2)), set(3)), set(4)), set(5))
    println("1234 contains only numbers < 5? " + forall(s1234, a => a < 5))
    println("12345 contains only numbers < 5? " + forall(s12345, a => a < 5))
  }
}