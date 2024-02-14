class Solution {
    val morse = arrayOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")

fun uniqueMorseRepresentations(words: Array<String>) = words.map { word ->
    word.map { char -> morse[char - 'a']}
        .joinToString("")
    }.toSet().size
}
[
