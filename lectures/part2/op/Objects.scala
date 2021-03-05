package lectures.part2.op

object Objects extends App{
object Person {
  val N_EYES = 2
  def can_fly : Boolean = false
  def apply(mother : Person, father : Person) : Person = new Person("Bobbie")
}
  class Person(val name : String) {

  }

  println(Person.N_EYES)
  println(Person.can_fly)

  val mary = new Person("Mary")
  val John = new Person("John")
  println(mary == John)

  //val bobbie = Person.apply("mary", "John")
  //cann also write without apply


}
