package copilotTrain;

import java.util.*;

public class Day8 {
    public static String run(List<String> argh){
        String output = "";
        ArrayList<String> dataList = new ArrayList<String>();
        String n = argh.get(0);
        Integer N = Integer.parseInt(n);
        for(int i = 1; i < N+1; i++){
            String oneLine = argh.get(i);
            dataList.add(oneLine);
        }
        Map<String,String> phoneBook = makePhoneBook(dataList);

        for(int i= N+1; i < argh.size(); i++){
            String s = argh.get(i);
            String result = findPhoneNum(phoneBook, s);
            output = output + result + "\n";
        }
        return output;
    }


    //make Phonebook
    //get N line of string from argument
    //loop for each line
    //parse one line by splitting space
    //key : first , vale : second -> insert into hashMap
    //return HashMap
    public static Map<String,String> makePhoneBook(List<String> data){
        Map<String,String> phoneBook = new HashMap<>();
        for(int i = 0; i < data.size(); i++) {
            String[] oneLine = data.get(i).split(" ");
            phoneBook.put(oneLine[0], oneLine[1]);
        }
        return phoneBook;
    }



    //for each queryLine
    //search value by given query name
    //if value is found , print name=phoneNumber
    //else, print Not found
    public static String findPhoneNum(Map<String,String> phoneBook, String name){
        String result = "";
        if(phoneBook.containsKey(name)) {
            result = name + "=" + phoneBook.get(name);
        } else {
            result = "Not found";
        }
        return result;
    }

}
