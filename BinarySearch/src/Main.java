public class Main {
    public static int binarySearch(int[] arr,int target){
        int start=0,end=arr.length,middle=0;
        while(start<=end){
            middle=start+(end-start)/2; // initialize the middle number
            if(arr[middle]==target){
                return middle;
            }
            if(arr[middle]<target)
                start=middle+1;
            else
                end=middle-1;
        }
        return middle;
    }
    public static void main(String[] args) {
        int[] arr={-1,0,3,5,9,12};
        int target=9;
        int ans=binarySearch(arr,target);
        System.out.println(ans);
    }
}