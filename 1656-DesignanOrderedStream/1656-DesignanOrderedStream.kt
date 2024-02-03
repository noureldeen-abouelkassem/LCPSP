
    private var lastFilledIndexInMap = 0
    private val map = mutableMapOf<Int, String>()

    fun insert(idKey: Int, value: String): List<String> {
        map[idKey] = value
        return if (hasGap(idKey)) emptyList() else getList(idKey)  
    }

    private fun getList(idKey: Int): List<String> {
        val result = mutableListOf<String>()
        while(map[lastFilledIndexInMap + 1] != null) result.add(map[++lastFilledIndexInMap]!!)
        return result
    }

    private fun hasGap(idKey: Int): Boolean {
        for (i in 1..idKey) if (map[i] == null) return true
        return false
    }

[
