

object Matches {
  def main(args : Array[String]){
    var num :Int =3;
    num match{
      
      case 1 => println("One")
      case 2 => println("Two")
      
      case _ => println("Default")
      
    }
    
    var result =search("Hello");
  }
  
  def search(str : Any) : Any = str match{
    case "Hello" => println("Hello");
    case "Bye" => println("Bye");
    case _ => println("Default")
    
  }
}