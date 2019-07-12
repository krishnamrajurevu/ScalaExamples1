

object CarryingFun {
  def main(args : Array[String]){
    var result=add(10)(20)
    println(result)
    var addIt=add(10)_
    result=addIt(20)
    println(result)
    
  }
  def add(a : Int)(b : Int) : Int ={
    a+b
  }
}