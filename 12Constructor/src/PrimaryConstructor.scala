
class Student2(id : Int, name : String){
  def show(){
    println(id +"   "+name);
  }
}
object PrimaryConstructor {
  def main(args : Array[String]){
    var s=new Student2(101,"Krishnam");
    s.show();
  }
}