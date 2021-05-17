// FIRST-CLASS FUNCTIONS
// Lambdas
// Higher-order functions (HOFs)
// Immutable collections in the standard library

val a1 = List(1, 2, 3).map(i => i * 2)   // List(2,4,6)
val b1 = List(1, 2, 3).map(_ * 2)        // List(2,4,6)

def double(i: Int): Int = i * 2

val a = List(1, 2, 3).map(i => double(i))   // List(2,4,6)
val b = List(1, 2, 3).map(double)           // List(2,4,6)

val nums = (1 to 10).toList   // List(1,2,3,4,5,6,7,8,9,10)

// methods can be chained together as needed
val x = nums.filter(_ > 3)
            .filter(_ < 7)
            .map(_ * 10)