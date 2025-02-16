package scala_package_practise

object objGroupScala {
  def main(args: Array[String]): Unit = {
    val ages = List(1, 2, 3, 4, 5, 10, 39, 50, 45)
    
    val gr = ages.groupBy(age=>if(age>30) "Senior" else "Junior")
    println(gr)
    println(gr("Senior"))
    println(gr("Junior"))
    
    val grp=ages.grouped(2).foreach(x=>println(x))
    
    
  }
}