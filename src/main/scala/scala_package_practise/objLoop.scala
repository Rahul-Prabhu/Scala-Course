package scala_package_practise
import scala.util.control.Breaks._

object objLoop {
  def main(arg: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    breakable
    {
      for (i <- 1 to 10)
      {
        if (i==3){
          break
        }
        else
        {
          println(i)
        }
      }
    }
  }
}