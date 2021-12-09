object CamelCase {
  /**
   * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
   * Examples
   *
   * "the-stealth-warrior" gets converted to "theStealthWarrior"
   *
   * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
   *
   */
  def toCamelCase(str: String): String = if (str.isEmpty) {
    ""
  } else {
    val c: Char = str(0)
    val res = str.toLowerCase.split("[\\-_]").map(_.capitalize).mkString
    if (c.isUpper) {
      res
    } else {
      List(res(0).toLower, res.splitAt(1)._2).mkString("")
    }
  }
}
