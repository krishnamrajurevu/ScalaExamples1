

object Example1 {
  def main(args : Array[String]){
    var arr=Array(1,2,3,4,5)
    for(a <- arr){
      println(a)
    }
    println("Third element :"+arr(2))
  }
}