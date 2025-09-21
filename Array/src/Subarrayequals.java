import java.util.HashMap;

public class Subarrayequals {
    public static void main(String[] args){
        int[] arr={3,4,7,2,-3,1,4,2};
        int k=7;
        int ans=subarrayEquals(arr,k);
        System.out.println(ans);
    }
    public static int subarrayEquals(int[] arr,int k){
        int prefixSum=0;
        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for (int i = 0; i < arr.length; i++) {
            prefixSum+=arr[i];
            int diff=prefixSum-k;
            if(map.containsKey(diff)){
                count+=map.get(diff);
            }
            map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        }
        return count;
    }

}
