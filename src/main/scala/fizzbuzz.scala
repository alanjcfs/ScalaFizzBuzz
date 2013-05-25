import scala.collection.SortedMap

object FizzBuzz {

  def generator(mapping: SortedMap[Int, String], lst: List[Int]): List[String] = {

    // sort Map descending - Unimplemented

    // Something very simple
    // (n: Int) => {
    val l = lst map((n) => {
      val result = mapping.foldLeft("")( (acc, kv) => acc + getResult(kv._1, kv._2, n))
      if (result.isEmpty) { n.toString }
      else { result }
    })
    return l
    // }
  }

  def getResult(key: Int, value: String, num: Int): String = {
    if (num % key == 0) { value }
    else { "" }
  }

  def main(args: Array[String]) {
    val listOfNumbers = (0 to 105).toList
    val sortedDescending = listOfNumbers sortWith((x, y) => x > y)

    val tuples = SortedMap((5, "Bar"), (7, "Piyo"), (3, "Foo"))

    val generatedFunctions = generator(tuples, sortedDescending)
    println(generatedFunctions)

  }
}