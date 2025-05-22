class Solution {
    func isPalindrome(_ x: Int) -> Bool {
         let stringX: String = String(x)
        let reversedStringX: String = String(stringX.reversed())
        
        if stringX == reversedStringX {
            return true
        }
        return false
    }
}