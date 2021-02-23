package DailyCoding.HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Triplet {
    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        Collections.sort(arr);

        HashMap<Long, Integer> numCountMap = makeNumCountMap(arr);

        Long maxNum = arr.get(arr.size()-1);
        long count = countGeoCombination(numCountMap,maxNum ,r );
        return count;
    }



    /*
        private static HashMap<Integer, Integer> makeGeoMap(List<Long> arr, long r) {
            HashMap<Integer, Integer> geoMap = new HashMap<>();
            long curGeoVal = 1;
            long maxVal = arr.get(arr.size()-1);

            HashMap<Long, Integer> numCountMap = new HashMap<>();
            for(Long oneNum : arr){
                Integer count = numCountMap.get(oneNum);
                if(count == null){
                    numCountMap.put(oneNum, 1);
                }else {
                    count++;
                    numCountMap.put(oneNum, count);
                }
            }


            while(curGeoVal < maxVal){
                curGeoVal = curGeoVal * r;
            }
        }
    */
    private static HashMap<Long, Integer> makeNumCountMap(List<Long> arr) {
        HashMap<Long, Integer> numCountMap = new HashMap<>();
        for(Long oneNum : arr) {
            Integer count = numCountMap.get(oneNum);
            if (count == null) {
                numCountMap.put(oneNum, 1);
            } else {
                count++;
                numCountMap.put(oneNum, count);
            }
        }
        //System.out.println("Map : "+numCountMap);
        return numCountMap;
    }

    private static long countGeoCombination(HashMap<Long, Integer> numCountMap, Long maxNum ,Long ratio) {
        int n = 0;
        long total = 0;
        while (Math.pow(ratio, n+2) <= maxNum){
            Integer first = getNumCount(numCountMap, ratio, n);
            Integer second = getNumCount(numCountMap, ratio, n+1);
            Integer third = getNumCount(numCountMap, ratio, n+2);
            if(first != null && second != null && third != null){
                total = total + first*second*third;
            }
            n++;
        }
        return total;
    }

    private static Integer getNumCount(HashMap<Long, Integer> numCountMap, Long ratio, int n){
        double target =  Math.pow(ratio, n);
        Integer count = numCountMap.get(Long.valueOf((long) target));
        //System.out.println("target:"+target+ " count:"+count );
        return count;
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

        //bufferedWriter.write(String.valueOf(ans));
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
