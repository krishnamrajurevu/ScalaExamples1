
class Student2(id: Int, name: String) {
  def show() {
    println(id + "  " + name);
  }
}

object PrimaryConstructor {
  def main(args: Array[String]) {
    var st=new Student2(100,"Krishnam");
    st.show()
  }
}