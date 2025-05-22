class Solution {
    func isPalindrome(_ x: Int) -> Bool {
         let stringX: String = String(x)
        let charactersX: [Character] = Array(stringX)
        
        var leftPointer: Int = 0
        var rightPointer: Int = charactersX.count - 1
        
        while leftPointer < rightPointer {
            if charactersX[leftPointer] != charactersX[rightPointer] {
                return false
            }
            leftPointer += 1
            rightPointer -= 1
        }
        return true
    }
}