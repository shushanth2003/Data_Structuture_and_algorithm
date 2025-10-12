import java.util.Arrays;

public class LongestConsectutive {
    public static int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0) return 0;
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1==nums[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
       int[] nums = {9,1,4,7,3,-1,0,5,8,-1,6};
       int ans=longestConsecutive(nums);
        System.out.println(ans);
    }
}
