        var end = num.toLong()
        while (start <= end) {
            val middle = start + (end - start) / 2
            if (middle * middle > num) {
                end = middle.minus(1)
            if (middle * middle < num) {
                start = middle.plus(1)
            }
        }
            }
            if(middle * middle == num.toLong()){
                return middle.toInt()
            }
        return end.toInt()
    }
}
4
