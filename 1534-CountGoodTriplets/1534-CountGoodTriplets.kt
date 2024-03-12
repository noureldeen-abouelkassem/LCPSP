                if (isValidTriplet(arr[i], arr[j], arr[k], a, b, c)) {
                    result++
                }
            }
        }
    }

    return result
    }

    fun isValidTriplet(num1: Int, num2: Int, num3: Int, a: Int, b: Int, c: Int): Boolean {
    return (Math.abs(num1 - num2) <= a &&
            Math.abs(num2 - num3) <= b &&
            Math.abs(num1 - num3) <= c)
}
}
[
