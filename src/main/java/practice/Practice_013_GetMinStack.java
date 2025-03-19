package practice;

import java.util.Stack;

/**
 * 最小栈
 *测试链接 : https://leetcode.cn/problems/min-stack/
 * @author lx
 * @date 2025/3/18 23:14
 */
public class Practice_013_GetMinStack {

    class MinStack {
        public Stack<Integer> data;
        public Stack<Integer> min;

        public MinStack() {
            data = new Stack<Integer>();
            min = new Stack<Integer>();
        }

        void push(int val){
            if (min.isEmpty()||val<min.peek()) {
                min.push(val);
            }else {
                min.push(min.peek());
            }
            data.push(val);
        }

        public void pop() {
            data.pop();
            min.pop();
        }

        public int top() {
            return data.peek();
        }

        public int getMin() {
            return min.peek();
        }

    }

}
