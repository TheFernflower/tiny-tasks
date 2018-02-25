import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {
  public static int duplicateCount(String text) {
        Map<Character, Integer> hashMap = new HashMap<Character, Integer>();
        String newText = text.toLowerCase();
        for (int i = 0; i < newText.length(); i++){
            if(!hashMap.containsKey(newText.charAt(i))){
                hashMap.put(newText.charAt(i), 1);
            }
            else {
                hashMap.put(newText.charAt(i), hashMap.get(newText.charAt(i))+1);
            }
        }
        int result = 0;
        for(Map.Entry<Character, Integer> entry : hashMap.entrySet()){
            if(entry.getValue()>1){
                result++;
            }
        }
        return result;
    }
}
