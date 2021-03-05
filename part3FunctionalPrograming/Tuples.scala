package part3FunctionalPrograming

object Tuples extends App {
  //Tuples in Scala are similar to lists, they are finite orders of data.
  // A tuple can be used to group together data of different types, for example Strings and Integers
  //Group 22 elements of different types at max
  val aTuple = new Tuple2(2, "hello, Scala")
  println(aTuple._1)

  println(aTuple.copy(_2 = "GoodBye Java"))

  println(aTuple.swap)

  //Maps are collections used to associate things with other things.
  // With maps, we associate keys to values. Keys are the index, values are the data corresponding to those keys
  val aMap: Map[String, Int] = Map()
  //Let’s create a map, in which we put tuples into the map.
  //val phonebook = Map(("Tabinda", 555), ("Arshiya", 666))
  //For a clearer, syntactic sugar for the pairings, you can also write the tuples with an -> instead:
  val phonebook = Map("James" -> 555, "Bob" -> 666).withDefaultValue(-1)
  println(phonebook)
  //We can query a map if it has a key. The contains method takes a key and returns a boolean:
  println(phonebook.contains("James"))
  //To obtain the value associated with the key, we can call the apply method:
  println(phonebook.apply("James"))
  //To add a pairing to the map, first we create the pairing:
  val newPairing = "Mary" -> 678
  val newPhonebook = phonebook + newPairing
  println(phonebook.map(pair => pair._1.toLowerCase -> pair._2)) // returns: Map(james -> 555, bob -> 666)
  println(phonebook.filterKeys(x => x.startsWith("J")))
  //This could be written in shorthand like this:
  println(phonebook.filterKeys(_.startsWith("J")))
  //So here the lambda takes
  // the value type (in this case Int) and returns something else (in this case 10 times the number).
  println(phonebook.mapValues(number => "0845-" + number)) // returns: Map(James -> 0845-555, Bob -> 0845-666)
  println(phonebook.toList) // returns: List((James,555), (Bob,666))
  println(List(("Daniel", 555)).toMap) // returns: Map(Daniel -> 555)

  val names = List("Bob", "James", "Angela", "Mary", "Daniel", "Jim")
  println(names.groupBy(name => name.charAt(0)))


}















