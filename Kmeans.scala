package kmeans

import Array._
import scala.util.Random 

trait Kmeans {
  def initializeCentroids(k:Int, thePoints : Array[Array[Double]]) : Array[Array[Double]]= {
    var Centroids = ofDim[Double](k, thePoints(0).length)
     
    return Centroids ;  
  }
}
