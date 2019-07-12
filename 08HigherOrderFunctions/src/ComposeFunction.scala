

object ComposeFunction {
  def main(args : Array[String]){
    var result=multiplyBy2(add2(10))
    println(result);
  }
  def add2(a : Int) : Int ={
    a+2
  }
  
  def multiplyBy2(a : Int ) : Int ={
    a*2
  }
}