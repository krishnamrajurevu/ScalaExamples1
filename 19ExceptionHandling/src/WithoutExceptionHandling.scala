
class ExceptionExample {
  def divide(a: Int, b: Int) = {
    a / b // Exception occurred here
    println("Rest of the code is executing...")
  }
}
object WithoutExceptionHandling {
  def main(args: Array[String]) {
    var e = new ExceptionExample()
    e.divide(100, 0)

  }
}