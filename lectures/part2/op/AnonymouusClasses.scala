package lectures.part2.op

object AnonymouusClasses extends App {

  abstract class animal {
    def eat: Unit

  }

  //anonymous class
  val funnyAnimal: animal = new animal {
    override def eat: Unit = println("bdhydgygdy")
  }
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi my name is $name How can I help")
  }

  val jim = new Person("Jim") {
    override def sayHi: Unit = println(s"Hi my name is Jim How can I be at sevice")
  }
}


