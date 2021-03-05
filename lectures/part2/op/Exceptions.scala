package lectures.part2.op

object Exceptions extends App{
   val x : String = null


  def getInt(withExceptions : Boolean) : Int = {
    if (withExceptions) throw new RuntimeException("No int for you")
    else 42
  }

  val potentialFail = try {
    getInt(false)
  } catch {
    case e : RuntimeException => 43
  } finally {
    println("finally")
  }
  println(potentialFail)

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculationException extends RuntimeException("Division by zero")
  object PocketCalculator {
    def add(x: Int, y : Int) = {
      val result = x + y
      if (x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0 ) throw new UnderflowException
      else result
    }
    def subtract(x : Int, y: Int) = {
      val result = x - y
      if (x > 0 && y < 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y < 0 && result > 0 ) throw new UnderflowException
      else result
    }
    def Multiply(x : Int, y: Int) = {
      val result = x * y
      if (x > 0 && y > 0 && result < 0 ) throw new OverflowException
      else if (x < 0 && y < 0 && result < 0 ) throw new OverflowException
      else if (x > 0 && y < 0 && result > 0 ) throw new UnderflowException
      else if (x < 0 && y > 0 && result > 0 ) throw new UnderflowException
      else result
    }
    def divide(x : Int, y: Int) = {
      val result = x / y
      if (y == 0) throw new MathCalculationException
      else result
    }
  }
  //println(PocketCalculator.add(Int.MaxValue,10))
  println(PocketCalculator.divide(2,0))
}
