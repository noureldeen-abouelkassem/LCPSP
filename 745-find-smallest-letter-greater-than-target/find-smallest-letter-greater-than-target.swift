class Solution {
    func nextGreatestLetter(_ letters: [Character], _ target: Character) -> Character {
    var result = letters[0]
    
    guard result < target || target <= letters.last! else {
        return result
    }
    
    var low = 0
    var high = letters.count - 1
    
    while low <= high {
        let mid = (low + high) / 2
        if letters[mid] > target {
            result = letters[mid]
            high = mid - 1
        } else {
            low = mid + 1
        }
    }
    return result
}
}