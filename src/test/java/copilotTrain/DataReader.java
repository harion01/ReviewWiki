package copilotTrain;
import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataReader {
    public DataReader(String filePath){
        this.readData(filePath);
    }
    public List<String> getInputArr() {
        return inputArr;
    }

    public List<String> getOutputArr() {
        return outputArr;
    }

    public List<String> inputArr;
    public List<String> outputArr;


    //read resource data from file
    public void readData(String fileFullPath){

        try {
            String data = IOUtils.toString(
                    this.getClass().getResourceAsStream(fileFullPath),
                    "UTF-8"
            );

            inputArr = parseSection(data, "INPUT");
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    //parse section of data from given fileContent
    //return list of string
//    public List<String> parseSection(String fileContent, String Section){
//        List<String> datas = new ArrayList<String>();
//        Pattern sectionPattern = Pattern.compile("^"+Section+"*:\\n((?:[^\\n]+\\n)*)", Pattern.MULTILINE);
//        Pattern dataPattern = Pattern.compile("^(?<data>[^\\s]+)S", Pattern.MULTILINE);
//        Matcher sectionMatcher = sectionPattern.matcher(fileContent);
//        if(sectionMatcher.find()){
//            String sectionContent = sectionMatcher.group(1);
//            Matcher dataMatcher = dataPattern.matcher(sectionContent);
//            while(dataMatcher.find()){
//                datas.add(dataMatcher.group("data"));
//            }
//        }
//        return datas;
//    }
//

    public static List<String> parseSection(String fileContent, String section) {
        List<String> values = new ArrayList<>();
        Pattern sectionPattern = Pattern.compile("^" + section + ":\\s*\\n((?:.*\\n)*)", Pattern.MULTILINE);
        Pattern dataPattern = Pattern.compile("^(?<data>.+)$", Pattern.MULTILINE);

        Matcher sectionMatcher = sectionPattern.matcher(fileContent);
        if (sectionMatcher.find()) {
            String sectionContent = sectionMatcher.group(1);

            Matcher dataMatcher = dataPattern.matcher(sectionContent);
            while (dataMatcher.find()) {
                values.add(dataMatcher.group("data"));
            }
        }

        return values;
    }


}
