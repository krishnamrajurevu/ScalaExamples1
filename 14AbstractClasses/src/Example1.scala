
abstract class Bike1{
  def run()
}

class Hero1 extends Bike1{
  def run(){
    println("Hero")
  }
}

object Example1 {
  def main(args : Array[String]){
    var b=new Hero1()
    b.run()
  }
}