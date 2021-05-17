// val and var
// immutable
val a1 = 0

// mutable
var b1 = 1

val msg = "Hello, world"

// "reassignment to val" error; this won’t compile
//msg = "Aloha"

// this compiles because a var can be reassigned
var msg1 = "Hello, world"
msg1 = "Aloha"   

//types
val x2: Int = 1   // explicit
val x22 = 1        // implicit; the compiler infers the type

// data types
val b: Byte = 1
val i: Int = 1
val l: Long = 1
val s: Short = 1
val d: Double = 2.0
val f: Float = 3.0

val x = 1_000L   // val x: Long = 1000
val y = 2.2D     // val y: Double = 2.2
val z = 3.3F     // val z: Float = 3.3

var a11 = BigInt(1_234_567_890_987_654_321L)
var b11 = BigDecimal(123_456.789)

val name = "Bill"   // String
val c1 = 'a'         // Char

//STRING INTERPOLATION
val firstName = "John"
val mi = 'C'
val lastName = "Doe"
println(s"Name: $firstName $mi $lastName")   // "Name: John C Doe"

println(s"2 + 2 = ${2 + 2}")   // prints "2 + 2 = 4"

val x11 = -1
println(s"x.abs = ${x11.abs}")   


//MULTILINE STRINGS
val quote = """The essence of Scala:
               Fusion of functional and object-oriented
               programming in a typed setting."""