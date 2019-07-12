
trait Printable2{
  def print()
}

trait Showable2{
  def show()
}

class A6 extends Printable2 with Showable2{
  def print(){
    println("Print")
  }
  
  def show(){
    println("Show")
  }
}

object MultipleTraits {
  def main(args : Array[String]){
    var a=new A6
    a.print()
    a.show()
  }
}