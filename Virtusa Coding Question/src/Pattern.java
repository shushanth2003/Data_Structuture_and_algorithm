import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i = 0; i<n ; i++) {
            for(int j=0;j<n;j++){
                if(j<n-i-1){
                    System.out.print("#");
                }else{
                    System.out.print("-");
                }
            }
            for (int k = 0; k <n-1; k++) {
                if(k<i){
                    System.out.print("-");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");

        }



    }
}
