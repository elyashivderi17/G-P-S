
package File_format;



import java.io.File;

import java.io.IOException;



public class CSV_TO_KML {



	public static void main(String[] args) throws IOException {

		File file = Csv_File_New.getResource("G-P-S\\data\\WigleWifi_20171203085618.csv");

		CSV_TO_KML_2.to_KML(CSV_TO_KML_2.readFile(file), "G-P-S\\data\\NEW_WIFI.kml");

		

	}

}