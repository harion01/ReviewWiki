package DailyCoding.HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Triplet {
    public static Long firstCnt =null;
    public static Long secondCnt = null;
    public static Long thirdCnt = null;
    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {

        HashMap<Long, Long> numCountMap = new HashMap<>();
        distinctArr(numCountMap, arr);
        long count = countGeoCombination(numCountMap ,r );

        return count;
    }


    private static void distinctArr(HashMap<Long, Long> numCountMap, List<Long> arr) {

        for(Long oneNum : arr) {
            Long count = numCountMap.get(oneNum);
            if (count == null) {
                numCountMap.put(oneNum, (long)1);
            } else {
                count++;
                numCountMap.put(oneNum, count);
            }

        }
        System.out.println("Map : "+numCountMap);
    }

    private static long countGeoCombination(HashMap<Long, Long> numCountMap, long ratio) {
        long totalCombinationCnt = 0;
        long oneGeoCombCnt = 0;

        for(Long oneKey : numCountMap.keySet()){
            if(initGeoCount(numCountMap, oneKey, ratio)){
                oneGeoCombCnt = countOneGeoCombination(ratio);
                totalCombinationCnt = totalCombinationCnt + oneGeoCombCnt;
            }else{
                continue;
            }
        }

        return totalCombinationCnt;
    }

    private static long countOneGeoCombination(long ratio) {
        long count = 0;
        if(ratio ==1){
            count =  calcOneRatioCase();
        }else {
            count = firstCnt * secondCnt * thirdCnt;
            System.out.println("combination count : "+firstCnt + " * "+secondCnt+" * "+thirdCnt+ " = "+count);
        }
        return count;
    }

    private static boolean initGeoCount(HashMap<Long, Long> numCountMap, Long oneKey, long ratio) {
        if(oneKey % ratio != 0){
            return false;
        }


        firstCnt = numCountMap.get(oneKey/ratio);
        secondCnt = numCountMap.get(oneKey);
        thirdCnt = numCountMap.get(oneKey*ratio);
        boolean isIncluded = firstCnt != null && secondCnt != null && thirdCnt != null;
        if(isIncluded) {
            System.out.println("Goe combination : " + oneKey / ratio + " , " + oneKey + " , " + oneKey * ratio);
        }
        return isIncluded;
    }

    private static long calcOneRatioCase() {
        if(firstCnt <= 3){
            return 0;
        }

        return (long)(firstCnt*(secondCnt-1)*(thirdCnt-2) )/ (3*2);
    }




    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(nr[0]);

        long r = Long.parseLong(nr[1]);

        List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());

        long ans = countTriplets(arr, r);
        System.out.println("ans : " + ans);
        //bufferedWriter.write(String.valueOf(ans));
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
