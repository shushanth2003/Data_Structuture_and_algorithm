public class Countsamepostion {
    public static void main(String[] args){
        int[] num={1,2,5,3,4};
        int an=countSameposition(num);
        System.out.println(an);
    }
    public static int countSameposition(int[] nums){
        int count=0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1]<nums[i]){
                count++;
            }else{
                break;
            }
        }
        return count;
    }
}
