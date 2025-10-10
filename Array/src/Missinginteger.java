public class Missinginteger {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,5};
        int ans=missingInteger(nums);
        System.out.println(ans);
    }
    public static int missingInteger(int[] nums) {

        //initialize the maximum nums
        int maximum=0;

        for(int i=0;i<nums.length;i++){
            maximum=Math.max(maximum,nums[i]);
        }
        //finding the maximum sequences number
        int sum=nums[0];
        for(int j=1;j<nums.length;j++){
            if(nums[j-1]<nums[j]){
                sum+=nums[j];
            }else{
                break;
            }
        }

        // finding the nearest sequence
        while(maximum!=sum){
            if(maximum<sum){
                sum-=1;
            }else{
                sum+=1;
            }
        }

        //return the result
        sum+=1;
        return sum;
    }
}
