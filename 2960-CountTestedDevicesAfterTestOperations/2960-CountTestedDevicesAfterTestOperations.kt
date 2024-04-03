class Solution {
    fun countTestedDevices(batteryPercentages: IntArray): Int {
        var testedDevicesCount = 0
        var decrease = 0
        for(batteryPercentage in batteryPercentages) {
            if(batteryPercentage - decrease > 0) {
                testedDevicesCount++
                decrease++
            }
        }
        return testedDevicesCount
    }
[
