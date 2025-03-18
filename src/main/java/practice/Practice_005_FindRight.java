package practice;

import java.util.Arrays;

import static practice.Practice_002_Validator.randomArray;

/**
 * 有序数组中找到靠近指定数字的最右位置
 *
 * @author lx
 * @date 2025/3/13 16:51
 */
public class Practice_005_FindRight {

    public static void main(String[] args) {
        int n = 100;
        int v =1000;
        int testTime = 500;
        System.out.println("测试开始");
        for (int i = 0; i < testTime; i++) {
            int[] arr =randomArray(n,v);
            int number  = (int) (Math.random() * n);
            Arrays.sort(arr);
            if (right(arr,number)!=findRight(arr,number)) {
                System.out.println("出错啦");
            }

        }
        System.out.println("测试结束");
    }

    public static int right(int[] arr, int number) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= number) {
                return i;
            }
        }
        return -1;
    }

        public static int findRight(int[] arr,int number){
        int ans=-1;
        int l=0,r=arr.length-1,m=0;
        while (r>=l){
            m = l+((r-l)>>1);
            if (arr[m]<=number) {
                ans = m;
                l = m+1;
            }else {
                r = m-1;
            }
        }
        return ans;
    }
}
