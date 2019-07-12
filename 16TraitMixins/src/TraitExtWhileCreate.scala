
trait Print3{
  def print()
}

abstract class PrintA43{
  def printA4()
}

class A63 extends  PrintA43{
  def print(){
    println("Print");
  }
  def printA4(){
    println("Print A4");
  }
}
object TraitExtWhileCreate {
  def main(args : Array[String]){
    var a=new A63 with Print3
    a.print()
    a.printA4()
  }
}