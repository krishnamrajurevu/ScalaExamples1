
class ThreadDemo extends Thread{
  override def run(){
    println("runing....");
  }
}
object UsingThread {
  def main(args : Array[String]){
    var td=new ThreadDemo
    td.start();
    
  }
}