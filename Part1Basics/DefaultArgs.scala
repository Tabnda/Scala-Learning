package Part1Basics

object DefaultArgs extends App{
  def trFact(n: Int, acc : Int =1): Int =
    if(n<=1) acc
    else trFact(n-1,n*acc)

  val fact = trFact(10,2)
  def savaPicture(format : String ="jpg",width : Int =1920,height : Int =1080) : Unit = println("Saving Picture")
  savaPicture(width = 800)

}
