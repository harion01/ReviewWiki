package DailyCoding.HackerRank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {
        HashMap<String, Integer> wordHash = new HashMap<>();
        makeHash(wordHash, magazine);

        for(String oneWord : note){
            if(checkHash(wordHash, oneWord)){
                continue;
            }else {
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }

    private static boolean checkHash(HashMap<String, Integer> wordHash, String oneWord) {
        Integer value = wordHash.get(oneWord);
        if(value == null) {
            return false;
        }else if (value > 1){
            Integer minus = value-1;
            wordHash.put(oneWord,minus);
        }else if (value == 1){
            wordHash.remove(oneWord);
        }
        return true;
    }

    private static void makeHash(HashMap<String, Integer> wordHash, String[] magazine) {
        for(String oneWord : magazine){
            Integer value = wordHash.get(oneWord);
            if(value == null){
                wordHash.put(oneWord, 1);
            } else {
                Integer plus = value+1;
                wordHash.put(oneWord, plus);
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
