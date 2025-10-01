import java.util.Arrays;

public class Nonoverlappinginterval {
    public static void main(String[] args){
        int[][] intervals={
                {1,2},
                {2,3},
                {3,4},
                {1,3}
        };
        int res=nonOverlapping(intervals);
        System.out.println(res);
    }
    public static int nonOverlapping(int[][] intervals){
        int remove=0,end=Integer.MIN_VALUE;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        for (int i = 0; i < intervals.length; i++) {
            if(intervals[i][0]>=end){
                end=intervals[i][1];
            }else{
                remove++;
            }
        }
        return remove;
    }
}
