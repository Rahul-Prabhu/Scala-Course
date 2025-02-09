package scala_package_practise


class ParentClass {
  def parent(): Unit ={
    println("I am parent")
  }
  
  def addNums(a: Int, b: Int): Int = {
    a+b
  }
}

class BaseClass extends ParentClass {
  override def parent(): Unit = {
    println("I am child")
  }
  
  def addNums(a: Int, b:Int, c: Int): Int = {
    a+b+c
  }
}
object objMethodOverloadingOverriding {
  def main(arg: Array[String]) = {
    val b = new BaseClass
    b.parent()
    print(b.addNums(1, 2, 3))
  }
}