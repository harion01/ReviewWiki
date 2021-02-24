package DailyCoding.HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Triplet {
    public static Integer firstCnt =null;
    public static Integer secondCnt = null;
    public static Integer thirdCnt = null;
    // Complete the countTriplets function below.
    static long countTriplets(List<Long> arr, long r) {
        /* poor time complex logic
        Collections.sort(arr);
        HashMap<Long, Integer> numCountMap = makeNumCountMap(arr);
        Long maxNum = arr.get(arr.size()-1);
        count = countGeoCombination(numCountMap,maxNum ,r );
         */

        HashMap<Long, Integer> numCountMap = new HashMap<>();
        long maxNum = distinctArr(numCountMap, arr);
        long count = countSimpleGeoCombination(numCountMap,maxNum ,r );

        return count;
    }


    private static long distinctArr(HashMap<Long, Integer> numCountMap, List<Long> arr) {
        long max = 0;
        for(Long oneNum : arr) {
            Integer count = numCountMap.get(oneNum);
            if (count == null) {
                numCountMap.put(oneNum, 1);
            } else {
                count++;
                numCountMap.put(oneNum, count);
            }

            if(max < oneNum)
                max = oneNum;
        }
        System.out.println("Map : "+numCountMap);
        return max;
    }

    private static long countSimpleGeoCombination(HashMap<Long, Integer> numCountMap, long maxNum, long ratio) {
        long totalCombinationCnt = 0;
        if(ratio == 1){
            return calcOneRatioCase(numCountMap);
        }
        Long geoValue = initGeoElement(numCountMap, ratio);

        while(geoValue <= maxNum){
            System.out.println("fisrt:" +firstCnt + " second:"+ secondCnt+" third:"+thirdCnt);
            if(firstCnt != null && secondCnt != null && thirdCnt != null){
                totalCombinationCnt = totalCombinationCnt + firstCnt * secondCnt * thirdCnt;
            }

            geoValue = geoValue*ratio;
            shiftGeoValue(numCountMap,  geoValue );


        }
        return totalCombinationCnt;
    }

    private static long calcOneRatioCase(HashMap<Long, Integer> numCountMap) {
        Long key = Long.valueOf(1);
        Integer elementCnt = numCountMap.get(key);
        if(elementCnt == null){
            return 0;
        }else {
            return elementCnt * (elementCnt-1) * (elementCnt-2);
        }
    }


    public static Long initGeoElement(HashMap<Long, Integer> numCountMap,  long ratio){
        Long geoValue = Long.valueOf(1);
        firstCnt = numCountMap.get(geoValue);
        geoValue = geoValue*ratio;
        secondCnt = numCountMap.get(geoValue);
        geoValue = geoValue*ratio;
        thirdCnt = numCountMap.get(geoValue);
        return geoValue;
    }


    private static void shiftGeoValue(HashMap<Long, Integer> numCountMap,  Long geoValue) {
        firstCnt = secondCnt;
        secondCnt = thirdCnt;
        thirdCnt = numCountMap.get(geoValue);
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
        System.out.println("ans : " + ans);
        //bufferedWriter.write(String.valueOf(ans));
       // bufferedWriter.newLine();

        bufferedReader.close();
       // bufferedWriter.close();
    }
}
