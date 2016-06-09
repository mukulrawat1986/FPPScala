package week2
import scala.annotation.tailrec

object higherorder3 {
	
	// Implement a tail recursive version of sum
	def sum(f: Int => Int, a: Int, b: Int): Int = {
		@tailrec
		def loop(a: Int, acc: Int): Int = {
			if(a > b) acc
			else loop(a+1, acc + f(a))
		}
		loop(a, 0)
	}                                         //> sum: (f: Int => Int, a: Int, b: Int)Int
	
	sum(x => x, 1, 10)                        //> res0: Int = 55
	
}