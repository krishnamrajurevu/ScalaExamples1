
class Student4(id : Int){
  
  def this(id : Int,name : String){
    this(id)
    println(id +"    "+name)
  }
  println(id)
}
object ConstructorOverloading {
  def main(args : Array[String]){
    var s=new Student4(100)
    var s2=new Student4(100,"Krishnam");
  }
}