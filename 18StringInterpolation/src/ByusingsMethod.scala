
class StringExample3{  
    var s1 = "Scala string example"  
    def show(){  
        println(s"This is $s1")  
    }  
}  
object ByusingsMethod {
  def main(args : Array[String]){
    var s=new StringExample3
    s.show()
  }
}