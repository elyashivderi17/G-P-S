package File_format;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import GIS.element;
import GIS.layer;


public class CSVReader {
	 layer l=new layer();
	private static String MAC , SSID , AuthMode , FirstSeen , Channel , RSSI ,CurrentLatitude,AltitudeMeters, AccuracyMeters , Type;
    public static void main(String[] args) 
    {
        String csvFile = "C:\\Users\\barge\\Desktop\\מונחה עצמים מטלה 2\\Ex2\\data\\WigleWifi_20171201110209.csv";
        String line = "";
        String cvsSplitBy = ",";
        layer l=new layer();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
        {
        	br.read();
        	br.read();
            while ((line = br.readLine()) != null) 
            {
                String[] userInfo = line.split(cvsSplitBy);
               element e=new element(userInfo[0],userInfo[1],userInfo[2],userInfo[3],userInfo[4],userInfo[5],userInfo[6],userInfo[7],userInfo[8],userInfo[9],userInfo[10]);
            }

        } catch (IOException e) 
        {
            e.printStackTrace();
        }
    }

}
