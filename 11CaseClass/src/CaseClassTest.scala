

case class CaseClassTest(a : Int , b : Int) 

object CaseClase{
  def main(args : Array[String]){
    var c=CaseClassTest(10,20);
    println (c.a)
    println(c.b)
  }
}