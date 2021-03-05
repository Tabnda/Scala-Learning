package lectures.part2.op

import scala.collection.View
import scala.collection.View.Empty

abstract class MyList {
  def head : Int
  def tail : MyList
  def isEmpty : Boolean
  def add(element: Int) : MyList
  def printElements : String
  override def toString : String = "[" + printElements + "]"
}

object empty extends MyList {
  def head : Int = throw new NoSuchElementException
  def tail : MyList = throw new NoSuchElementException
  def isEmpty : Boolean = true
  def add(n: Int) : MyList = new cons(n, empty)
  def printElements : String = ""

}
class cons(h : Int, t : MyList) extends MyList {
  def head : Int = h
  def tail : MyList = t
  def isEmpty : Boolean = false
  def add(n: Int) : MyList= new cons(n, this)
  def printElements : String =
    if (t.isEmpty) " " + h
    else h + " " + t.printElements
}

object ListTest extends App {
  val list = new cons(1, new cons(2,new cons(3,empty)))
  println(list.tail.head)
  }

