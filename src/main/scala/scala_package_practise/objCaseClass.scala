package scala_package_practise

case class emp(name: String, Id: Int, zipCode: Int)

object objCaseClass {
  def main(arg: Array[String]) = {
    val empl1 = emp("John", 12345, 400836)
    print(empl1.name)
  }
}