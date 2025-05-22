class Solution {
    func isPalindrome(_ x: Int) -> Bool {
         let stringX: String = String(x)
        var leftPointer: Int = 0
        var rightPointer: Int = stringX.count - 1
        
        while leftPointer < rightPointer {
            if stringX[stringX.index(stringX.startIndex, offsetBy: leftPointer)] != stringX[stringX.index(stringX.startIndex, offsetBy: rightPointer)] {
                return false
            }
            leftPointer += 1
            rightPointer -= 1
        }
        return true
    }
}