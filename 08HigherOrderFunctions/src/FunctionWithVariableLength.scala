

object FunctionWithVariableLength {
  
  def main(args : Array[String]){
    var sum=add(1,2,3,4,5)
    println(sum);
  }
  
  def add(args : Int*): Int ={
    var sum=0
    for(a <- args) sum+=a
    sum
  }
}