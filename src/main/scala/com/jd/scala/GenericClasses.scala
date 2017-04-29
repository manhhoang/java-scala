package com.jd.scala

object GenericClasses {

  class Stack[T] {
    var elems: List[T] = Nil
    def push(x: T) { elems = x :: elems }
    def top: T = elems.head
    def pop() { elems = elems.tail }
  }

  def main(args: Array[String]): Unit = {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push('a')
    println(stack.top)
    stack.pop()
    println(stack.top)
  }
}
