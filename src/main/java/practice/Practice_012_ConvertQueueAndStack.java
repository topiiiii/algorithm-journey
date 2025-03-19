package practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 队列和栈相互实现
 *
 * @author lx
 * @date 2025/3/18 22:40
 */
public class Practice_012_ConvertQueueAndStack {

    // 测试链接 : https://leetcode.cn/problems/implement-queue-using-stacks/
    class MyQueue{
        public Stack<Integer> in;
        public Stack<Integer> out;

        void push(int x){
            in.push(x);
            inToOut();
        }

        private void inToOut(){
            if (out.isEmpty()) {
                while (!in.isEmpty()) {
                    out.push(in.pop());
                }
            }
        }

        int pop(){
            inToOut();
            return out.pop();
        }

        public int peek() {
            inToOut();
            return out.peek();
        }

        public boolean empty() {
            return in.isEmpty() && out.isEmpty();
        }

    }



    // 测试链接 : https://leetcode.cn/problems/implement-stack-using-queues/
    class MyStack {

        Queue<Integer> queue;

        public MyStack() {
            queue = new LinkedList<Integer>();
        }

        void push(int x){
            int size = queue.size();
            queue.offer(x);
            for (int i = 0; i < size - 1; i++) {
                queue.offer(queue.poll());
            }
        }

        public int pop() {
            return queue.poll();
        }

        public int top() {
            return queue.peek();
        }

        public boolean empty() {
            return queue.isEmpty();
        }


    }
}
