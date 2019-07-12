

object AddingTwoMatrix {
  def main(args: Array[String]) {
    var arr1 = Array(Array(1, 2, 3, 4, 5), Array(6, 7, 8, 9, 10) )
    var arr2 = Array(Array(1, 2, 3, 4, 5),Array(6, 7, 8, 9, 10))
    var arr3 = Array.ofDim[Int](2, 5)
    for (i <- 0 until arr3.length) {
      for (j <- 0 until arr3(i).length) {
        arr3(i)(j) = arr1(i)(j) + arr2(i)(j)
        print(" " + arr3(i)(j))
      }
       println()  
    }
  }
}