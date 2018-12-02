package File_format;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import GIS.element;
import GIS.layer;

/**
 * This class read from csv and insert all the data to layer.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public class CSVReader {
	private layer l=new layer();
	/**
	 * This function make a new csv file "allkml.csv" 
	 * @param CsvFile the path of csv file that we want to read from him.
	 * @return layer l with all data from the csv.
	 */
	public static layer CsvReader(String CsvFile) 
	{
		String line = "";
		String cvsSplitBy = ",";
		layer l=new layer();
		try (BufferedReader br = new BufferedReader(new FileReader(CsvFile))) 
		{
			line=br.readLine();
			line=br.readLine();
			while ((line = br.readLine()) != null) 
			{
				String[] userInfo = line.split(cvsSplitBy);
				element e=new element(userInfo[0],userInfo[1],userInfo[2],userInfo[3],userInfo[4],userInfo[5],userInfo[6],userInfo[7],userInfo[8],userInfo[9],userInfo[10]);
				l.add(e);
			}

		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		return l;
	}
}
