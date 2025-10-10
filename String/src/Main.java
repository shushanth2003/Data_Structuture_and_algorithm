import java.util.*;
public class Main
{
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        char[] res=reverseOnlyLetters(s);
        System.out.println(Arrays.toString(res));
    }
    public static char[] reverseOnlyLetters(String s) {
        // initialize the reverses method
        char[] reverseArray=new char[s.length()];

        //initialize the string into char Array
        for(int i=0;i<s.length();i++){
            reverseArray[i]=s.charAt(i);
        }

        // make it into two pointer
        int start=0,end=s.length()-1;
        while(start<=end){
            if(Character.isLetter(reverseArray[start]) && Character.isLetter(reverseArray[end])){
                char temp=reverseArray[start];
                reverseArray[start]=reverseArray[end];
                reverseArray[end]=temp;
                start++;
                end--;
            }else if(!Character.isLetter(reverseArray[start]) && Character.isLetter(reverseArray[end])){
                start++;
            } else if(Character.isLetter(reverseArray[start]) && !Character.isLetter(reverseArray[end])){
                end--;
            } else {
                start++;
                end--;
            }
        }
        // String res="";

        // //returning the result
        // for(char ch:reverseArray){
        //     res+=ch;
        // }
        // return res;
        return reverseArray;
    }
}