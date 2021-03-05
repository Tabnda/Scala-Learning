package Test

object Match extends App{
  def convertBooleanToStringMessage(bool: Boolean): String = bool match {
    case true => "you said true"
    case false => "you said false"
  }

  val result = convertBooleanToStringMessage(true)
  println(result)


  def isTrue(a: Any) = a match {
    case 0 | "" => false
    case _ => true
  }

  val result1 = isTrue("what")
  println(result1)
  println(isTrue(0))
  println(isTrue(1))
  val i : Int = 5
  val evenOrOdd = i match {
    case 1 | 3 | 5 | 7 | 9 => println("odd")
    case 2 | 4 | 6 | 8 | 10 => println("even")
    case _ => println("some other number")

          }


}
