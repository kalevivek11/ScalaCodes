val aNumber = 44
val ordinal = aNumber match {
  case 1 => "first"
  case 2 => "second"
  case 3 => "third"
  case _ => aNumber + "th" // ignore the English grammar will you please
}
//------------------
case class Person(name: String, age: Int, favoriteMovies: List[String])
val bob = Person("Bob", 34, List("Inception", "The Departed"))

val describeBob = bob match {
  case Person(n, a, movies) => s"$n is $a years old and likes ${movies.mkString(",")}"
  case _ => "I don't know what you're talking about"
}
//------------------
val countingList = List(1,2,3,42)

val mustHaveThree = countingList match {
  case List(_, _, 3, somethingElse) => s"A-HA! I've got a list with 3 as third element, I found $somethingElse after"
}

//-------------------

val startsWithOne = countingList match {
  case 1::tail => s"This lists starts with one, the rest is $tail"
}

//--------------------

def gimmeAValue(): Any = "Hello"

val gimmeTheType = gimmeAValue() match {
  case _: String => "I have a string"
  case _: Int => "I have a number"
  case _ => "I have something else"
}

//--------------------
def gimmeANumber() = 2
val ordinal = gimmeANumber() match {
  case 1 => "first"
  case 2 => "second"
  case 3 => "third"
  case n if n % 10 == 1 => n + "st"
  case n if n % 10 == 2 => n + "nd"
  case n if n % 10 == 3 => n + "rd"
  case n => n + "th"
}