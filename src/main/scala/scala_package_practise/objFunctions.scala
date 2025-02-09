package scala_package_practise

import scala.io.StdIn

object objFunctions {
  def helloWorld(name: String)
  {
    println(s"Hello $name")
  }
  
  def add(i: Int=100, j: Int=110): Unit = 
  {
    println(i + j)
  }
  
  def main(arg: Array[String])
  {
    print("Enter your Name: ")
    val name = StdIn.readLine()
    val res = helloWorld(name)
    println(add(10, 20))
    
  }
}