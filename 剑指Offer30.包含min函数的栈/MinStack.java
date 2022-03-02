class MinStack {

    /** initialize your data structure here. */
    LinkedList<Integer> stack; //存储数据
    LinkedList<Integer> min_stack; //存储最小值

    public MinStack() {
        stack = new LinkedList<>();
        min_stack = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
        if (min_stack.isEmpty()) {
            min_stack.push(x);
        } else if (min_stack.peek() < x) {
            min_stack.push(min_stack.peek());
        } else {
            min_stack.push(x);
        }
    }

    public void pop() {
        stack.pop();
        min_stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return min_stack.peek();
    }
}