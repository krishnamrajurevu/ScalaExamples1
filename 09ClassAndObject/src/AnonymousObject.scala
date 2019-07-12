
class Arthimatic(){
  
  def add(a : Int, b : Int): Int ={
    a+b
  }
  
}
object AnonymousObject {
  def main(args : Array[String]){
    var result =new  Arthimatic().add(10,20);
    println(result);
    
  }
}