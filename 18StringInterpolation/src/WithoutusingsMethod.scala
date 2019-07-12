
class StringExample1{  
    var pi = 3.14  
    def show(){  
        println("value of pi = "+pi)          
    }  
}  
object WithoutusingsMethod {
  def main(args :Array[String]){
    var s=new StringExample1()
    s.show()
  }
}