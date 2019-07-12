
import scala.collection.immutable._

object HashMapExample {
  def main(args: Array[String]) {
    var hashMap1 = new HashMap()
    var hashMap2 = HashMap("A" -> "APPLE", "B" -> "BALL", "C" -> "CAR")
    println(hashMap1)
    println(hashMap2)
    hashMap2.foreach {
      case (key, value) => println(key + "->" + value)
    }
    println(hashMap2.get("A"))
    println(hashMap2("B"))
    var newHashMap = hashMap2 + ("D" -> "Doll")
    newHashMap.foreach {
      case (key, value) => println(key + " -> " + value)
    }
  }
}