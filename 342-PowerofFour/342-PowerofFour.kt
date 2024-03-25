            return powerCheck(1, n)
    }

    private fun powerCheck(current: Int, target: Int): Boolean {
        return if (4.0.pow(current) == target.toDouble())
            true
        else if (4.0.pow(current) < target.toDouble())
            powerCheck(current.plus(1), target)
        else
            false
    }
}
        else
            return true
        if(n == 1) 
            return false
1
