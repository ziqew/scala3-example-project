
object CompanySalaryApplication :
  case class Employee(name: String, salary: Int)
  case class CompanyBonus(amount: Int)

  trait SalaryComputation:
    def computeSalary(employee: Employee)(using companyBonus: CompanyBonus): Int =
      employee.salary + companyBonus.amount
