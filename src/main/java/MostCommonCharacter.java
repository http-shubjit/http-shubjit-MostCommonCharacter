import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (char c : str.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        ///{"1":6,"2":3 and so on..}
      
        char mostCommonChar = '\0'; 
        int maxFrequency = 0;

        for (HashMap.Entry<Character,Integer> entry:hashMap.entrySet()) {
            char currentChar = entry.getKey();
            int currentFrequency = entry.getValue();

            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mostCommonChar = currentChar;
            }
        }

        return mostCommonChar;

    }
}
// char res = '\0';
// int maxCount = 0;
// String [] strarr=str.split("");

// for(
// int i = 0;i<strarr.length;i++)
// {
// int count = 0;
// for (int j = i + 1; j < strarr.length; j++) {
// if (strarr[i].equals(strarr[j]))
// count++;
// }
// if (count > maxCount) {
// maxCount = count;
// res = strarr[i].charAt(0);
// }
// }return res;

// }