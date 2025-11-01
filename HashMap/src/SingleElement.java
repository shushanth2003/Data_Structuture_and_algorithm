import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> maps: map.entrySet()){
            if(maps.getValue()==1)
                return maps.getKey();
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {3,3,7,7,10,11,11};
        int ans =singleNonDuplicate(nums);
        System.out.println(ans);
    }
}
