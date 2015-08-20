package utilitypackage

import scala.util.Random
import Array._

 

trait RandomArrayGeneration { 

  def random2dArrayGeneration(a:Int, b:Int, min:Double, max:Double ) : Array[Array[Double]] = {
    var theArray = ofDim[Double](a,b) ; 
    for(i<-0 to a-1) {
      for(j<-0 to b-1) {
        theArray(i)(j)=Random.nextDouble()*(max-min) + min         
      }
    }
    return theArray
  }
}
trait DistanceCalculation { 
  
  def euclidDistanceBetween2Vectors(a:Array[Double], b:Array[Double]) : Double = {
    var sum =0.0 ; 
    for(i<- 0 to a.size-1) {
      sum+=scala.math.pow((a(i)-b(i)),2)  
    }
    return scala.math.sqrt(sum)
  }

}




object ArrayUtility extends RandomArrayGeneration { 
  
}

object ArrayDistance extends DistanceCalculation { 

}
