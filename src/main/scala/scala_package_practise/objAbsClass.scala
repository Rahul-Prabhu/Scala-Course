package scala_package_practise

abstract class TV {
  def switchOn()
  def switchOff()
}

final class absTV extends TV {
  def switchOn(): Unit = {
    println("TV is On")
  }
  def switchOff(): Unit = {
    println("TV is Off")
  }
}

object objAbsClass {
  def main(arg: Array[String]) = {
    val abs_tv = new absTV()
    
    abs_tv.switchOn()
    abs_tv.switchOff()
  }
}