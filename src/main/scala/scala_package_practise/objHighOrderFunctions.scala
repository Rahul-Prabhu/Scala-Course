package scala_package_practise

object objHighOrderFunctions {
  def main(arg: Array[String]) = {
    val square_1 = (x: Int)=>x*x
    println(square_1(4))
    
    val max = (x: Int, y: Int, z: Int)=>if(x>y && x>z) x else if(y>x && y>z) y else z
    println(max(1, 2, 3))
  }
}