package practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import static practice.Practice_002_Validator.*;

public class Practice_003_FindNumber {

	public static void main(String[] args) {
		int n = 100;
		int v =1000;
		int testTime = 500;
		System.out.println("测试开始");
		for (int i = 0; i < testTime; i++) {
			int[] arr =randomArray(n,v);
			int number  = (int) (Math.random() * n);
			Arrays.sort(arr);
			if (findNumber(arr, number)!=exit(arr,number)) {
				System.out.println("出错啦");
			}
		}
		System.out.println("测试结束");

	}

	public static boolean findNumber(int[]arr,int number) {
		for (int i : arr) {
			if(i==number) {
				return true;
			}
		}
		return false;
	}

	public static boolean exit(int[] arr, int number) {
		if (arr == null || arr.length == 0) {
			return false;
		}
		int l = 0, r = arr.length;
		while(r>=l) {
			int m=(l+r)/2;
			if(arr[m]>number) {
				r=m-1;
			}else if (arr[m]<number) {
				l=m+1;
			}else {
				return true;
			}
		}
		return false;
	}
}
