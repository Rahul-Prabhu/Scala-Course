package scala_package_practise

class Student {
  
  val name:String = "Rahul"
  val age:Int = 25
  val id:Int = 1
  val city:String = "Mumbai"
}

object objPatternMatching {
  def main(arg: Array[String]):Unit = {
    val s = new Student
    val match1 = s.city match {
      case "Mumbai"=> "Capital city of Maharashtra"
      case "Delhi"=> "Capital City of Delhi"
      case "Kokata"=> "Capital city of West Bengal"
      case _=> "Default city"
    }
    println(match1)
    
    val age_id = (s.id, s.age) match {
      case (s.id, s.age) if s.id>s.age => s.id
      case (s.id, s.age) if s.id<s.age => s.age
      case _ => "Both are equal"
    }
    println(age_id)
    
    val age_id_o = (s.id>s.age) match {
      case true => s.id
      case false => s.age
    }
    println(age_id_o)
  }
}