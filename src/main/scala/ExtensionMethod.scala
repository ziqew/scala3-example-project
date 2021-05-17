case class Circle(x: Double, y: Double, radius: Double)

extension (c: Circle)
  def circumference: Double = c.radius * math.Pi * 2

extension (c: Circle)
  def diameter: Double = c.radius * 2
  def area: Double = math.Pi * c.radius * c.radius


object ExtensionMethod:
  def test(): Unit =
    val c = Circle(1.0,1.0,5)
    println(c.area)
