public class ReverseString {
    public static void main(String[] args) {
        String a="Hello world";
        String revString="";
        for (int i = 0; i < a.length(); i++) {
            revString+=a.charAt(a.length()-i-1);
        }
        System.out.println(revString);
    }
}
