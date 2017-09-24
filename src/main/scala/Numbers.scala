object Numbers {
  def factorial(i: Int): Int = {
    if (i == 0 || i == 1) 1
    else i * factorial(i - 1)
  }

  def factorial(i: BigInt): BigInt = {
    if (i == 0 || i == 1) 1
    else i * factorial(i - 1)
  }

  def roundDouble(d: Double, precision: Int): Double = {
    BigDecimal(d).setScale(precision, BigDecimal.RoundingMode.HALF_UP).toDouble
  }

  /**
    * Hackerrank : Computing the GCD
    */
  def gcd(x: Int, y: Int): Int =
  {
    if (y != 0) {
      val min = Math.min(x, y)
      val max = Math.max(x, y)
      gcd(min, max % min )
    } else
      x
  }

  def fibonacci(x:Int):Int = {
    x match {
      case 1 => 0
      case 2 => 1
      case _ => fibonacci(x - 1) + fibonacci(x - 2)
    }
  }


  def pascal(n: Int, r: Int, max: Int): Unit = {
    def row(n: Int, r: Int): Int = {
      factorial(n) / (factorial(r) * factorial(n - r))
    }
    (n, r) match {
      case (n, r) if n == max && r == max => println(1)
      case (n, r) if (r == n) => println(1); pascal(n + 1, 0, max)
      case (n, r) => print(row(n, r) + " "); pascal(n, r + 1, max)
    }
  }
}
