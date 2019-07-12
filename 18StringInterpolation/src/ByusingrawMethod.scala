
class StringExample5 {
  var s1 = "Scala \tstring \nexample"
  var s2 = raw"Scala \tstring \nexample"
  def show() {
    println(s1)
    println(s2)
  }
}
object ByusingrawMethod {
  def main(args: Array[String]) {
    var s = new StringExample5()
    s.show()
  }
}