class Solution {
        fun romanToInt(s: String): Int {
            val romanToIntMap: MutableMap<Char, Int> = mutableMapOf()
        val specialCases: MutableMap<String, Int> = mutableMapOf()
        romanToIntMap['I'] = 1
        romanToIntMap['V'] = 5
        romanToIntMap['X'] = 10
        romanToIntMap['L'] = 50
        romanToIntMap['C'] = 100
        romanToIntMap['D'] = 500
        romanToIntMap['M'] = 1000
        specialCases["IV"] = 4
        specialCases["IX"] = 9
        specialCases["XL"] = 40
        specialCases["XC"] = 90
        specialCases["CD"] = 400
        specialCases["CM"] = 900
        var result = 0
        var slow = 0
        var fast: Int
        while (slow < s.length) {
            fast = slow + 1
            if (fast < s.length && specialCases.containsKey(s.slice(slow..fast))) {
                result += specialCases[s.slice(slow..fast)]!!
                slow += 2
            } else {
                result += romanToIntMap[s[slow]] ?: 0
                slow++
            }
        }
        return result
        }
}