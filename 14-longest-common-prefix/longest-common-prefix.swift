class Solution {
    func longestCommonPrefix(_ strs: [String]) -> String {
        let strsSorted = strs.sorted()
        let firstWord = strsSorted.first
        let lastWord = strsSorted.last
        var result = ""
        for i in 0..<firstWord!.count {
            if firstWord![firstWord!.index(firstWord!.startIndex, offsetBy: i)] != lastWord![lastWord!.index(lastWord!.startIndex, offsetBy: i)] {
                return result
            }
            result.append(firstWord![firstWord!.index(firstWord!.startIndex, offsetBy: i)])
        }
        return result
    }
}