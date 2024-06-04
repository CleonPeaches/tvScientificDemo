object Main extends App {
  def lastDigitCounts(numbers: Seq[Int]): Map[Int, Int] = {
    numbers
      .map(_ % 10)                    // Extract the last digit of each number:    List(9, 0, 0, 5, 0, 5)
      .groupBy(identity)              // Group the numbers by their last digit:    Map(5 -> List(5, 5), 9 -> List(9), 0 -> List(0, 0, 0))
      .mapValues(_.size)              // Count the occurrences of each last digit: Map(5 -> 2, 9 -> 1, 0 -> 3)
  }
  
  
  val numbers = Seq(49, 10, 20, 5, 30, 185)
  val result = lastDigitCounts(numbers)
  println(result)  // Output: Map(5 -> 2, 9 -> 1, 0 -> 3)
}