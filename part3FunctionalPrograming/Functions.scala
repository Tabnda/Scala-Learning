package part3FunctionalPrograming

object Functions extends App{


  val doubler = new MyFunction[Int, Int] {
  override def apply(element : Int) = element * 2
  }
  println(doubler(2))

  val StringToIntConverter = new Function1[String, Int]  {
   override def apply(string : String) = string.toInt
  }
  println(StringToIntConverter("3") + 4 )

  val adder  = new Function2[Int, Int, Int] {
    override def apply(a : Int, b : Int) : Int = a + b
  }
  print(adder(3,4))
  val concatenate = new Function2[String, String, String] {
    override def apply(a : String, b : String) = a + b
  }
  println(concatenate("Hello" , "Scala"))
}

trait MyFunction[A , B] {
  def apply(element : A) : B
}