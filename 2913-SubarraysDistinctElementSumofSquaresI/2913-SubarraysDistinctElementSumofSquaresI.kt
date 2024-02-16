class Solution {
  fun·sumCounts(nums:·List<Int>):·Int·{
········val·hashMap·=·hashMapOf<List<Int>,·Int>()
········nums.forEach·{
············println(it)
············hashMap[listOf(it)]·=·hashMap.getOrDefault(listOf(it),·0)·+·1
········}
········hashMap[nums]·=·nums.toSet().count().toDouble().pow(2.0).toInt()
········if(nums.size>2)·{
············var·lastIndex·=·nums.lastIndex
············var·startIndex·=·0
············while·(lastIndex·>·startIndex)·{
················lastIndex--
················startIndex++
················val·rightSub·=·nums.slice(0..lastIndex)
[
