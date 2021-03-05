package lectures.part2.op

object Inheritance extends App{
      class animal {
        val CreatureType = "Wild"
        def eat = println("momomo")
      }
  class cat extends animal {
     def crunch = {
       eat
       println("crunch crunch")
     }

  }
  val Cat = new cat
  Cat.crunch

  //Constructors
  class person(name : String, age : Int){
    def this(name : String) = this(name,0)
  }
  class adult(name :String, age:Int, icard : Int) extends person(name)

  class dog(override val CreatureType : String) extends animal {
   // override val CreatureType = "domestic"
    override def eat {
      super.eat
      print("crunch crunch")
    }

  }
  val Dog = new dog("Merci")
  Dog.eat
  println(Dog.CreatureType)


  val unknownAnimal : animal = new dog("KJ")
  unknownAnimal.eat
// super used to reference method and field from class

}
