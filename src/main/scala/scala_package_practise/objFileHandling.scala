package scala_package_practise
import java.io.File
import java.io.PrintWriter
import java.io.FileOutputStream

object objFileHandling {
  def main(args:Array[String]) = {
    val writer = new PrintWriter(new FileOutputStream(new File("C:\\Users\\rahul\\tp.txt"), false)) // true for append and false for overwrite
    writer.write("This is new file3")
    writer.close()
  }
}