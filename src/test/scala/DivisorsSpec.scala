import collection.mutable.Stack
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.dsl.MatcherWords.*
import org.scalatest.matchers.should.Matchers

class DivisorsSpec extends AnyFlatSpec with Matchers  {
  val divisors = new Divisors
  "divisors(1)" should "return 1" in {
    divisors.divisors(1) should be (1)
  }

  "divisors(10)" should "return 4" in {
    divisors.divisors(10) should be (4)
  }

  "divisors(11)" should "return 2" in {
    divisors.divisors(11) should be (2)
  }

  "divisors(36)" should "return 9" in {
    divisors.divisors(36) should be (9)
  }

  "divisors(54)" should "return 8" in {
    divisors.divisors(54) should be (8)
  }
}
