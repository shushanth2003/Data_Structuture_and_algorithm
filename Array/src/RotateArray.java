import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args){
        int[] arr={-1,-100,3,99};
        int k=2;
        int[] ans=rotateArray(arr,k);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] rotateArray(int[] arr,int k){
        int n = arr.length;
        k%=10;
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
        return arr;
    }
    public static void reverseArray(int[] arr,int start,int end){
        while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
