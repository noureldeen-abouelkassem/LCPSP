class Solution {
    fun letterCombinations(originalDigits: String): List<String> {
        if (originalDigits.isEmpty()) return emptyList()
        val result = mutableListOf<String>()
        combRec(originalDigits, 0, "", result)
        return result
    }

    fun combRec(originalDigits: String, position: Int, comb: String, result: MutableList<String>) {
        if (position == originalDigits.length) {
            result.add(comb)
            return
        }
        DIGITS_MAP[originalDigits[position]]?.forEach { variety ->
            combRec(originalDigits, position+1, comb + variety, result)
        }
    }

    companion object {
        val DIGITS_MAP = hashMapOf(
            '2' to "abc",
            '3' to "def",
            '4' to "ghi",
            '5' to "jkl",
            '6' to "mno",
            '7' to "pqrs",
            '8' to "tuv",
            '9' to "wxyz"
        )
    }
}