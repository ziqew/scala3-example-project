val a = List(1, 2, 3)           // a: List[Int] = List(1, 2, 3)

// Range methods
val b = (1 to 5).toList         // b: List[Int] = List(1, 2, 3, 4, 5)
val c = (1 to 10 by 2).toList   // c: List[Int] = List(1, 3, 5, 7, 9)
val e = (1 until 5).toList      // e: List[Int] = List(1, 2, 3, 4)
val f = List.range(1, 5)        // f: List[Int] = List(1, 2, 3, 4)
val g = List.range(1, 10, 3)    // g: List[Int] = List(1, 4, 7)

// a sample list
val a1 = List(10, 20, 30, 40, 10)      // List(10, 20, 30, 40, 10)

a1.drop(2)                             // List(30, 40, 10)
a1.dropWhile(_ < 25)                   // List(30, 40, 10)
a1.filter(_ < 25)                      // List(10, 20, 10)
a1.slice(2,4)                          // List(30, 40)
a1.tail                                // List(20, 30, 40, 10)
a1.take(3)                             // List(10, 20, 30)
a1.takeWhile(_ < 30)                   // List(10, 20)

// flatten
val a2 = List(List(1,2), List(3,4))
a2.flatten                             // List(1, 2, 3, 4)

// map, flatMap
val nums = List("one", "two")
nums.map(_.toUpperCase)               // List("ONE", "TWO")
nums.flatMap(_.toUpperCase)           // List('O', 'N', 'E', 'T', 'W', 'O')


case class Person3(name: String)
val t = (11, "eleven", Person3("Eleven"))
