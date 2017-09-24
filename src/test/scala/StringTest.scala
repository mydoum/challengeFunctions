import org.scalatest._

class StringTest extends FunSuite {
  test("findOrderedString", Tag("String")) {
    val substring = "hackerrank"
    assert(String.findOrderedSubstring("hereiamstackerrank", substring))
    assert(!String.findOrderedSubstring("hackerworld", substring))
    assert(String.findOrderedSubstring("hgfdgdackhaerrsanhacka", substring))
  }

  test("uniformLetters", Tag("String")) {
    val data = "baaabbc"
    val uniformLettersResult = String.uniformLetters(data)
    assert(uniformLettersResult('a') == 3)
    assert(uniformLettersResult('b') == 2)
    assert(uniformLettersResult('c') == 1)
  }

}
