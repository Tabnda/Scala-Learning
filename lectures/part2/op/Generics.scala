package lectures.part2.op

object Generics extends App{
  class Animal[+T](val animial:T)
   //If “S” is subtype of “T” then List[S] is is a subtype of List[T].
   //Prefixing Type Parameter with “+” symbol defines Covariance in Scala.
   //This kind of Inheritance Relationship between two Parameterized Types is known as “Covariant”
  //
  class Dog
  class Puppy extends Dog
  class AnimalCarer(val dog : Animal[Dog])
  object ScalaCovarianceTest {
    val puppy = new Puppy
    val dog = new Dog

    val puppyAnimal:Animal[Puppy] = new Animal[Puppy](puppy)
    val dogAnimal:Animal[Dog] = new Animal[Dog](dog)

    val dogCarer = new AnimalCarer(dogAnimal)
    val puppyCarer = new AnimalCarer(puppyAnimal)

    println("Done.")
  }

}
