package week1

object hello {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  println("This is fun!")                         //> This is fun!
  println("Helllo, where")                        //> Helllo, where
  
  def abs(x: Double) = {
  	if (x<0) -x else x
  }                                               //> abs: (x: Double)Double
  
  abs(-5)                                         //> res0: Double = 5.0
  abs(5)                                          //> res1: Double = 5.0
  abs(0)                                          //> res2: Double = 0.0
  
}