package part3FunctionalPrograming

object ListTuple extends App{
  val list = List(1,2,3)
  println(list.head)
  println(list.tail)


  println(list.map(_ + 1))
  println(list.map(_ + " is an element in the list"))

  println(list.filter(_ % 2 == 0))
  val topair = (x : Int) => List(x,x+1)
  println(list.flatMap(topair))

  val numbers = List(1,2,3)
  val chars = List('a','b','c','d')
  val colors = List("Red","Green","bLACK")


  val combinations = numbers.filter(_%2==0).flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinations)

  val forcomprehensions = for{
    n <- numbers if n % 2 == 0
    c <- chars
    color <- colors
  }yield "" + c + n + "-" + color
  println(forcomprehensions)


  for {
    n <- numbers
  }println(n)
  list.map {
    x=>x*2
  }
}
