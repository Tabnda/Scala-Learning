package Expressions

object Expressions extends App{
  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  println(1 == x)

  println(!(1 == x))

  var aVariable = 2
  aVariable += 3
  println(aVariable)  // Side Effect


  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3
  println(aConditionValue)

  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while(i < 10) {
    println(i)
    i += 1

    //val aWeiredValue = (aVariable = 3)
    //println(aWeiredValue)

    val aCodeBlock = {
      val y = 2;
      val z = y + 1

      if (z > 2) "Hello" else "GoodBye"
    }



  }

}
