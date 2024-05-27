            var result = 0
            while (outerPointer <= words.lastIndex.minus(1)) {
                if(words[outerPointer].commonPrefixWith(words[innerPointer]) == words[outerPointer] && words
[outerPointer].commonSuffixWith(words[innerPointer]) == words[outerPointer]){
                    result++  
                }
            var innerPointer = 1
            }
            return result
            var outerPointer = 0
        } else {
            return 0
                if(innerPointer == words.size){
                        outerPointer++
                        innerPointer = outerPointer + 1
                }
        }
                innerPointer++
    }
}
["a","aba","ababa","aa"]
