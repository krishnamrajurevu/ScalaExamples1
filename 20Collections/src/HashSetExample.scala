
import scala.collection.immutable.HashSet

object HashSetExample {
  def main(args : Array[String]){
    var hashSet= HashSet(1,2,3,4,5)
    hashSet.foreach((ele : Int) => println(ele))
  }
}