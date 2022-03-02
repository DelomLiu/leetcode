class CQueue {

    LinkedList<Integer> stack1; //主要用来存储数据
    LinkedList<Integer> stack2; //用来辅助删除操作

    public CQueue() {
        //初始化
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        //在队列尾部插入整数
        stack1.push(value);
    }

    public int deleteHead() {
        //在队列头部删除整数
        if(stack1.isEmpty() == true)
            return -1;
        while(!stack1.isEmpty())
            stack2.push(stack1.pop());
        int result = stack2.pop();
        while(!stack2.isEmpty())
            stack1.push(stack2.pop());
        return result;
    }
}
