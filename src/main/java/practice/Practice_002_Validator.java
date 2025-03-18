package practice;
import static practice.Practice_001_SelectBubbleInsert.*;

public class Practice_002_Validator {

	public static void main(String[] args) {
		System.out.println("开始测试");
		int n = 100;
		int v = 1000;
		int[] arr = randomArray(n,v);
		int[] arr1 = copyArray(arr);
		int[] arr2 = copyArray(arr);
		int[] arr3 = copyArray(arr);
		selectionSort(arr1);
		BubbleSort(arr2);
		insertSort(arr3);
		if(sameArray(arr1, arr2)&&sameArray(arr3, arr2)) {
			System.out.println("错误");
		}
		System.out.println("结束测试");
	}

	// 得到一个随机数组
	public static int[] randomArray(int n, int v) {
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * v) + 1;
		}
		return arr;
	}

	// 复制数组
	public static int[] copyArray(int[] arr) {
		int n = arr.length;
		int[] ans = new int[n];
		for (int i = 0; i < n; i++) {
			ans[i] = arr[i];
		}
		return ans;
	}

	// 比较两个数组是否相等
	public static boolean sameArray(int[] arr1, int[] arr2) {
		int n = arr1.length;
		for (int i = 0; i < n; i++) {
			if (arr2[i] != arr1[i]) {
				return false;
			}
		}
		return true;
	}
}
