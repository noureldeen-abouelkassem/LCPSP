    fun ping(t: Int): Int {
        arrayList.add(t)
        return arrayList.count { it in (t - 3000..t) }
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * var obj = RecentCounter()
 * var param_1 = obj.ping(t)
private val arrayList = ArrayList<Int>()
class RecentCounter() {
[
