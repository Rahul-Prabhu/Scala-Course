package scala_package_practise

object objOption {
  def main(arg: Array[String]) = {
    val list = List(1, 2, 3, 4)
    val map = Map(1->"John", 2->"Cena", 3->"WWE")
    
    println(map.get(1).get)
    println(list.find(_>5).getOrElse("NA"))
    
    val x = Some("John").getOrElse("NA")
    val y = None
    
    println(x, y)
    
    val opt1: Option[String] = Some("Robin")
    val opt2: Option[String] = None
    
    println(opt1.isEmpty)
    println(opt2.isEmpty)
    
  }
}