import java.util.Arrays;

public class Findingsequence {
    public static void main(String[] args) {
        int[] num={100,4,200,1,3,2};
        Arrays.sort(num);
        int count=1;
        int max=0;
        for (int i = 1; i < num.length; i++) {
            if(num[i]==num[i-1]) continue;
            if(num[i]==num[i-1]+1){
                count++;
            }else{
                count=1;
            }
            max=Math.max(max,count);
        }
        System.out.println(max);
    }
}
