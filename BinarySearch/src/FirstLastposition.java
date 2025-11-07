import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastposition{
    public static int[] searchRange(int[] nums, int target) {
        int first=-1,last=-1;
        int start=0,end=nums.length-1;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(nums[middle]>=target){
                if(nums[middle]==target){
                    first=middle;
                }
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
        int start_left=0,end_left=nums.length-1;
        while(start_left<=end_left){
            int middle=start_left+(end_left-start_left)/2;
            if(nums[middle]<=target){
                if(nums[middle]==target){
                    last=middle;
                }
                start_left=middle+1;
            }else{
                end_left=middle-1;
            }
        }

        return new int[]{first,last};
    }
    public static void main(String[] args) {
        int[] arr={5,7,7,8,8,10};
        int target=8;
        int[] ans=searchRange(arr,target);
        System.out.println(Arrays.toString(ans));
    }
}
