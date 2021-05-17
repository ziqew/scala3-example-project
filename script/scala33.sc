
//Traits

trait Speaker:
  def speak(): String  // has no body, so it’s abstract

trait TailWagger:
  def startTail(): Unit = println("tail is wagging")
  def stopTail(): Unit = println("tail is stopped")

trait Runner:
  def startRunning(): Unit = println("I’m running")
  def stopRunning(): Unit = println("Stopped running")

class Dog(name: String) extends Speaker, TailWagger, Runner:
  def speak(): String = "Woof!"

class Cat(name: String) extends Speaker, TailWagger, Runner:
  
  def speak(): String = "Meow"

  override def startRunning(): Unit = println("Yeah ... I don’t run")
  
  override def stopRunning(): Unit = println("No need to stop")

val d = Dog("Rover")
println(d.speak())      // prints "Woof!"

val c = Cat("Morris")
println(c.speak())      // "Meow"
c.startRunning()        // "Yeah ... I don’t run"
c.stopRunning()         // "No need to stop"

// Classes
class Person1(var firstName: String, var lastName: String):
  def printFullName() = println(s"$firstName $lastName")

val p = Person1("John", "Stephens")
println(p.firstName)   // "John"
p.lastName = "Legend"
p.printFullName()      // "John Legend"

//Enums
enum CrustSize:
  case Small, Medium, Large

enum CrustType:
  case Thin, Thick, Regular

enum Topping:
  case Cheese, Pepperoni, BlackOlives, GreenOlives, Onions

import CrustSize.*
val currentCrustSize = Small

// enums in a `match` expression
currentCrustSize match
  case Small => println("Small crust size")
  case Medium => println("Medium crust size")
  case Large => println("Large crust size")

// enums in an `if` statement
if currentCrustSize == Small then println("Small crust size")


// define a case class
case class Person2(
  name: String,
  vocation: String
)

// create an instance of the case class
val p = Person2("Reginald Kenneth Dwight", "Singer")

// a good default toString method
p                // Person = Person(Reginald Kenneth Dwight,Singer)

// can access its fields, which are immutable
p.name           // "Reginald Kenneth Dwight"
p.name = "Joe"   // error: can’t reassign a val field

// when you need to make a change, use the `copy` method
// to “update as you copy”
val p2 = p.copy(name = "Elton John")
p2               // Person = Person(Elton John,Singer)
