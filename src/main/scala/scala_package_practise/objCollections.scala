package scala_package_practise
import scala.collection.immutable._
object objCollections {
  def main(args: Array[String]): Unit = {
    println("***************** Set Description ************************")
    
    val set1 = Set("Rahul", "Umesh", "Chitra")
    println(set1)
    
    val set2 = Set(1, 2, 3, 4, 5)
    println(set2)
    
    val set3 = Set(1, "Rahul", 2)
    println(set3)
    
    println(set3.head)
    println(set3.tail)
    println(set3.isEmpty)
    println("Size of set is : " + set3.size)
    println(set3.contains("Rahul"))
    
    set1.foreach(x=>println(x))
    
    println("*******************Seq Description ****************************")
    
    val seq1 = Seq(1, 2, 3)
    println(seq1.contains(2))
    println(seq1(1))
    
    println("**************List Description*********************")
    
    val list1 = List(1, "Rahul", 2)
    list1.foreach(x=>println(x))
    println(list1(0))
    
    val list2 = "start" :: list1
    println(list2)
    
    val list3 = list2 :+ "end"
    println(list3)
    
    val list4 = list1 ::: list2
    println(list4)
    
    println("***************Vector Description***************")
    val vector1 = Vector(1, 2, "Rahul", 3)
    vector1.foreach(x=>print(s"$x, "))
    println(vector1(0))
    
    println("***************Queue Description***************")
    val q1 = Queue(1, 2, "Rahul", 3)
    
    println("**************Map Descrption*****************")
    val map1 = Map(("id", 24), ("name", "Rahul"))
    println(map1)
    
    val map2 = Map("id"->38, "name"->"Suresh")
    println(map2)
    
    println(map1.keys)
    println(map1.values)
    
    println("**************Tuple Descrption*****************")
    val t1 = (1, 2, 3, 4, "Rahul")
    println(t1)
    println("First value" + t1._1)
    t1.productIterator.foreach(print)
    println()
    
    println("**************Array Descrption*****************")
    val a:Array[Int] = Array(0, 1, 2, 3, 4, 5)
    a.foreach(print)
    println()
    
    println(a(0))
    
  }
}