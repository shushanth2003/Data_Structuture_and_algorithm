public class Removingcharacter {
    public static void main(String[] args){
        String a="Vanakkam";
        char res='a';
        for (int i = 0; i < a.length(); i++) {
            a=a.replace(String.valueOf(res),"");
        }
        System.out.println(a);
    }
}
