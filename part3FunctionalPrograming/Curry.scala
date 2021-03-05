package part3FunctionalPrograming

object Curry extends App{
  def add (a : Int) = (b : Int) => a + b
  val res = add(20)
  println(res(60))
  println(add(10)(20))

}

