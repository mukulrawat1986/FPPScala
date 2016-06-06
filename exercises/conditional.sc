package week1

object conditional {
  /*
	*	Implement "and" function such that
	*	and(x,y) == x && y
	* Do not use && in the implementation
	*/
  def and(x: Boolean, y: => Boolean) =
    if (x) y
    else false                                    //> and: (x: Boolean, y: => Boolean)Boolean

	/*
	*	Implement "or" function such that
	*	or(x,y) == x || y
	* Do not use || in the implementation
	*/
	def or(x: Boolean, y: => Boolean) =
	if (x) true
	else y                                    //> or: (x: Boolean, y: => Boolean)Boolean

	// create a loop variable
	def loop: Boolean = loop                  //> loop: => Boolean

	// Test
	and(true, true)                           //> res0: Boolean = true
	and(true, false)                          //> res1: Boolean = false
	and(false, true)                          //> res2: Boolean = false
	and(false, false)                         //> res3: Boolean = false
	and(false, loop)                          //> res4: Boolean = false

	or(true, true)                            //> res5: Boolean = true
	or(true, false)                           //> res6: Boolean = true
	or(false, false)                          //> res7: Boolean = false
	or(false, true)                           //> res8: Boolean = true
	or(true, loop)                            //> res9: Boolean = true

}