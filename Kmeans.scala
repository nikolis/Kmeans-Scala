package kmeans

import Array._
import scala.util.Random 
import utilitypackage.ArrayDistance


trait Kmeans {
  
  def initializeCentroids(k: Int, thePoints: Array[Array[Double]]): Array[Array[Double]]= {
    var centroid = ofDim[Double](k, thePoints(0).length) 
    var randomIndex: Int =1  
    for(i<- 0 to k) {
      randomIndex = Random.nextInt(thePoints.length-0)
      centroid(i)=thePoints(randomIndex)
    }
    return centroid 
  }

  def calculateDistances(thePoints: Array[Array[Double]], centroids: Array[Array[Double]]): Array[Array[Double]]= {
    var distances = ofDim[Double](thePoints.length, centroids.length)
    for(i<- 0 to thePoints.length) {
      for(j<- 0 to centroids.length) {
        distances(i)(j) =ArrayDistance.euclidDistanceBetween2Vectors(thePoints(i), centroids(j))
      }
    }
    return distances
  }

  def calculateKsets(k: Int, distances: Array[Array[Double]]): Array[Int]= {
    var sets =  new Array[Int](distances.length)
    for(i<-0 to distances.length) {
      sets(i)= distances(i).indexOf(distances(i).min)
    }
    return sets 
  }

  def calculateCentroids(k: Int, thePoints: Array[Array[Double]], theSets: Array[Array[Int]]): Array[Array[Double]] {
    centroids = ofDim[Double](k, thePoints.length)
    for(i<-0 to k) {
      for(j<-0 to thePoints.length)

    }
  }

  def cluster(iterations: Int, k: Int, thePoints: Array[Array[Double]]) :Array[Array[Int]] {
  
  }

}
