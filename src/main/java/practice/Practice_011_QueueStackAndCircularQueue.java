package practice;

/**
 * 队列
 *
 * @author lx
 * @date 2025/3/16 17:20
 */
public class Practice_011_QueueStackAndCircularQueue {

    //数组实现队列
    public static class Queue {

        public int[] queue;
        public int l;
        public int r;

        public Queue(int n) {
            queue = new int[n];
            r = 0;
            l = 0;
        }

        public boolean isEmpty() {
            return l == r;
        }

        public void offer(int num) {
            queue[r++] = num;
        }

        public int poll() {
            return queue[l++];
        }

        public int head() {
            return queue[l];
        }

        public int tail() {
            return queue[r - 1];
        }

        public int size() {
            return r - l;
        }
    }

    public static class Stack {
        public int[] stack;
        public int size;

        public Stack(int n) {
            stack = new int[n];
            size = 0;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void push(int num) {
            stack[size++] = num;
        }

        public int pop() {
            return stack[--size];
        }

        public int peek() {
            return stack[size - 1];
        }
    }


    // 设计循环队列
    // 测试链接 : https://leetcode.cn/problems/design-circular-queue/
    class MyCircularQueue {

        public int[] queue;
        public int size, l, r, limit;

        public MyCircularQueue(int k) {
            queue = new int[k];
            limit = k;
            l = r = size = 0;
        }

        public int Front() {
            if (isEmpty()) {
                return -1;
            }
            return queue[r];
        }

        public int Rear() {
            if (isEmpty()) {
                return -1;
            }
            int last = r==0?(limit-1):(r-1);
            return queue[last];
        }

        public boolean enQueue(int value) {
            if (isFull()) {
                return false;
            }
            queue[r] = value;
            r = r == limit-1 ? 0 : ++r;
            size++;
            return true;
        }

        public boolean deQueue() {
            if (isEmpty()) {
                return false;
            }
            l = l == limit-1 ? 0 : --l;
            size--;
            return true;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == limit;
        }

    }


}
