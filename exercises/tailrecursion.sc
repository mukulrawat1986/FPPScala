package week1
import scala.annotation.tailrec

object tailrecursion {
  // simple implementation of gcd using Euclid's algorithm
  // when using tailrec in scala worksheet, put it in a block, eclipse bug
  def gcd(a: Int, b: Int): Int = {
    @tailrec
    def gcd_i(a0: Int, b0: Int): Int =
      if (b0 == 0) a0 else gcd_i(b0, a0 % b0)

    gcd_i(a, b)
  }                                               //> gcd: (a: Int, b: Int)Int

  gcd(14, 21)                                     //> res0: Int = 7

  // Recursive implementation of factorial
  var block = {
    def factorial(n: Int): Int =
      if (n == 0) 1 else n * factorial(n - 1)

    factorial(4)
  }                                               //> block  : Int = 24

  // tailrecursive implementation of factorial
  def factorial(n: Int): Int = {
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)

    loop(1, n)
  }                                               //> factorial: (n: Int)Int

	factorial(4)                              //> res1: Int = 24
	factorial(5)                              //> res2: Int = 120

}