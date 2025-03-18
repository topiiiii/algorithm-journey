package practice;

import java.util.Arrays;

import static practice.Practice_002_Validator.randomArray;

/**
 * // 峰值元素是指其值严格大于左右相邻值的元素
 * // 给你一个整数数组 nums，已知任何两个相邻的值都不相等
 * // 找到峰值元素并返回其索引
 * // 数组可能包含多个峰值，在这种情况下，返回 任何一个峰值 所在位置即可。
 * // 你可以假设 nums[-1] = nums[n] = 无穷小
 * // 你必须实现时间复杂度为 O(log n) 的算法来解决此问题。
 *
 * @author lx
 * @date 2025/3/13 16:51
 */
public class Practice_006_FindPeekElement {

    //[162. 寻找峰值 - 力扣（LeetCode）](https://leetcode.cn/problems/find-peak-element/)
    public static int findPeakElement(int[] arr) {
        int n = arr.length;
        //如果只有1位则直接返回
        if (n == 1) {
            return 0;
        }
        //判断 0 位置是不是峰值
        if (arr[0] > arr[1]) {
            return 0;
        }
        //判断 n-1 位置是不是峰值
        if (arr[n - 1] > arr[n - 2]) {
            return n - 1;
        }

        int l = 1, r = n - 2, m = 0, ans = -1;
        while (r >= l) {
            m = l + ((r - l) >> 1);
            if (arr[m] < arr[m - 1]) {
                r = m - 1;
            } else if (arr[m] < arr[m + 1]) {
                l = m + 1;
            } else {
                ans = m;
                break;

            }
        }

        return ans;
    }
}
