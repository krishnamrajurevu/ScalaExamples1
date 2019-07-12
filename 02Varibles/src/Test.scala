

object Test {

  def main(args: Array[String]) {
    var data1 = 100  //var data1:Int = 100   Here, we have mentioned Int followed by : (colon)
    println("data1 ::"+data1);
    data1 = 101 // It works, No error.
    println("data1 ::"+data1);
    
    
    val data2 = 100  
     println("data2 ::"+data2);
    //data2 = 101   Error: reassignment to val  
    
  }
}