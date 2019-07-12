
trait Print2{
  def print()
}

abstract class PrintA42{
  def printA4()
}

class A62 extends  PrintA42 with Print2{
  def print(){
    println("Print");
  }
  def printA4(){
    println("Print A4");
  }
}
object MixinsOrder {
  def main(args : Array[String]){
    var a=new A62
    a.print()
    a.printA4()
  }
}