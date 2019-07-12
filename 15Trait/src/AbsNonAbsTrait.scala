
trait Printable3{
  def print()
  def show(){
    println("Show");
  }
}

class A8 extends Printable3{
  def print(){
    println("Print")
  }
}
object AbsNonAbsTrait {
  def main(args : Array[String]){
    var a=new A8
    a.print()
    a.show()
  }
}