
class Vehicle1 {
  val speed : Int =60;
}
class Bike1 extends Vehicle1 {
 override val speed : Int =100  //you can override only those variables which are declared by using val keyword in both classes
  def show(){
    println(speed)
  }
}
object Example1 {
  def main(args : Array[String]){
    var bike=new Bike1
    bike.show();
  }
}