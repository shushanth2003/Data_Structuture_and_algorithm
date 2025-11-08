public class SearchInsertion {
    public static int searchInsert(int[] nums, int target) {

        //initialize the state passing from one point to another point
        int start=0,end=nums.length-1;

        //while you re passing it should be find the target
        while(start<=end){
            int middle=start+(end-start)/2;
            if(nums[middle]==target){
                return middle;
            }else if(nums[middle]<target){
                start=middle+1;
            }else{
                end=middle-1;
            }
        }

        //return the position
        return start;
    }
    public static void main(String[] args) {
        int[] nums={1,3,5,6};
        int target=7;
        int res=searchInsert(nums,target);
        System.out.println(res);
    }
}
