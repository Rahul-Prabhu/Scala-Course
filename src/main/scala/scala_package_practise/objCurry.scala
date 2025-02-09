package scala_package_practise

object objCurry {
  
  def sum(x: Int)(y: Int)(z: Int) = x+y+z
  
  def main(arg: Array[String]): Unit = {
    val result = sum(1)(2)(3)
    println(result)
  }
}