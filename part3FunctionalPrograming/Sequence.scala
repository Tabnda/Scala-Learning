package part3FunctionalPrograming

import java.util.Random


object Sequence extends App{
  val seq = Seq(1,2,3,4)
  println(seq)
  println(seq.reverse)
  println(seq(2))
  println(seq ++ Seq(5,6,7))
  println(seq.sorted)


  val aRange = 1 until 10
  println(aRange.foreach(println))

  (1 to 10).foreach(x => println("Hello"))

  val alist = List(1,2,3)
  val prepended = 42 :: alist
  val prepend_append = 42 +: alist :+ 88
  val apple5 = List.fill(5)("apple")
  println(alist.mkString("-"))

  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[Int](3)
  threeElements.foreach(println)

  numbers(2) = 0

  val numbersSeq: Seq[Int] = numbers
  println(numbersSeq)


  val maxRuns = 1000
  val maxCapacity = 1000000

  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random

    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      // as this random index, put a value of r.nextInt() into the collection
      collection.updated(r.nextInt(maxCapacity), r.nextInt())
      System.nanoTime() - currentTime
    }

    times.sum * 1.0 / maxRuns // this computes the average time it takes for the collection to be updated

  }
  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  println(getWriteTime(numbersList))
  println(getWriteTime(numbersVector))

}
