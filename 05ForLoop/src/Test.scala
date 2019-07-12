

object Test {
  def main(args: Array[String]) {
    // Using to function
    print("To function ::")
    for (a <- 1 to 10) {
      print(a + " ")
    }
    println()
    //Using until
    print("Until function  ::")
    for (a <- 1 until 10) {
      print(a + " ")
    }

    println()
    //Using conditon
    print("Loop with condition  ::")
    for (a <- 1 to 10 if a % 2 == 0) {
      print(a + " ")
    }

    println()
    //Using conditon
    print("Yield function  ::")
    var result = for (a <- 1 to 10) yield a
    for (a <- result) {
      print(a + " ")
    }

    println()
    //Collections
    var list = List(1, 2, 3, 4, 5)
    for (a <- list) {
      print(a + "  ");
    }

    println()
    //Using foreach
    list.foreach {
      print
    }
    println()
    list.foreach(print)
    println()
    list.foreach((element: Int) => print(element))

    println()
    for (a <- 1 to 10 by 3) {
      print(a)
    }

  }
}