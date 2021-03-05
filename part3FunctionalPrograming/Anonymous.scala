package part3FunctionalPrograming

object Anonymous extends App{
 val doubler : Int => Int = (x : Int) => x * 2

  val adder : (Int , Int ) => Int = (a: Int, b: Int) =>  a + b

  val dosomething: () => Int = () => 3

  println(dosomething) // Function itself
  println(dosomething()) // call

  //curly braces with lambdas
  val StringtoInt = { (str : String) =>
    str.toInt
  }

  val fun : Int => Int = _ + 1
  val niceadder :( Int , Int ) => Int = _ + _
}
