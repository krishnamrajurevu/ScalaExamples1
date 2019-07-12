
trait Printable1{
  def print()
}
class A4 extends Printable1{
  def print(){
    println("A4 prints")
  }
}
object Example1 {
  def main(args : Array[String]){
    var a=new A4()
    a.print()
  }
}