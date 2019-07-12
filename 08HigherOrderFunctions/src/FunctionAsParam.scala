

object FunctionAsParam {
   def main(args : Array[String]){
     exampleFun(25,multiplyBy2)
   }
   
   def exampleFun(a : Int,f: Int => AnyVal) : Unit ={
     println("one")
     println(f(a))
     println("two")
   }
   
   def multiplyBy2(a : Int) : Int ={
     println("three")
     a*2
   }
}