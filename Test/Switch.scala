package Test

import scala.io.StdIn.{readInt, readLine}

object Switch extends App
{

  val name = readLine("Whats your Name?")

  println("Whats your Age?")
  val age = readInt()

  println(f"I am $name, $age years old")

  println("Enter month: ")
  val mama = readInt()

  mama match {
    case 1 => println("monday")
    case 2 => println("February")
    case 3 => println("March")
    case 4 => println("April")
    case 5 => println("May")
    case 6 => println("June")
    case 7 => println("July")
    case 8 => println("August")
    case 9 => println("September")
    case 10 => println("October")
    case 11 => println("November")
    case 12 => println("December")

    case _ => println("Invalid month")

      println(mama)
  }

}
