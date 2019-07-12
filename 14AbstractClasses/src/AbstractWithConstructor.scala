
abstract class Bike2(a : Int){
  var b : Int=20;
  var c : Int=30;
  def run()
  def performance(){
    println (" Super performance")
  }
}

class Hero2(a : Int) extends Bike2(a){
  c=30
  def run(){
    println(
        "a ="+a+
        "b ="+b+
        "c ="+c)
  }
  
}
object AbstractWithConstructor {
  def main(args : Array[String]){
    var hero=new Hero2(10)
    hero.performance()
    hero.run()
  }
  
}