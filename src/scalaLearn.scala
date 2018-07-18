object ScalaLearn {
  def main(args: Array[String])
  {
    val list_A : List[Int] = List(36,12,78,4,25,43,2,46,31,54)
    println("new List: "+list_A)
    val list_B  = list_A.map(_*10)
    println("ListElements *10: " + list_B)
    val list_C = list_A.filter(_%2==0)
    println("ListElements %2==0: "+list_C)
    val list_D = list_A.sorted
    println("Sorted: "+list_D)
    var list_E = list_A.reverse
    println("Reverse: " + list_E)
    var group_result = list_A.grouped(4)
    var list_F = group_result.toList
    println("Devide: "+list_F)
    var list_G = list_F.flatten
    println("Flatten: "+list_G)
    println("Words Count:")
    val wordList = List("From hometown","hello world",
      "hi hive","hello spring","hi hdfs")
    println(wordList)
    println(  wordList.flatMap(_.split(" "))
      .map((_,1))
      .groupBy(_._1)
      .map(t=>(t._1,t._2.size))
      .toList
      .sortBy(_._2)
      .reverse)
  }
}
