package DailyCoding.String;

import java.nio.charset.StandardCharsets;

public class StringSample {
    public static void main(String args[]){
        StringSample ss = new StringSample();
        ss.convert();
        ss.checkString();
        ss.checkCompare();
        ss.checkCompareTo();
        ss.checkCondition();
        ss.checkIndexOf();
     }

    public void checkString(){
        String text = "test string";
        System.out.println("text.length()="+text.length());
        System.out.println("text.isEmpty()="+text.isEmpty());
    }

    public void checkCompare(){
        String ori = "Check value";
        String tgt = "Check value";
        //String에서 객체 재사용을 안하도록 new로 새로 할당.
        String tgtWithoutContant = new String ("Check value");
        String tgtCase = "check value";
        if(ori == tgt){
            System.out.println("ori == tgt result is same");
        } else {
            System.out.println("ori == tgt result is different");
        }

        if(ori == tgtWithoutContant){
            System.out.println("ori == tgtWithoutContant result is same");
        } else {
            System.out.println("ori == tgtWithoutContant result is different");
        }

        if(ori.equals(tgt)){
            System.out.println("ori.equals(tgt) result is same");
        }

        if(ori.equalsIgnoreCase(tgtCase)){
            System.out.println("ori.equalsIgnoreCase(tgtCase) result is same");
        }
    }

    public void checkCompareTo(){
        String txt = "a";
        String txt2 = "b";
        String txt3 = "c";
        System.out.println(txt2.compareTo(txt));
        System.out.println(txt2.compareTo(txt3));
        System.out.println(txt.compareTo(txt3));
    }

    public void checkCondition(){
        String address[] = new String[]{
                "서울시 송파구 오금동", "경기도 이천시 부발읍", "서울시 강남구 양재역",
        };

        int startcnt = 0, endcnt = 0, containcnt = 0;
        String starttxt = "서울시";
        String endtxt = "동";
        String conttxt = "시";
        for(String addr : address){
            if(addr.startsWith(starttxt)){
                startcnt++;
            }
            if(addr.endsWith(endtxt)){
                endcnt++;
            }

            if(addr.contains(conttxt)){
                containcnt++;
            }
        }

        System.out.println("start in "+starttxt+" count is :"+startcnt);
        System.out.println("end with "+endtxt+" count is :"+endcnt);
        System.out.println("contains word "+conttxt+" count is :"+containcnt);
    }

    public void checkIndexOf(){
        String txt = "Java technology is both a programming language and a platform";
        System.out.println(txt.indexOf('a'));
        System.out.println(txt.indexOf("a "));
        System.out.println(txt.indexOf('a', 20));
        System.out.println(txt.indexOf("a ",20));
        System.out.println(txt.indexOf('z'));

        System.out.println(txt.lastIndexOf('a'));
        System.out.println(txt.lastIndexOf("a "));
        System.out.println(txt.lastIndexOf('a', 20));
        System.out.println(txt.lastIndexOf("a ",20));
        System.out.println(txt.lastIndexOf('z'));

    }


    public void convert(){
        try {
            String korean = "한글";
            byte[] array1 = korean.getBytes("UTF-16");
            printByte(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }



    private void printByte(byte[] array1) {
        for(byte data : array1){
            System.out.println(data + " ");
        }
        System.out.println();
    }
}
