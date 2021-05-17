case class Circle(x: Double, y: Double, radius: Double)

object CircleHelpers:
  def circumference(c: Circle): Double = c.radius * math.Pi * 2

val aCircle = Circle(1.0,1.0,3.0)
CircleHelpers.circumference(aCircle)

case class Circle1(x: Double, y: Double, radius: Double)

extension (c: Circle1)
  def circumference: Double = c.radius * math.Pi * 2

extension (c: Circle1)
  def diameter: Double = c.radius * 2
  def area: Double = math.Pi * c.radius * c.radius

val bCircle = Circle1(2.0,2.0,3.0)
bCircle.circumference
bCircle.area

