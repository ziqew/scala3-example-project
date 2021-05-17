import CompanySalaryApplication._

object CompanyBBonus:
  given companyBonus: CompanyBonus = CompanyBonus(2000)

object CompanyBob extends App with SalaryComputation:
  import CompanyBBonus.given
  val julie = Employee("Julie", 8000)
  val julia = Employee("Julia", 10000)

  val employees = List(julie, julia)

  val employeeAndSalary = employees.map(emp => emp.name -> computeSalary(emp))
  println(s"Map of employee and salary for company B is $employeeAndSalary")