
class StringExample2{  
    var pi = 3.14  
    def show(){  
        println(s"value of pi = $pi")  
    }  
}  
object StringInterpolation {
  def main(args : Array[String]){
    var s=new StringExample2()
    s.show()
  }
}