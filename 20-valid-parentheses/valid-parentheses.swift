struct Stack<Element> {
    private var items: [Element] = []
    
    mutating func push(_ element: Element) {
        items.insert(element, at: 0)
    }
    
    mutating func pop() -> Element? {
        return items.removeFirst()
    }
    
    func isEmpty() -> Bool {
        return items.isEmpty
    }
}

class Solution {
    func isValid(_ s: String) -> Bool {
        var stack = Stack<Character>()
        
        for char in s {
            switch char {
            case "(", "[", "{":
                stack.push(char)
            case "}":
                if stack.isEmpty() || stack.pop() != "{" {
                    return false
                }
            case "]":
                if stack.isEmpty() || stack.pop() != "[" {
                    return false
                }
            case ")":
                if stack.isEmpty() || stack.pop() != "(" {
                    return false
                }
            default:
                break
            }
        }
        return stack.isEmpty()
    }
}