
class ArrayExample2 {
  var arr = new Array[Int](5)
  def show() {
    for (a <- arr) {
      println(a)
    }
    println("Third Element before assignment = " + arr(2)) // Accessing elements by using index
    arr(2) = 10 // Assigning new element at 2 index
    println("Third Element after assignment = " + arr(2))

  }
}
object Example2 {
  def main(args: Array[String]) {
    var a = new ArrayExample2
    a.show()
  }
}