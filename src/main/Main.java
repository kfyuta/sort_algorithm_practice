package main;

public class Main {
    public static void main(String[] args) {
        int[] a = {4,7,1,6,2,5,3};
        QuickSort.sortArray(a, 0, a.length - 1, SortOrder.ASC);
        printArray(a);
        int[] b = {4,7,1,6,2,5,3};
        QuickSort.sortArray(b, 0, b.length - 1, SortOrder.DESC);
        printArray(b);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(',');
            }
        }
        System.out.println();
    }
}