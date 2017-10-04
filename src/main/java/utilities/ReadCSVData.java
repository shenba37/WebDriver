package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Shenbaga on 02-10-2017.
 */
public class ReadCSVData {
    public static Map<String,String> getData(){
        Map<String,String> loginData = new HashMap<String, String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/main/resources/logindata.csv"));
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                loginData.put(data[0],data[1]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    return loginData;
    }
}
