public class MinimumSumGame {
    public static int digitSum(int nums){
        int res=0;
        while(nums>0){
            int temp=nums%10;
            res+=temp;
            nums/=10;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] num={21,2,30,33};
        int max=Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            int digit=digitSum(num[i]);
            max=Math.min(max,digit);
        }
        System.out.println(max);
    }
}
