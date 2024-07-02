    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val nums1Sorted = nums1.sorted()
        val nums2Sorted = nums2.sorted()
        var nums1Counter = 0
        var nums2Counter = 0
        var intersection = mutableListOf<Int>()
        while (nums1Counter < nums1.size && nums2Counter < nums2.size){
            if (nums1Sorted[nums1Counter] == nums2Sorted[nums2Counter]) {
                intersection.add(nums1Sorted[nums1Counter])
            } else if (nums1Sorted[nums1Counter] < nums2Sorted[nums2Counter]) {
                nums1Counter++
            } else {
                nums2Counter++
            }
        }
                nums1Counter++
                nums2Counter++
[
