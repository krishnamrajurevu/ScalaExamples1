
import java.io._
object CreateFile {
  def main(args : Array[String]){
    var fileObject=new File("ScalaFile.txt")
    var printWriter=new PrintWriter(fileObject)
    printWriter.write("Hello this is scala file")
    printWriter.close()
  }
}