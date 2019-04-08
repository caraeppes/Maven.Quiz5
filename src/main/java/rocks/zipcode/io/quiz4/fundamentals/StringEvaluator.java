package rocks.zipcode.io.quiz4.fundamentals;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> substrings = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            for(int j = i + 1; j <= string.length(); j++){
                substrings.add(string.substring(i, j));
            }
        }
        return substrings.toArray(new String[substrings.size()]);

    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> result = new ArrayList<>();
        for(String s : getAllSubstrings(string2)){
            if(Arrays.asList(getAllSubstrings(string1)).contains(s)){
                result.add(s);
            }
        }
        return result.toArray(new String[result.size()]);
    }

    public static String getLargestCommonSubstring(String string1, String string2) {
        String[] commonSubstrings = getCommonSubstrings(string1, string2);
        Arrays.sort(commonSubstrings, Comparator.comparingInt(String::length));
        return commonSubstrings[commonSubstrings.length - 1];
    }
}
