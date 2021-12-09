object Acum {
  /**
   * This time no story, no theory. The examples below show you how to write function accum:
   * Examples:
   *
   * accum("abcd") -> "A-Bb-Ccc-Dddd"
   *
   * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
   *
   * accum("cwAt") -> "C-Ww-Aaa-Tttt"
   *
   * The parameter of accum is a string which includes only letters from a..z and A..Z.
   *
   *
   */
  def accum(s: String) = {
    s.toUpperCase.split("").zipWithIndex.map {
      e => (e._1 * (e._2 + 1)).toLowerCase().capitalize
    }.mkString("-")
  }
}
