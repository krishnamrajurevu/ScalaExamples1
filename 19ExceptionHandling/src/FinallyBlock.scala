class ExceptionExample3 {
  def divide(a: Int, b: Int) {
    try {
      a / b
      var arr = Array(1, 2)
      arr(10)
    } catch {
      case ar: ArithmeticException => println(ar)
      case ex : Exception => println(ex)
      case th: Throwable          => println("Un known exception :" + th)
    }finally{
       println("Finaly block always executes")  
    }
    println("Rest of the code is executing...")
  }
}

object FinallyBlock {
  def main(args : Array[String]){
    var exam3=new ExceptionExample3
    exam3.divide(10, 0)
  }
}