object String {
  /**
    * Hackerrank: String/Uniform letters
    * Find the max of following uniform letters
    * baaabbc => a = 3, b = 2, c = 1
    */
  def uniformLetters(input: String): Map[Char, Int] = {
    var map = Map[Char, Int]()
    var oldLetter = input(0)
    var nbOccurence = 1
    for (i <- 1 until input.length) {
      val letter = input(i)
      if (letter == oldLetter)
        nbOccurence += 1
      else {
         map = HMap.updateIfHigher(oldLetter, nbOccurence, map).toMap
        oldLetter = letter
        nbOccurence = 1
      }
      if (i == input.length - 1) {
        map = HMap.updateIfHigher(oldLetter, nbOccurence, map).toMap
      }
    }

    map
  }

  /**
    * Hackerrank: String/HackerRank in a String!
    * Time complexity: O(n)
    * Boolean whether
    * - 'input contains 'substring as subSequence
    * LIKE 'substring noted as p0, p1, .. pn it must appear inside 'input with p0 < p1 < .. < pn
    */
  def findOrderedSubstring(input: String, substring: String): Boolean = {
    val pattern = substring
      .map(char => ".*" + char.toString)
      .mkString("") + ".*"

    input matches pattern
  }

  /**
    * Hackerrank: String/Caesar Cipher
    * Time complexity: O(n)
    */
  def caesarCipher(s: String, nbRotations: Int): String = {
    def rotateLetter(char: Char, nbRotations: Int): Char = {
      if (char.isLetter) {
        val referential = if (char.isUpper) 'A' else 'a'

        (char - referential + nbRotations) % 26 + referential toChar
      } else {
        char
      }
    }

    s.map(char => rotateLetter(char, nbRotations))
  }
}
