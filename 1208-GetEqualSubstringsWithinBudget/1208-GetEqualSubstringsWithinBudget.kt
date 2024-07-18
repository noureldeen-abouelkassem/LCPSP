        var best = 0
        for (right in s.indices) {
            var costOfRight = abs(s[right]-t[right]).toInt()
            totalCost+= costOfRight
            while (totalCost > maxCost) {
                var costOfLeft = abs(s[left]-t[left]).toInt()
                totalCost-= costOfLeft
                left++
            }
            best = maxOf(best, right-left +1)
        }
        return best
    }
"abcd"
