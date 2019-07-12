class InvalidAgeException(s:String) extends Exception(s){}  
class ExceptionExample6{  
    @throws(classOf[InvalidAgeException])  
    def validate(age:Int){  
        if(age<18){  
            throw new InvalidAgeException("Not eligible")  
        }else{  
            println("You are eligible")  
        }  
    }  
}  
object CustomException {
  def main(args: Array[String]) {
    var exam6 = new ExceptionExample6
   try {
      exam6.validate(17)
   } catch {
     case e: Exception => println(e);
   }
  }
}