package lectures.part2.op

object Basicsclass extends App{

  val person = new Person("John", 26)
  println(person.x)
  person.greet("Tabinda")
  person.greet()

  val author = new Writer("Charles", "Dickens", 1812)
  val imposter = new Writer("Charles", "Dickens", 1812)
  val novel = new Novel(" Adeel " , 1888, author )
  println(novel.authorAge)
  println(novel.isWrittenBy(author))
  //println(novel.isWrittenBy(imposter))

  val counter = new Counter
  counter.inc.print
  counter.inc.inc.inc.print
  counter.inc(10).print


}
class Person(name : String , val age : Int) {
  val x = 2

  println(1 + 3)

  //method
  def greet(name: String): Unit = println(s"${this.name} says hi $name")

  //greeting
  def greet(): Unit = println(s"Hi i am $name")

  //multiple constructors

  def this(name: String) {
    this(name, 0)
  }

  def this() {
    this("John Doe")
  }
}

  class Writer(firstname : String, lastname : String, val year : Int) {
    def fullname: String = firstname + " " + lastname

  }
    class Novel(name :String, year: Int, Author : Writer){
      def authorAge = year - Author.year
      def isWrittenBy(author : Writer) = Author == this.Author
      def copy(newyear : Int) : Novel = new Novel(name, newyear, Author)


    }
class Counter( val Count: Int = 0){
  def inc = {
    println("Increamenting")
    new Counter(Count + 1)
  }
  def dec: Counter = {
    println("Decreamenting")
    new Counter(Count - 1)
  }

    def inc(n : Int) : Counter = {
      if (n <= 0) this
      else
        inc.inc(n - 1)

    }

      def dec(n: Int) : Counter = {
        if (n <= 0) this
        else dec.dec(n - 1)
      }

        def print = println(Count)

}




