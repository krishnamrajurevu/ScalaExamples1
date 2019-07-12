
class ArrayExample4{  
    var arr = Array(1,2,3,4,5)      // Creating single dimensional array  
    arr.foreach((element:Int)=>println(element))       // Iterating by using foreach loop  
}  
  
object Example4 {
  def main(args : Array[String]){
    new ArrayExample4
  }
}