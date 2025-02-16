package scala_package_practise

object objCollectionMethods {
  def main(args: Array[String]): Unit = {
    
    val list = List("Data-analytics", "Big Data - Coding")
    val num = List(1,2,3,4,5,6)
    val name = List("one", "two", "three", "four")
    println(list)

    //map method: Takes a fn and applies fn to each and every element of collection
    println("************map function***************")
    val map = list.map(x=>x+"| Message")
    println(map)
    val map_upper = list.map(x=>x.toUpperCase())
    println(map_upper)
    val map_lower = list.map(x=>x.toLowerCase())
    println(map_lower)
    val map_num = list.map(x=>x*2)
    
    println("******************flatmap function***********************")
    val flatMap = list.flatMap(x=>x+",Message")
    println(flatMap)
    
    val upper_flatMap = list.flatMap(x=>x.toUpperCase())
    println(upper_flatMap)
    
    val lower_flatMap = list.flatMap(x=>x.toLowerCase())
    println(lower_flatMap)
    
    val map_split = list.flatMap(x=>x.split("-"))
    println(map_split)
    
    println("*****************filter function********************************************")
    val fil1 = list.filter(x=>x.contains("Coding"))
    println(fil1)
    
    val fil2 = list.filter(x=>x.endsWith("analytics"))
    println(fil2)
    
    val fil3 = num.filter(x=>x%2==0)
    println(fil3)
    
    println("********************count function*********************")
    val cnt = num.count(x=>x%2==0)
    println(cnt)
    
    println("*********************exists function**************")
    val exist = num.exists(x=>x%2==0)
    println(exist)
    list.foreach(println)
    
    println("**********************partition****************************")
    val part_even = num.partition(x=>x%2==0)
    println(part_even)
    
    println("*****************************reduce Left********************")
    println(num)
    println(name)
    val reduce_left = num.reduceLeft(_-_)
    println(reduce_left)
    val reduce_left_name = name.reduceLeft(_+_)
    println(reduce_left_name)
    val reduce_left_print = name.reduceLeft((x,y)=>x)
    println(reduce_left_print)
    
    println("******************************reduce Right**************************")
    println(num)
    println(name)
    val reduce_right = num.reduceRight(_-_)
    println(reduce_right)
    val reduce_right_name = name.reduceRight(_+_)
    println(reduce_right_name)
    val reduce_right_print = name.reduceRight((x,y)=>y)
    println(reduce_right_print)
    
    println("*******************************Fold left and Fold Right****************************")
    val fold_left = num.foldLeft(100)(_+_)
    println(fold_left)
    val fold_left_name = name.foldLeft("Robin")(_+_)
    println(fold_left_name)
    
    val fold_right = num.foldRight(100)(_+_)
    println(fold_right)
    val fold_right_name = name.foldRight("Robin")(_+_)
    println(fold_right_name)
    
    println("*******************************Scan left and Scan Right****************************")
    val scan_left = num.scanLeft(100)(_+_)
    println(scan_left)
    val scan_left_name = name.scanLeft("Robin")(_+_)
    println(scan_left_name)
    
    val scan_right = num.scanRight(100)(_+_)
    println(scan_right)
    val scan_right_name = name.scanRight("Robin")(_+_)
    println(scan_right_name)
  }
}