import Array._
import scala.util.Random
import utilitypackage.ArrayUtility  
import utilitypackage.ArrayDistance


object KmeansExample {
  
  def notMain(a:Int) : Int = { 
    var b : Int =a*2 
    return b ; 
  }
 
  def printingFunction(callback: (Int) => Int) {
    println(notMain(3))
  }


  def main(args: Array[String]) {
    var theFeatures = ofDim[Double](3, 3)   
    theFeatures = ArrayUtility.random2dArrayGeneration(3, 3, 1, 10) ; 
    

    printingFunction(notMain)
    println(ArrayDistance.euclidDistanceBetween2Vectors(theFeatures(1), theFeatures(0)))

  }

}






