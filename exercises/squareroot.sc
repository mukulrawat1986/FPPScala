package week1

object squareroot {
  /*
 *  In this session we will be finding the square root of x
 *	using Newton's method.
 */
	
	// Function to find the absolute value
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

	// Function to implement a single iteration
  def sqrtIter(guess: Double, x: Double): Double =
    if (isGoodEnough(guess, x)) guess
    else sqrtIter(improve(guess, x), x)           //> sqrtIter: (guess: Double, x: Double)Double

	// Function to figure out how good our guess is
  def isGoodEnough(guess: Double, x: Double): Boolean =
    abs(guess * guess - x) / x < 0.001            //> isGoodEnough: (guess: Double, x: Double)Boolean

	// Function to improve our guess
  def improve(guess: Double, x: Double) =
    (guess + x / guess) / 2                       //> improve: (guess: Double, x: Double)Double

	// Function to find the square root of x
	def sqrt(x: Double): Double = sqrtIter(1.0, x)
                                                  //> sqrt: (x: Double)Double

	// Test
	sqrt(2)                                   //> res0: Double = 1.4142156862745097
	sqrt(3)                                   //> res1: Double = 1.7321428571428572
	sqrt(4)                                   //> res2: Double = 2.000609756097561
	sqrt(5)                                   //> res3: Double = 2.2360688956433634
	sqrt(0.001)                               //> res4: Double = 0.03162278245070105
	sqrt(0.1e-20)                             //> res5: Double = 3.1633394544890125E-11
	sqrt(1.0e20)                              //> res6: Double = 1.0000021484861237E10
	sqrt(1.0e50)                              //> res7: Double = 1.0000003807575104E25
	

}