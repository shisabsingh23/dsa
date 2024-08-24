package leetcode;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharInString {
    public static void main(String[] args) {
       String userInput = "aabb";
        System.out.println(firstUniqueCharc(userInput));

    }

    public static int firstUniqueCharc(String input){
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c,0) + 1);
        }
        for (int i = 0; i < input.length(); i++) {
            if (frequencyMap.get(input.charAt(i)) == 1) {
                return i; // Return the index of the first unique character
            }
        }
        return -1;
    }
}
