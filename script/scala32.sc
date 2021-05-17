var x = 100

// python style
if x < 0 then
  println("negative")
else if x == 0 then
  println("zero")
else
  println("positive")

//C Style
if(x == 0){
  println("zero")
}

val a = 100
val b = 200
val y = if a < b then a else b

// for loops and expressions
val ints = List(1, 2, 3, 4, 5)

for i <- ints do println(i)
// old style
// for (i <- ints) println(i)

// guard
for
  i <- ints
  if i > 2
do
  println(i)

// for expressions
val doubles = for i <- ints yield i * 2

val doubles1 = for i <- ints yield i * 2     // style shown above
val doubles2 = for (i <- ints) yield i * 2
val doubles3 = for (i <- ints) yield (i * 2)
val doubles4 = for { i <- ints } yield (i * 2)

//match expressions
val i = 1

// later in the code ...
i match
  case 1 => println("one")
  case 2 => println("two")
  case _ => println("other")

case class Person(s:String)

val p = Person("Fred")

// later in the code


p match
  case Person(name) if name == "Fred" =>
    println(s"$name says, Yubba dubba doo")

  case Person(name) if name == "Bam Bam" =>
    println(s"$name says, Bam bam!")

  case _ => println("Watch the Flintstones!")

// getClassAsString is a method that takes a single argument of any type.
def getClassAsString(x: Any): String = x match
  case s: String => s"'$s' is a String"
  case i: Int => "Int"
  case d: Double => "Double"
  case l: List[_] => "List"
  case _ => "Unknown"

// examples
getClassAsString(1)               // Int
getClassAsString("hello")         // 'hello' is a String
getClassAsString(List(1, 2, 3))   // List

/*
try
  writeTextToFile(text)
catch
  case ioe: IOException => println("Got an IOException.")
  case nfe: NumberFormatException => println("Got a NumberFormatException.")
finally
  println("Clean up your resources here.")
*/

def f(i:Int) : Unit = println(i*2)

while x >= 0 do x = f(x)

while (x >= 0) do x = f(x)

while (x >= 0) { x = f(x) }

var x = 1

// without parentheses
while
  x < 3
do
  println(x)
  x += 1

// with parentheses
while (x < 3)
  println(x)
  x += 1


