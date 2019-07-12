
class ExceptionExample4{ 
  def validate(age : Int){
    if(age < 18){
      throw new ArithmeticException("You are not eligible")
    }else{
      println("You are eligible")
    }
  }
}
object ThrowExample {
  def main(args : Array[String]){
    var exam4=new ExceptionExample4
    exam4.validate(17)
  }
}