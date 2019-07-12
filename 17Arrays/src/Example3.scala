
class ArrayExample3 {
  def show(arr: Array[Int]) {
    for (a <- arr) // Traversing array elements
      println(a)
    println("Third Element = " + arr(2)) // Accessing elements by using index
  }
}

object Example3 {
  def main(args: Array[String]) {
    var arr: Array[Int] = new Array(5);
    for(a <- 0 until arr.length){
      arr(a)=a
    }
    var a = new ArrayExample3()
    a.show(arr)
  }
}