

object Multidimensional {
  def main(args : Array[String]){
    var arr=Array.ofDim[Int](4,5)
    var a : Int =1;
    for(i <- 0 until arr.length){
      for(j <- 0 until arr(i).length){
        arr(i)(j)=a
        a+=1
      }
    }
    
    for(i <- 0 until arr.length)
      for(j <- 0 until arr.length)
        println(arr(i)(j))
    
  }
}