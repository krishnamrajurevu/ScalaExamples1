

object SingletonTest {
  def main(args : Array[String]){
    SingletonObj.hello() // hello function is out side object
    bye // bye function is inside same object
  }
  def bye(){
    println("ended");
  }
}

object SingletonObj {
  def hello(){
    println("Hello this is singleton Obj");
  }
}