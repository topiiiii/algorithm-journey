package practice;

/**
 * 设计循环双端队列
 * 测试链接 : https://leetcode.cn/problems/design-circular-deque/
 *
 * @author lx
 * @date 2025/3/19 10:23
 */
public class Practice_014_CircularDeque {

    class MyCircularDeque {
        int[] queue;
        int r, l, size, limit;

        MyCircularDeque(int k) {
            queue = new int[k];
            l = r = size = 0;
            limit = k;
        }

        boolean insertFront(int num) {
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                r = l = 0;
                queue[l] = num;
            } else {
                l = l == 0 ? (limit - 1) : (l - 1);
                queue[l] = num;
            }

            size++;
            return true;
        }

        boolean insertLast(int num){
            if (isFull()) {
                return false;
            }
            if (isEmpty()) {
                r = l = 0;
                queue[l] = num;
            } else {
                r = r==(limit-1)?0:(r+1);
                queue[r] = num;
            }
            size++;
            return true;
        }

        boolean deleteFront(){
            if (isEmpty()) {
                return false;
            }
            l= l==(limit-1)?0:(l+1);
            size--;
            return true;
        }

        boolean deleteLast(){
            if (isEmpty()) {
                return false;
            }
            r = r==0?(limit-1):(r-1);
            size--;
            return true;
        }

        int getFront(){
            if (isEmpty()) {
                return -1;
            }
            return queue[l];
        }

        int getRear(){
            if (isEmpty()) {
                return -1;
            }
            return queue[r];
        }


        boolean isEmpty() {
            return size == 0;
        }

        boolean isFull() {
            return size == limit;
        }
    }
}
