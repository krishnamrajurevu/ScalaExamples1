
import scala.io.Source

object ReadingFile {
  def main(args: Array[String]) {
    val fileSource1 = Source.fromFile("ScalaFile.txt")
    while (fileSource1.hasNext) {
      print(fileSource1.next)
    }
    fileSource1.close()
    val fileSource2 = Source.fromFile("ScalaFile.txt")
    for (line <- fileSource2.getLines) {
      println(line)
    }

    fileSource2.close()
  }
}