package lectures.part2.op

object ScalaNotations extends App{
  class Person(val name: String, favoritemovie: String, val age : Int = 0) {
    def likes(movie : String): Boolean = movie == favoritemovie
    def + (person : Person): String = s"${this.name} is hanging out with ${person.name}"
    def + (nickname : String) : Person = new Person(s"$name ($nickname)", favoritemovie)

    def unary_! : String = s"$name what the heck!"
    def unary_+ : Person = new Person(name,favoritemovie, age +1 )
    def isAlive : Boolean = true
    def apply() : String = s"Hi my name is $name and my $favoritemovie"
    def apply(n : Int) : String = s"$name watched $favoritemovie $n Times"
    def learns(thing : String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"


  }
  val mary = new Person("Mary","Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception")
  val tom = new Person("Tom","FightClub")
  println(mary + tom)
  println(mary .+(tom))

  println(1 + 2)
  println(1.+(2))

  //prefix notation
  val x = -1
  val y = 1.unary_-

  println(!mary)
  println(mary.unary_!)
  println(mary.apply())
  println(mary())

  println((mary + "the Rockstar").apply())

  println((+mary).age)
  println(mary.learnsScala)
  println(mary(10))








}
