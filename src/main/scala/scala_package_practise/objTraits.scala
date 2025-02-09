package scala_package_practise

object objTraits {
  
  class BaseClass {
    def base(): Unit = {
      println("This is base class")
    }
  }
  
  trait MySchool extends BaseClass {
    def school(): Unit = {
      println("This is my school")
    }
  }
  
  trait MyCollege extends BaseClass {
    def college(): Unit = {
      println("This is my college")
    }
  }
  
  class Student extends MyCollege with MySchool {
    
  }
  
  def main(arg: Array[String]): Unit = {
    val s = new Student
    s.college
    s.school
    s.base
  }
}