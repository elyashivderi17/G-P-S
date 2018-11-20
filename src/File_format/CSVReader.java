package File_format;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {

    public static void main(String[] args) 
    {
        String csvFile = "users2.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) 
        {
            while ((line = br.readLine()) != null) 
            {
                String[] userInfo = line.split(cvsSplitBy);

                System.out.println("Name: " + userInfo[0] + " , Email: " + userInfo[1] +
                		" Phone: " + userInfo[2] + " Country: " + userInfo[3] );
            }

        } catch (IOException e) 
        {
            e.printStackTrace();
        }

    }

}