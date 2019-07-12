
trait Print1{
  def print()
}

abstract class PrintA41{
  def printA4()
}

class A61 extends Print1 with PrintA41{
  def print(){
    println("Print");
  }
  def printA4(){
    println("Print A4");
  }
}
object MixinsOrderNotMaintained {
  def main(args : Array[String]){
    var a=new A61
    a.print()
    a.printA4()
  }
}