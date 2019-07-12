
class Student3(id : Int ,name : String){
  def getRecord()={
    id+"  "+name
  }
}
object MaintainRecords {
  
  def main(args : Array[String]){
    var st1=new Student3(101,"Krishnam")
    var st2=new Student3(102,"Meena")
    println(st1.getRecord())
    println(st2.getRecord())
    
  }
  
}