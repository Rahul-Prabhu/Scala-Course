package scala_package_practise

class Bike {
  def break(): Unit = {
    println("Left Steering")
  }
  
  def accelerator(): Unit = {
    println("Right Steering")
  }
  
  def handBreak(): Unit = {
    println("Hand Break")
  }
}

class Car extends Bike{
  
  val bike = new Bike
  bike.break
  
  override def accelerator():Unit = {
    println("Right pedal")
  }
  
  override def break(): Unit = {
    println("Middle Pedal")
  }
}

object objInheritance{
  
  def main(args: Array[String]): Unit = {
    val car = new Bike
    car.accelerator()
    car.handBreak()
  }
}