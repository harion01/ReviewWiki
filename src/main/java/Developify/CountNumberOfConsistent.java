package Developify;

import java.util.HashSet;

public class CountNumberOfConsistent {
    //prob : https://leetcode.com/problems/count-the-number-of-consistent-strings/
    /*
    String allowed -> distinct charaters
    ArrayList<String> words

    if all characters in the string words are in the allowed.
            -> consistance (일관적)


    1. check each character of word is in allowed.
            if all character is allowed, consistance. -> count++

            2. loop for every word.
    */

        public int countConsistentStrings(String allowed, String[] words) {
            int consistCount = 0;

            HashSet<Character> allowHash = new HashSet<>();
            for(Character oneChar : allowed.toCharArray()){
                allowHash.add(oneChar);
            }

            for(String oneWord : words){
                if(checkConsist(allowHash, oneWord)){
                    consistCount++;
                }
            }

            return consistCount;
        }

        private boolean checkConsist(HashSet<Character> allowHash, String oneWord){
            boolean isConsist = true;

            for(char oneChar : oneWord.toCharArray()){
                if(allowHash.contains(oneChar) ){
                    continue;
                }else {
                    isConsist = false;
                    break;
                }
            }

            return isConsist;
        }

}
