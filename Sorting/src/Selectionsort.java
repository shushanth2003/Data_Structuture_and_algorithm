import java.util.Arrays;
import java.util.Scanner;

public class Selectionsort {
    public static void main(String[] args){
        int[] arr={5,3,8,1,6,10,9,200,84};
        int[] ans=selectionSort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] selectionSort(int[] arr){
        if(arr.length==1) return arr;
        for (int i = 0; i < arr.length-1; i++) {
            int minIndex=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        return arr;
    }
}
