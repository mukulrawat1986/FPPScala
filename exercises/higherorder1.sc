package week2
import scala.annotation.tailrec

object higherorder1 {
  // summing with higher order functions
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int

  // some functions
  def id(x: Int): Int = x                         //> id: (x: Int)Int

  def cube(x: Int): Int = x * x * x               //> cube: (x: Int)Int

  def fact(x: Int) = {
    @tailrec
    def loop(acc: Int, n: Int): Int =
      if (n == 0) acc
      else loop(acc * n, n - 1)

    loop(1, x)
  }                                               //> fact: (x: Int)Int

  // Now we can write

  def sumInts(a: Int, b: Int): Int = sum(id, a, b)//> sumInts: (a: Int, b: Int)Int

  def sumCubes(a: Int, b: Int): Int = sum(cube, a, b)
                                                  //> sumCubes: (a: Int, b: Int)Int

  def sumFactorials(a: Int, b: Int): Int = sum(fact, a, b)
                                                  //> sumFactorials: (a: Int, b: Int)Int


	// example of using anonymous functions
	
	def sumInts_new(a:Int, b: Int): Int = sum(x => x, a, b)
                                                  //> sumInts_new: (a: Int, b: Int)Int
	
	def sumCubes_new(a: Int, b: Int): Int = sum(x => x * x * x, a, b)
                                                  //> sumCubes_new: (a: Int, b: Int)Int

}