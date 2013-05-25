import scala.collection.SortedMap
import scala.collection.mutable.ArrayBuffer

object HogeFuga {
  def main(args: Array[String]) {
    val tuples = SortedMap((3, "Hoge"), (5, "Fuga"), (7, "Piyo"))
    val listOfNumbers = (1 to 105).toList

    val arrayOfStrings = applyTuplesToList(tuples, listOfNumbers)

    for(s <- arrayOfStrings) {
        println(s)
    }
  }

  def applyTuplesToList(tuples: SortedMap[Int, String], listOfNumbers: List[Int]): ArrayBuffer[String] = {
      val array = new ArrayBuffer[String]
      for (num <- listOfNumbers) {
          var accumulated = ""
          for ((key, value) <- tuples) {
              if (num % key == 0) {
                  accumulated += value
              }
          }
          if (accumulated.isEmpty) {
              array += num.toString
          }
          else { array += accumulated }
      }
      return array
  }
}