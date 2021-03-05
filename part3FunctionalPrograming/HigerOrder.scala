package part3FunctionalPrograming

object HigherOrder extends App{

  val superFunction : (Int , (String, (Int => Boolean) => Int )=> (Int) => Int) = null

  def n_Times(f : Int => Int, n :  Int, x : Int) : Int = {
    if (n<=0) x
    else n_Times(f, n-1, f(x))

  }
  val plusOne = (x : Int)=> x + 1
  println(n_Times(plusOne,10,1))

  val superAdder : Int => (Int => Int) = (x : Int) => (y :Int) => x + y
  val add3 = superAdder(3)
  println(add3(10))
  println(superAdder(3)(10))

  def curriedFormater(s: String)( d : Double) : String = s.format(d)
  val standardFormat : (Double => String) = curriedFormater("%4.2f")
  val standardFormat1 : (Double => String) = curriedFormater("%10.8f")

  println(standardFormat(Math.PI))
  println(standardFormat(Math.PI))



}
