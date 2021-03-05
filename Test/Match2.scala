package Test

object Match2 extends App{
  val cmd : String = "go"
  cmd match {
    case "start" | "go" => println("starting")
    case "stop" | "quit" | "exit" => println("stopping")
    case _ => println("doing nothing")
      val count: Int = 1
      val x: Int = 5
      count match {
        case 1 => println("one, a lonely number")
        case x if x == 2 || x == 3 => println("two's company, three's a crowd")
        case x if x > 3 => println("4+, that's a party")
        case _ => println("i'm guessing your number is zero or less")
      }
  }


      }
