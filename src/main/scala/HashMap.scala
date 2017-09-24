
object HMap {
  def updateIfHigher(key: Char, value: Int, map: scala.collection.Map[Char, Int]): scala.collection.Map[Char, Int] = {
    map.get(key) match {
      case Some(i) if i > value => map
      case _ => map + (key -> value)
    }
  }
}
