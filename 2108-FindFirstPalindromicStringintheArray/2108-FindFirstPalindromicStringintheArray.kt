        val string = wordsString.toString()
        var reversedWord = ""
        for (i in string.lastIndex downTo 0){
            val character = string[i]
            if (character != '-') {
                reversedWord += character
            }else{
                reversedArray.add(reversedWord)
                reversedWord = ""
            }
        }
        for (i in 0 .. words.lastIndex){
            if(words[i]==reversedArray[i]){
                return words[i]
            }
        }
        return ""
    }
}
["abc","car","ada","racecar","cool"]
