package Developify;

import java.util.HashSet;

public class LongestSubstring {

    /*
    1. check each character of string

	1.1. check substring have same character
		//> if same, clear substring

		-> remake substring with current value;
			-> from next potision of previous same character to current character

	1.2. if there is no same character, append substring
		1.2.1. check maximum length & update
     */

        public int lengthOfLongestSubstring(String s) {
            String subStr = "";
            HashSet<Character> subSet = new HashSet<>();
            int maxLen = 0;
            for(char oneChar : s.toCharArray()){
                subStr = subStr + oneChar;

                if(subSet.contains(oneChar)){
                    subStr = remakeSubStr(subSet, subStr, oneChar);
                    System.out.println(subStr);
                } else {
                    subSet.add(oneChar);

                    if(maxLen < subStr.length()){
                        maxLen = subStr.length();
                    }
                }
            }
            return maxLen;
        }

        private String remakeSubStr( HashSet<Character> subSet, String oriStr, char target){
            //System.out.println("ori:"+oriStr);
            String remake = "";

            for(int idx = 0 ; idx < oriStr.length(); idx++){
                char oneChar = oriStr.charAt(idx);
                if(oneChar == target){
                    remake = oriStr.substring(idx+1, oriStr.length());
                    break;
                }else {
                    subSet.remove(oneChar);
                }
            }
            //System.out.println("remake:"+remake);
            return remake;
        }

}
