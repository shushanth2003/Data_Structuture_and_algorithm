import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args){
        int[] arr={2,2,1,1,2,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
    public static int majorityElement(int[] arr){
        int count=0,candidate=0,currentNum=0;
        for (int i = 0; i < arr.length; i++) {
            currentNum=arr[i];
            if(count==0){
                candidate=currentNum;
            }
            if(candidate==currentNum){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
