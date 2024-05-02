}
    fun empty() = isEmpty()
    fun top() = first()
    fun pop() = remove()
    }
      repeat(size - 1) { add(pop()) } 
    fun push(x: Int) {
      add(x)
class MyStack: Queue<Int> by LinkedList() {

/**
 * Your MyStack object will be instantiated and called as such:
 * var obj = MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
[
