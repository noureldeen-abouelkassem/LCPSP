                numberOne *= BigInteger.valueOf(10)
        }
        num2.forEachIndexed { index, c ->
            numberTwo += hash[c]!!.toBigInteger()
            if (index < num2.lastIndex)
                numberTwo *= BigInteger.valueOf(10)
        }
        return (numberOne * numberTwo).toString()
    }
}
"
