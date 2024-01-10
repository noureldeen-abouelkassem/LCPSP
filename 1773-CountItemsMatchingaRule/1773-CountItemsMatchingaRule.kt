class Solution {
    fun countMatches(items: List<List<String>>, ruleKey: String, ruleValue: String): Int {
        var result = 0
        val type = "type"
        val color = "color"
        val name = "name"
        items.forEach {
            when(ruleKey){
                type ->{
                    if(it[0] == ruleValue){
                        result++
                    }
                }
                color ->{
                    if(it[1] == ruleValue){
                        result++
                    }
                }
                name-> {
[
