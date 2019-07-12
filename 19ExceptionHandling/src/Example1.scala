
class ExceptionExample1 {
  def divide(a: Int, b: Int) = {
   try{
     a/b
   }catch{
     case e : ArithmeticException => println(e) 
   }
   println("Rest of the code");
  }
}
object Example1 {
  def main(args: Array[String]) {
    var e = new ExceptionExample1()
    e.divide(100, 0)

  }
}