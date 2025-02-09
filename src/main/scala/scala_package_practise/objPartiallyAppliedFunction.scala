package scala_package_practise
import java.util.Date

object objPartiallyAppliedFunction {
  
  def loginFunction(date: Date, msg: String) = {
    println(s"Date: $date, LoginMsg: $msg")
  }
  def main(arg: Array[String]) = {
    val sum = (x: Int, y: Int, z: Int)=>x + y + z
    val par_sum = sum(10, _: Int, _: Int)
    
    println(par_sum(20, 30))
    
    val date = new Date()
    val login_function = loginFunction(date: Date, _: String)
    login_function("User is logged in")
  }
}