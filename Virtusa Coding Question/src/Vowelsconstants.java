import java.util.ArrayList;

public class Vowelsconstants {
    public static String vowelsConstants(String alphabets){
        ArrayList<Character> vowels=new ArrayList<>();
        ArrayList<Character> constents=new ArrayList<>();

        for (int i = 0; i < alphabets.length(); i++) {
            char ch=alphabets.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vowels.add(ch);
            }else {
                constents.add(ch);
            }
        }
        int n=vowels.size()+constents.size();
        String res="";
        res+=vowels.get(0);
        res+=constents.get(0);
        int l=1,m=1;
        for (int j = 2; j < n; j++) {
            if(j%2==0){
                res+=vowels.get(l);
                l++;
            }else{
                res+=constents.get(m);
                m++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String alphabets="rrecfiio";
        String ans= vowelsConstants(alphabets);
        System.out.println(ans);
    }
}
