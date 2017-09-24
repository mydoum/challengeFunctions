import scala.io.StdIn._

object Misc {
  /**
    * 1 5 3  => List(1, 5, 3)
    */
  def readIntLine(): List[Int] = {
    readLine().trim().split(" ").map(x=>x.toInt).toList
  }
}
