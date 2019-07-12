

object MultiLineExpression {
  def main(args :Array[String]){
    var result1=add1(10,20)
    println(result1);
    var result2=add2(10,20)
    println(result2);
  }
  
  def add1(a : Int, b : Int) : Int ={
    a+
    b
  }
  
  def add2(a : Int, b : Int) : Int ={
   ( a+
    b)
  }
}