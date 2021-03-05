package Part1Basics

import java.security.KeyStore.TrustedCertificateEntry

object Functions extends App{
 def aFunction(a : String, b : Int) : String = {
   a + " "  + b
 }
  println(aFunction("Hello", 3))

  def aParameterlessFunction() : Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString : String, n : Int) : String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("Hello",3))

  def aFunctionWithSideEffects(aString : String) : Unit = println(aString)

  def aBiggerFunction(n : Int) : Int = {
    def aSmallerFunction(a: Int, b: Int) = a + b

    aSmallerFunction(n, n - 1)
  }
    def Func(name : String, age : Int) : String =
      "Hi my name is " + name + " i am" + age + " Years old"
      println(Func("David", 12))

 def Factorial(n : Int) : Int =
   if( n<=0 ) 1
   else n*Factorial(n-1)
   println(Factorial(5))
def Fibonacci(n : Int) : Int =
  if(n<=2) 1
  else Fibonacci(n-1) + Fibonacci(n-2)

  println(Fibonacci(8))
def isPrime(n: Int) : Boolean = {
  def isPrimeUntil(t : Int) : Boolean =
    if(t <= 1) true
    else n % t != 0 && isPrimeUntil(t-1)

   isPrimeUntil(n / 2)
}
println(isPrime(32))
  println(isPrime(2003))
  println(isPrime(17 * 27))

}
