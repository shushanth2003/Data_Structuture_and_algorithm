public class Arraysearch {
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int x=3;
        int ans=arraySearch(arr,x);
        System.out.println(ans);
    }

    private static int arraySearch(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
}
