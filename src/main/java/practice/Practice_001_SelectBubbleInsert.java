package practice;

public class Practice_001_SelectBubbleInsert {

    public static void main(String[] args) {

    }

    /**
     * 交换方法
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    //选择排序
    public static void selectionSort(int[] arr) {
        if(arr==null || arr.length < 2) {
            return;
        }

        for(int minIndex,i=0;i< arr.length -1;i++) {
            //minIndex:i~n-1的范围上,最小的位置在哪里
            //i位置的数
            minIndex=i;
            // i i+1 i+2 ...
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minIndex]<arr[j]) {
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    //冒泡
    public static void BubbleSort(int[] arr) {
        if(arr==null || arr.length < 2) {
            return;
        }

        for(int minIndex,i=0;i< arr.length -1;i++) {
            //minIndex:i~n-1的范围上,最小的位置在哪里
            //i位置的数
            minIndex=i;
            // i i+1 i+2 ...
            for(int j=i+1;j<arr.length;j++) {
                if(arr[minIndex]<arr[j]) {
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public static void insertSort(int[] arr) {
        if(arr==null || arr.length < 2) {
            return;
        }
        // 4 5 6 1 7
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 && arr[j]<arr[j+1]; j--) {
                swap(arr, i, j);
            }
        }
    }
}
