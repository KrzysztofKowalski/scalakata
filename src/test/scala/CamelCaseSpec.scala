import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CamelCaseSpec extends AnyFlatSpec with Matchers {
  "the_Stealth_Warrior underscore lower start" should "theStealthWarrior" in {
    assert(CamelCase.toCamelCase("the_Stealth_Warrior") === "theStealthWarrior")
  }

  "the-Stealth-Warrior test dash " should "theStealthWarrior" in {
    assert(CamelCase.toCamelCase("the-Stealth-Warrior") === "theStealthWarrior")
  }

  "Street_Street_south_side_left_Black_Street_up_Black_down_left" should "StreetStreetSouthSideLeftBlackStreetUpBlackDownLeft" in {
    assert(CamelCase.toCamelCase("Street_Street_south_side_left_Black_Street_up_Black_down_left") === "StreetStreetSouthSideLeftBlackStreetUpBlackDownLeft")
  }
}
