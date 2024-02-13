            bitset = bitset or (1 shl (char - 'a'))
        }

        for(word in words) {
            for(char in word.toCharArray()) {
                if(bitset and (1 shl (char - 'a')) == 0) {
                    count--
                    break
                }
            }
        }
    
        return count
    }

}
"
