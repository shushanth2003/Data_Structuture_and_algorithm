public class FindPeakElement {
    public static void main(String[] args){
        int[] nums={1,2,1,3,5,6,4};
        int ans=findPeakElement(nums);
        System.out.println(ans);
    }

    private static int findPeakElement(int[] nums) {
        int max=nums[0];
        int maximum=0;
        for (int i = 0; i < nums.length; i++) {
            if(max<nums[i]){
                max=nums[i];
                maximum=i;
            }
        }
        return maximum;
    }

}
