import org.scalatest._

class ObjectTest extends FunSuite {
  test("OrdTrait") {
    val func = (a: Int, b: Int, c: Int) => OrdNumbers.findMiddleOfThreeElements(a, b, c)
    assert(func(3, 1, 2) == 2)
    assert(func(0, 0, -1) == 0)
  }
}
