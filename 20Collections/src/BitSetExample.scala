
import scala.collection.immutable._

object BitSetExample {
  def main(args: Array[String]) {
    var numbers = BitSet(1, 5, 8, 11,6, 9, 0,10)
    numbers.foreach((element: Int) => println(element))
    
    // Adding element
    
    numbers+=20
    
    //Remove element
    
    numbers-=10
    
    println(numbers)
  }
}