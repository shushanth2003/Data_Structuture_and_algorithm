import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Intersectiontwoarray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        //create hashmap
        HashMap<Integer,Boolean> map=new HashMap<>();
        ArrayList<Integer> res= new ArrayList<>();

        //inserting the nums1 in HashMap
        for(int n:nums1){
            map.put(n,true);
        }
        for(int n:nums2){
            if(map.containsKey(n)){
                res.add(n);
                map.remove(n); // to avoid the duplicate elements
            }
        }

        int[] num=new int[res.size()];
        for (int i=0;i<num.length;i++) {
            num[i]= res.get(i);
        }

        return num;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] ans=intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
}
