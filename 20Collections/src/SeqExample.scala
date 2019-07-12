

object SeqExample {
  def main(args: Array[String]) {
    var seq: Seq[Int] = Seq(1, 2, 3, 4, 5)
    seq.foreach((ele: Int) => println(ele))

    println("Access element using index :" + seq(2))
    println("\nis Empty: " + seq.isEmpty)
    println("Ends with (2,7): " + seq.endsWith(Seq(2, 7)))
    println("contains 8: " + seq.contains(8))
    println("last index of 3 : " + seq.lastIndexOf(3))
    println("Reverse order of sequence: " + seq.reverse)
  }
}