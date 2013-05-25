 import org.scalatest.FunSuite
 class NumberSuite extends FunSuite {

   test("3 and 3 is 6") {
     val num = 3 + 3
     assert(num === 6)
   }
 }
//  import org.specs2.mutable._
// 
//  class HelloWorldSpec extends Specification {
//    "The 'Hello World' string" should {
//      "contain 11 characters" in {
//        "Hello world" must have size(11)
//      }
//    }
//  }

// import org.scalacheck.Properties
// import org.scalacheck.Prop.forAll
// 
// object StringSpecification extends Properties("String") {
//   property("startsWith") = forAll((a: String, b: String) => (a+b).startsWith(a))
// 
//   property("concatenate") = forAll((a: String, b: String) =>
//     (a+b).length > a.length && (a+b).length > b.length
//   )
// 
// property("substring") = forAll((a: String, b: String, c: String) =>
//   (a+b+c).substring(a.length, a.length+b.length) == b
// )
                  // }

