
import scala.collection.immutable._
object ListMapExample {
  def main(args: Array[String]) {
    var listMap1 = ListMap("A" -> "APPLE", "B" -> "BALL",5->10)
    var listMap2 = new ListMap()
    var listMap3 = ListMap.empty
    println(listMap1)
    println(listMap2)
    println(listMap3)

    listMap1.foreach {
      case (key, value) => println(key + "->" + value)
    }
    println(listMap1("B"))
    var newListMap = listMap1 + ("D" -> "DALL")
    newListMap.foreach {
      case (key, value) => println(key + " -> " + value)
    }
  }
}