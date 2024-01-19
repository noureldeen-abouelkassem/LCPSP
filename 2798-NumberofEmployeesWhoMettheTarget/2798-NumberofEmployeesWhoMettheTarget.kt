class Solution {
    fun numberOfEmployeesWhoMetTarget(hours: IntArray, target: Int): Int {
            var initial = -1
            hours.sort()
            for (i in hours.indices) {
                if (hours[i] >= target) {
                    initial = i
                    break
                }
            }
            return if (initial != -1) hours.size - initial else 0
    }
}
[
