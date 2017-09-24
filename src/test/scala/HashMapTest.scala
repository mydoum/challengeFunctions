import org.scalatest._
import scala.collection.immutable.{ HashMap => ImmutableHashMap}
import scala.collection.mutable.{ HashMap => MutableHashMap}

class HashMapTest extends FunSuite{
  test("updateIfHigher-Immutable", Tag("HashMap")) {
    val hash = ImmutableHashMap[Char, Int]('a' -> 1)
    assert(HMap.updateIfHigher('a', 3, hash)('a') == 3)
    assert(HMap.updateIfHigher('a', 0, hash)('a') == 1)
  }

  test("updateIfHigher-Mutable", Tag("HashMap")) {
    val hash = MutableHashMap[Char, Int]('a' -> 1)
    assert(HMap.updateIfHigher('a', 3, hash)('a') == 3)
    assert(HMap.updateIfHigher('a', 0, hash)('a') == 1)
  }
}
