package Part1Basics

object Recursion extends App {
  def Factorial(n: Int): Int =
    if (n <= 0) 1
    else {
      println(" computing factorial of " + n + " I first need factorial of" + (n - 1))

      val result = n * Factorial(n - 1)
      println(" Computed Factorial" + n)
      result
    }

  println(Factorial(10))


  def anathorFactorial(n: Int): BigInt = {

    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x - 1, x * accumulator)

    factHelper(n, 1)


  }

  println(anathorFactorial(30000))

  def concatenateTailRec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailRec(aString, n - 1, aString + accumulator)

  println(concatenateTailRec("Hello", 3, " "))

  def isPrime(n: Int): Boolean = {
    def isTailRec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isTailRec(t - 1, n % t != 0 && isStillPrime)

      isTailRec(n / 2, true)
    }


    println(isPrime(2003))
    println(isPrime(629))


    def Fibonacci(n: Int): Int = {
      def FiboTailRec(i: Int, Last: Int, NextToLast: Int): Int =
        if (i >= n) Last
        else FiboTailRec(i + 1, Last + NextToLast, Last)

      if (n <= 2) 1
      else FiboTailRec(2, 1, 1)
    }

    println(Fibonacci(8))
}
