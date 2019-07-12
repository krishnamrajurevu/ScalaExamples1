
class ThreadExample extends Runnable{
  override def run(){
    println("runing....")
  }
}
object UsingRunnable {
  def main(args : Array[String]){
    var te=new ThreadDemo()
    var thread=new Thread(te)
    thread.start();
  }
  
}