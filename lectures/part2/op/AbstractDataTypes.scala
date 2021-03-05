package lectures.part2.op

object AbstractDataTypes extends App{
abstract class Animal{
  val creatureType : String = "Wild" // non abstract variable
  def eat : Unit // abstract variable
}
  class dog extends Animal{
    override val creatureType : String = "Canie"
    def eat = println("Crunch Crunch")
  }
  trait carnivour {
    def eat(animal : Animal) : Unit
    val preferredmeal : String = "fresh meal"
  }
  trait coldblooded
  class crocodile extends Animal with carnivour with coldblooded{
    //val creatureType : String = "Croc"
    def eat : Unit = println("momomo")
    def eat(animal: Animal) : Unit = println(s"I am anima and i am eating ${animal.creatureType}")
  }
  val Dog = new dog
  val croc = new crocodile
  croc.eat(Dog)
}
