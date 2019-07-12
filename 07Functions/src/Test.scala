

object Test {
  def main(args : Array[String]){
     functionExample() // we can call without braces also functionExample
     var result=functionEqExaple
     println("Result ::"+result)
     parametersFun(10,20)
     result=recursiveFun(15,2)
     println("Recursive result : "+result);
     
      result=defaultValFun();
     println("without arg ::"+result);
     
     result=defaultValFun(20);
     println("first arg ::"+result);
     
     result=defaultValFun(20,30);
     println("two arg ::"+result);
     
     result=namedParFun(a=10,b=20)
     println("two arg ::"+result);
     
     result=namedParFun(b=20)
     println("one arg ::"+result);
  }
  
  def functionExample(){
    println("This is functionExample function");
  }
  
  def functionEqExaple()={
    var a=10;
    a
  }
  
  def parametersFun(a : Int,b :Int){
   var c=a+b;
   println("Parameters :"+c)
  }
  
  def recursiveFun(a : Int ,b : Int): Int ={
    if(b==0)
      0
    else
      a+recursiveFun(a,b-1)
  }
  
  def defaultValFun(a : Int =5, b : Int=10) : Int ={
    a+b
  }
  
  def namedParFun(a : Int=0 ,b : Int=0) : Int ={
    a+b
  }
}

