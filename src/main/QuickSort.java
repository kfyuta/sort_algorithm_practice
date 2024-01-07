package main;

public class QuickSort {
    public static void sortArray(int[] a, int start, int end, SortOrder order){
        if(order == SortOrder.ASC) {
            sortArrayAsc(a, start, end);
        }
        if(order == SortOrder.DESC) {
            sortArrayDesc(a, start, end);
        }
    }

    private static void sortArrayAsc(int[] a, int start, int end){
        if(start < end) {
            int pivot = divideArrayAsc(a, start, end);
            sortArrayAsc(a, 0, pivot - 1);
            sortArrayAsc(a, pivot + 1, end);
        }
    }

    private static void sortArrayDesc(int[] a, int start, int end) {
        if (start < end) {
            int pivot = divideArrayDesc(a, start, end);
            sortArrayDesc(a, 0, pivot - 1);
            sortArrayDesc(a, pivot + 1, end);
        }
    }

    private static int divideArrayAsc(int[] a, int head, int tail){
        int left = head + 1;
        int right = tail;
        while(true){
            while(left < tail && a[head] > a[left]){
                left++;
            }
            while(a[head] < a[right]) {
                right--;
            }
            if(left >= right){
                break;
            }
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;

            left++;
            right--;
        }
        int tmp = a[head];
        a[head] = a[right];
        a[right] = tmp;
        return right;
    }

    private static int divideArrayDesc(int [] a, int head, int tail){
        int left = head + 1;
        int right = tail;
        while(true){
            while(left < tail && a[head] < a[left]){
                left++;
            }
            while(a[head] > a[right]){
                right--;
            }
            if(left >= right) {
                break;
            }
            int tmp = a[left];
            a[left] = a[right];
            a[right] = tmp;
        }
        int tmp = a[head];
        a[head] = a[right];
        a[right] = tmp;
        return right;
    }
}
