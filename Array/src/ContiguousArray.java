import java.util.HashMap;

public class ContiguousArray {
    public static void main(String[] args) {
        int[] arr = {0,1,1,1,1,1,0,0,0};
        int ans = contigousArray(arr);
        System.out.println(ans);
    }

    public static int contigousArray(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int longest = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=(arr[i]==0?-1:arr[i]);
            if(prefixSum==0){
                longest=i+1;
            } else if (map.containsKey(prefixSum)) {
                longest=Math.max(longest,i-map.get(prefixSum));
            }else{
                map.put(prefixSum,i);
            }
        }
        return longest;
    }
}