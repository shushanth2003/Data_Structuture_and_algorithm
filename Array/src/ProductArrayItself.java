import java.util.Arrays;

public class ProductArrayItself {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] ans=productArray(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productArray(int[] arr){
        int[] prefix=new int[arr.length],suffix=new int[arr.length];
        int pre=1,suf=1;
        int[] res=new int[arr.length];
        for (int i = 0; i < prefix.length; i++) {
            pre*=arr[i];
            prefix[i]=pre;
        }
        for (int i = 0; i < suffix.length; i++) {
            suf*=arr[suffix.length-i-1];
            suffix[suffix.length-i-1]=suf;
        }
        res[0]=suffix[1];
        res[arr.length-1]=prefix[arr.length-2];
        for (int i = 1; i <arr.length-1 ; i++) {
            res[i]=prefix[i-1]*suffix[i+1];
        }
        return res;
    }
}
