import java.util.ArrayList;
import java.util.List;

public class ExtractInteger {
    public static void main(String[] args){
        String s=": Prakhar Agrawal, : Manish Kumar Rai, : Rishabh Gupta";
        ArrayList<String> ans=extractInteger(s);
        System.out.println(ans);
    }

    private static ArrayList<String> extractInteger(String s) {
        ArrayList<String> result=new ArrayList<>();
        StringBuilder num=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)){
                num.append(ch);
            }else{
                if(num.length()>0){
                    result.add(num.toString());
                    num.setLength(0);
                }
            }
        }
        if(num.length()>0){
            result.add(num.toString());
        }
        if(result.isEmpty()){
            result.add("No Integer");
        }
        return result;
    }

}
