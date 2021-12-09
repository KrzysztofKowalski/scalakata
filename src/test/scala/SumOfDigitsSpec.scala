import collection.mutable.Stack
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.dsl.MatcherWords.*

import collection.mutable.Stack
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SumOfDigitsSpec extends AnyFlatSpec with Matchers {

  /**
   * Digital root is the recursive sum of all the digits in a number.
   *
   * Given n, take the sum of the digits of n. If that value has more than one digit, continue reducing in this way until a single-digit number is produced. The input will be a non-negative integer.
   * Examples
   *
   * 16  -->  1 + 6 = 7
   *
   * 942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
   *
   * 132189  -->  1 + 3 + 2 + 1 + 8 + 9 = 24  -->  2 + 4 = 6
   *
   * 493193  -->  4 + 9 + 3 + 1 + 9 + 3 = 29  -->  2 + 9 = 11  -->  1 + 1 = 2
   *
   *
   */
  val d = new SumOfDigits
  "sum of digits for 16" should "7" in {
    d.digitalRoot(16) should be(7)
  }
  "sum of digits for 942" should "6" in {
    d.digitalRoot(942) should be(6)
  }
  "sum of digits for 132189" should "6" in {
    d.digitalRoot(132189) should be(6)
  }
  "sum of digits for 493193" should "2" in {
    d.digitalRoot(493193) should be(2)
  }
}