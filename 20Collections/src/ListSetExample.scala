import scala.collection.immutable._

object ListSetExample {
 def main(args : Array[String]){
   var ls=ListSet(2,3,1,5,4,7,6)
   ls.foreach((ele : Int) => println(ele))
   var listSet1 : ListSet[String] = new ListSet()
   var listSet2 : ListSet[String] = ListSet.empty
   println("listset1 ::"+listSet1)
   println("listset2 ::"+listSet2)
   
   listSet1+="India"
   listSet2+="Packistan"
   
   println("listset1 ::"+listSet1)
   println("listset2 ::"+listSet2)
   
 }
}