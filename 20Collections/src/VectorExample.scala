

object VectorExample {
  def main(args: Array[String]) {
    var vector1: Vector[Int] = Vector(1, 2, 3, 4, 5)
    var vector2 = Vector("Hocky", "Cricket", "Golf")
    var vector3 = Vector.empty
    var vector4 = Vector("Swimming")
    println(vector1)
    println(vector2)
    println(vector3)
    println(vector4)
    
    var newVector= vector2+"Racing"
    println(newVector)
    
    var mergeTwoVector=vector2++vector4
    println(mergeTwoVector)
    
    println("reverse "+mergeTwoVector.reverse)
    println("Sorted order"+mergeTwoVector.sorted)
        
    

  }
}