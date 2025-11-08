public class Lowerbound {
    public static void main(String[] args) {
        int[] nums={3,5,8,15,19};
        int target=9;
        int ans=lowerBound(nums,target);
        System.out.println(ans);
    }
    public static int lowerBound(int[] nums, int x) {
        int start=0,end=nums.length-1,ans=nums.length;
        while(start<=end){
            int middle=start+(end-start)/2;
            if(nums[middle]>=x){
                ans=middle;
                end=middle-1;
            }else{
                start=middle+1;
            }
        }
        return ans;

    }
}
