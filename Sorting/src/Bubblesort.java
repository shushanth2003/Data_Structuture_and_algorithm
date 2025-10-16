import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] num={2,0,2,1,1,0};
        int[] ans=bubbleSort(num);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] bubbleSort(int[] num){
        if(num.length==1) return num;
        boolean isSwapped=false;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length-1; j++) {
                if(num[j]>num[j+1]){
                    isSwapped=true;
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
            if(!isSwapped){
                break;
            }
        }

        return num;
    }
}
