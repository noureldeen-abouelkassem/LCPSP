class Solution {
  fun sumCounts(nums: List<Int>): Int {
       return (1..nums.size).sumOf { nums.windowed(it).sumOf { window-> window.toSet().size.toDouble().pow(2.0)  }.toInt() }
    }
}
[
