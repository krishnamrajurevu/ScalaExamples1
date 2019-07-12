

object MapExample {
  def main(args: Array[String]) {
    var map1 = Map(("A", "APPLE"), ("B", "BALL"))
    var map2 = Map("A" -> "APPLE", "B" -> "BALL")
    var emptyMap: Map[String, String] = Map.empty[String, String]
    println(map1)
    println(map2)
    println("Empty Map: " + emptyMap)

    println(map1("A")) // Accessing value by using key
    var newMap = map1 + ("C" -> "Cat") // Adding a new element to map
    println(newMap)
    var removeElement = newMap - ("B") // Removing an element from map
    println(removeElement)
  }
}