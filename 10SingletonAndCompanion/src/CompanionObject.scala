

object CompanionObject {
  def main(args: Array[String]) {
    new CompanionClass().hello()
    println("And this is Companion Object.")
  }
}

class CompanionClass {
  def hello() {
    println("Hello, this is Companion Class.")
  }
}