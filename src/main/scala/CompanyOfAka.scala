import CompanySalaryApplication._

object CompanyABonus:
  given CompanyBonus = CompanyBonus(1000)

object CompanyAka extends App with SalaryComputation:
  import CompanyABonus.given

  val jack = Employee("Jack", 8000)
  val jill = Employee("Jill", 10000)

  println(s"Jack's salary is ${computeSalary(jack)}")
  println(s"Jill's salary is ${computeSalary(jill)}")