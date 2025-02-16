package scala_package_practise

object variableArguments {
  def printName(name: Int*)
  {
    println(s"Hello ${name.mkString("-")}")
  }
  
  def main(args: Array[String]): Unit = {
    printName(1)
    printName(1, 2, 3)
    
    val list = List(1, 2, 3, 5)
    printName(list:_*)
    
    val array = Array(1, 2)
    printName(array:_*)
  }
}