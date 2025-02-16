package scala_package_practise

class c_ExceptionExample {
  def divide(x: Int, y: Int): Unit = {
    try {
      println(x/y)
    }
    catch {
      case e:java.lang.ClassNotFoundException => println("Cannot divide by zero.")
      case _:Exception => throw new Exception("A new exception thrown by me")
    }
    finally {
      println("This function terminates here.")
    }
  }
}

class ExceptionExampleThrows(age: String) {
  def ExceptionExampleThrows() = {
    val this.age=age
  }
  @throws(classOf[NumberFormatException])
  def validate_age()
  {
    println(age.toInt)
  }
}

object exceptionExample {
    def main(arg: Array[String]): Unit = {
      val c = new c_ExceptionExample()
      c.divide(10,20)
      
      val e = new ExceptionExampleThrows("1")
      e.validate_age()
    }
}
