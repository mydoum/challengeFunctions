trait Ord {
  type A

  def ord: Ordering[A]

  def findMiddleOfThreeElements(a: A, b: A, c: A): A = {
    def bigger(x: A, y: A): A = {
      if (ord.gt(x, y)) x
      else y
    }

    def biggest(x: A, y: A, z: A): A = bigger(x, bigger(y, z))

    val max = biggest(a, b, c)

    if (a == max) bigger(b, c)
    else if (b == max) bigger(a, c)
    else bigger(a, b)

  }
}

object OrdNumbers extends Ord {
  override type A = Int
  override def ord = scala.math.Ordering.Int
}
