import java.util.HashMap;
import java.util.Map;

public class Ransomnote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // counting the duplicates in ransomNote and magazine
        HashMap<Character,Integer> map=new HashMap<>();
//        HashMap<Character,Integer> magazineMap=new HashMap<>();


        for (int i = 0; i < ransomNote.length(); i++) {
            char ch=ransomNote.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for (char ch : ransomNote.toCharArray()) {
            if (!map.containsKey(ch) || map.get(ch) == 0) {
                return false; // not enough letters
            }
            map.put(ch, map.get(ch) - 1); // use one letter
        }

        return true; // all letters found
    }
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "aab";
        boolean ans = canConstruct(ransomNote,magazine);
        System.out.println(ans);
    }
}
