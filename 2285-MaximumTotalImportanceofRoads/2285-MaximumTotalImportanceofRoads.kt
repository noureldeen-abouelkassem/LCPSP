        var arr = IntArray(n)
        var rez = 0L
        for (road in roads) {
            arr[road[0]] ++
            arr[road[1]] ++
        }
        arr.sortDescending ()
        var i = n
        for (a in arr) {
            if (a==0) break
            rez += i.toLong()*a.toLong()
            i--
        }
        return rez
    fun maximumImportance(n: Int, roads: Array<IntArray>): Long {
class Solution {
    }
5
