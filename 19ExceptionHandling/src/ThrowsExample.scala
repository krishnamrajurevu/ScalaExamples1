
class ExceptionExample5 {
  @throws(classOf[NumberFormatException])
  def validate() {
    "abc".toInt
  }
}
object ThrowsExample {
  def main(args: Array[String]) {
    var exam5 = new ExceptionExample5
    try {
      exam5.validate()
    } catch {
      case ex: NumberFormatException => println("Exception handeled here")
    }
    println("Rest of the code executing...")
  }
}