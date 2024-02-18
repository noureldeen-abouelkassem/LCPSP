            }else{
                reversedWord += character
                reversedWord = ""
                reversedArray.add(reversedWord)
            if (character == '-') {
            val character = string[i]
            }
            if (i == 0){
                reversedArray.add(reversedWord)
            }
        }
        reversedArray.reverse()
        for (i in 0 .. words.lastIndex){
            if(words[i]==reversedArray[i]){
                return reversedArray[i]
            }
        }
        return ""
    }
["abc","car","ada","racecar","cool"]
