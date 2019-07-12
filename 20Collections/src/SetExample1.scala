import scala.collection.immutable._

object SetExample1 {
  def main(args: Array[String]) {
    var set1 = Set();
    println(set1.isEmpty)
    var set2 = Set(1, 2, 3, 4, 5)
    println(set2.tail)
    var set3 = Set("One", "Two", "Three")
     println(set3)
    println(set3.head)

    var games : Set[String] = Set("Cricket", "Football", "Hocky", "Golf", "C")
    var alphabet = Set("A", "B", "C", "D", "E", "Cricket", "Football", "Hocky", "Golf")
    var mergeSet=alphabet ++ games
    println("Elements size in games :"+games.size)
    println("Elements size in alphabets :"+games.size)
    println("Elements size in mergeSet :"+mergeSet.size)
    println(mergeSet);
    //contains method
    println("Football contains in mergeSet or not :"+mergeSet.contains("Football"))
    
    //adding element in set
    
    games += "Racing"
    println(games)
    
    //Remove element in set
    
    games -="Hocky"
    println(games)
    
    //Duplicate not allowed
    
    games += "Golf"
    println(games)
    
    //Iterate using loop
    
    for(ele <- games){
      println(ele)
    }
    
    //Iterate using foreach
    
    games.foreach((e : String) => println(e))
    
    //Intersection by using intersect
    
    var intersectEle=games.intersect(alphabet)
    println("intersectEle :: "+intersectEle)
    
    //Intersect by using & operator
    
    println("Intersect by using & opertor "+ (games & alphabet))
    
    //Unior by using union union
    
    println("Union by using union "+games.union(alphabet))
    
    //Sorted set
    
    var number : SortedSet[Int]= SortedSet(5,2,4,1,3)
    println("Sorted elements :"+number)
    
    
        
  }
}