class Student1{
  var a : Int =100
  var b : Int =200
  println("All statememts of body consider as default constructor  a : "+a+ "  b : "+b);
}

object DefaultConstructor {
  def main(args : Array[String]){
    new Student1()
  }
}