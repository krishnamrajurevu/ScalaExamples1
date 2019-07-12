
class StringExample4{  
    var s1 = "Scala string example"  
    var version = 2.12  
    def show(){  
        println(f"This is $s1%s, scala version is $version%2.2f")  
    }  
}  
object ByusingfMethod {
  def main(args:Array[String]){  
        var s = new StringExample4()  
        s.show()  
    }  
}