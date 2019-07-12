
class ExceptionExample2 {
  def divide(a: Int, b: Int) {
    try {
      a / b
      var arr = Array(1, 2)
      arr(10)
    } catch {
      case e: ArithmeticException => println(e)
      case ex: Throwable          => println("Un known exception :" + ex)
    }
    println("Rest of the code is executing...")
  }
}
object Example2 {
  def main(args: Array[String]) {
    var exam2 = new ExceptionExample2()
    exam2.divide(10, 2)
  }
}