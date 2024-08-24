package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String[] args) {

       System.out.println(isAnagram("rat", "cat"));
        //System.out.println(isAnagram2("anagram", "nagaram")); // true
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {return  false;}


        s = s.toLowerCase();
        t = t.toLowerCase();

        int[] counts = new int[26];

        //increment
        for(int i=0; i<s.length(); i++)
        {
            counts[s.charAt(i) - 'a'] ++;
        }

        //decrement
        for(int i=0; i<t.length(); i++)
        {
            counts[t.charAt(i) - 'a']--;
        }

        for(int count: counts)
        {
            if(count != 0)
            {
                return false;
            }
        }

        return true;
    }


    public static boolean isAnagram2(String s, String t) {

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return Arrays.equals(sArray, tArray);
    }


}
