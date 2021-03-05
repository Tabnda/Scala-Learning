package part3FunctionalPrograming

object MapFlatmapFilterFor extends App{

  val list = List(1,2,3,4)
  println(list.head)
  println(list.tail)

  println(list.map(_ + 1))
  println(list.map(_ + "This is number"))


  println(list.filter(_ % 2 == 0))

  val toPair = (x: Int) => List(x, x+1)

  println(list.flatMap(toPair))
  val numbers = List(1,2,3,4)
  val chars = List('a', 'b', 'c', 'd')
  val colors = List("black", "white")

  val combinations = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinations)

  val forCombinations = for {
    n <- numbers if (n % 2 ==0)
    c <- chars
    color <- colors
  } yield "" + c + n + "-" + color

  println(forCombinations)

  list.foreach(println)
  for {
    n <- numbers
  } println(n)

  list.map { x =>
    x * 2
  }
}
