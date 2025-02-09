package scala_package_practise

object objConditional {
  def main(arg:Array[String]):Unit = {
    val i:Int=10
    val j:Int=11
    val k:Int=12
    val l:Int=13
    val name:String="John cena"

    if (i>j)
    {
      println("i is greater than j")
    }
    else if(i<k)
    {
      println(s"$i is greater than $k")
    }
    if (name.length()>2)
    {
      print(name.length())
    }
//    else
//    {
//      println("i is lesser than j")
//      println(name.view(1, 4))
//    }
  }
}