package Part1Basics

object CBNvsCBV extends App{
 def CalledByValue(x: Long) : Unit = {
   println("By Value " + x)
   println("By Value " + x)

 }
 def CalledByName(x: => Long ) : Unit = {
  println("By Name " + x)
  println("By Name " + x)

 }
 CalledByValue(System.nanoTime())
 CalledByName(System.nanoTime())

}
