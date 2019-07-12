
class Student3(id : Int, name : String){
  var age : Int=0
  def this(id : Int ,name : String,age : Int){
    this(id,name)
    this.age=age;
  }
  def show(){
    println(id+"  "+name+"  "+age);
  }
}
object AuxiliaryConstructor {
  def main(args : Array[String]){
    var s=new Student3(101,"krishnam",28)
    s.show();
  }
}