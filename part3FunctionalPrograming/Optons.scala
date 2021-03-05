package part3FunctionalPrograming

object Optons extends App{
  val myFirstOption: Option[Int] = Some(4)
  val noOption: Option[Int] = None

  println(myFirstOption) // prints Some(4)
  //Options were invented to deal with unsafe APIs. Say that you had a method that returned null:
  def unsafeMethod(): String = null
  //Using options, you might be tempted to call unsafeMethod() like this:
  //val result = Some(unsafeMethod())
  //But this is wrong! Because you might be getting Some(null), which basically breaks the whole point of options.
  //
  //Some should always have a valid value inside. Instead, use the Option companion’s apply method:
  val result = Option(unsafeMethod())
  println(result) // returns None
  //This will build a Some or None, depending on whether the value is null or not.
  //If we are designing unsafe APIs,
  // then make your methods return Option of something in the case of returning nulls:
  def betterUnsafeMethod(): Option[String] = None
  def betterBackupMethod(): Option[String] = Some("A valid result")

  val betterChainedResult = betterUnsafeMethod() orElse betterBackupMethod()

  // Functions in scala Apis
  println(myFirstOption.isEmpty) // returns false
  println(myFirstOption.get) // this is unsafe, could throw a null pointer exception, do not use this

  println(myFirstOption.map(_ * 2)) // this returns Some(8)

  println(myFirstOption.filter(x => x > 10)) // returns None

  println(myFirstOption.flatMap(x => Option(x * 10))) // returns Some(40)

  val config: Map[String, String] = Map(
    "host" -> "176.45.36.1",
    "port" -> "80"
  )

  class Connection {
    def connect = "Connected" // connect to some server
  }

  object Connection {
    val random = new Random((System.nanoTime()))

    def apply(host: String, port: String): Option[Connection] =
      if (random.nextBoolean()) Some(new Connection)
      else None
  }
  }
