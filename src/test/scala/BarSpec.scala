import org.scalatest.funsuite._

class BarSpec extends AnyFunSuite {
  test("Length should be 6") {
    assert("foobar".length==6)
  }
}