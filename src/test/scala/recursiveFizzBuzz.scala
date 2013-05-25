import org.scalatest.FunSuite
import recursiveFizzBuzz.RecursiveFizzBuzz
import scala.collection.SortedMap
import scala.collection.mutable.ArrayBuffer

class RecursiveSuite extends FunSuite {
  test("An empty list should return an array") {
    val emptyList = List()
    val resultOfRecursion = RecursiveFizzBuzz.convert(emptyList)
    assert(resultOfRecursion === Array[String])
  }
}
