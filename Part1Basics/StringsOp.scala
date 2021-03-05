package Part1Basics

object StringsOp extends App{
  val Str: String = "Hello, I am learning Scala"
  println(Str.charAt(2))
  println(Str.substring(7,11))
  println(Str.split(" ").toList)
  println(Str.startsWith("Hello"))
  println(Str.replace(" ", " -"))
  println(Str.toLowerCase)
  println(Str.length)

  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(Str.reverse)
  println(Str.take(2))


  val name : String = "David"
  val age : Int = 20
  val greetings = s"Hello my name is $name and i will be turning $age  years old"
  val anotherGreetings = s"Hello my name is $name and i will be turning ${age + 1} years old"

  // Scala Interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.2f burgers per day"
  println(myth)

  println(raw"This is a new line \n newline")
  val escaped = "This is a newline \n newline"
  println(escaped)


}
