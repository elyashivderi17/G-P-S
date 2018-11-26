package File_format;



import java.io.BufferedReader;

import java.io.BufferedWriter;

import java.io.File;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.ArrayList;

import java.util.List;

public class CSV_TO_KML_2 {

	public static List<String[]> readFile(File file) throws IOException {

		List<String[]> result = new ArrayList<String[]>();

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr);

		int i=0;

		for (String line = br.readLine(); line != null; line = br.readLine()) {

			result.add(line.split(","));

		}

		br.close();

		fr.close();

		return result;

	}


	static void to_KML(List<String[]> a, String output) {

		ArrayList<String> content = new ArrayList<String>();

		String kmlstart = 

				"<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n" + 

                "<kml xmlns=\"http://www.opengis.net/kml/2.2\"><Document><Style id=\"red\">\r\n" + 

                "<IconStyle><Icon><href>http://maps.google.com/mapfiles/ms/icons/red-dot.png</href></Icon></IconStyle>\r\n" + 

                "</Style><Style id=\"yellow\"><IconStyle><Icon><href>http://maps.google.com/mapfiles/ms/icons/yellow-dot.png</href></Icon></IconStyle>\r\n" + 

                "</Style><Style id=\"green\"><IconStyle><Icon><href>http://maps.google.com/mapfiles/ms/icons/green-dot.png</href></Icon></IconStyle></Style>\r\n" + 

                "\r\n" + 

                "\r\n" + 

                "<Folder><name>Wifi Networks</name>\n\n";

		content.add(kmlstart);

		String[] nameData = a.get(1);

		String kmlend = "</Folder>\n" + 

        		"</Document>\n</kml>";

		try{

			FileWriter fw = new FileWriter(output);

			BufferedWriter bw = new BufferedWriter(fw);

			for (int i = 2; i < a.size(); i++) {

				String[] s = a.get(i);

				String kmlelement ="<Placemark>\n" +

                        "<name><![CDATA["+s[1]+"]]></name>\n" +

                        "<description>"+

                        "<![CDATA[B"

                        +nameData[0]+": <b>"+s[0]+" </b><br/>"

                        +nameData[2]+": <b>"+s[2]+" </b><br/>"

                        +nameData[3]+": <b>"+s[3]+" </b><br/>"

                        +nameData[4]+": <b>"+s[4]+" </b><br/>"

                        +nameData[5]+": <b>"+s[5]+" </b><br/>"

                        +nameData[6]+": <b>"+s[6]+" </b><br/>"

                        +nameData[7]+": <b>"+s[7]+" </b><br/>"

                        +nameData[8]+": <b>"+s[8]+" </b><br/>"

                                         +"]]></description>\n" +

                        "<Point>\n" +

                        "<coordinates>"+s[7]+","+s[6]+"</coordinates>" +

                        "</Point>\n" +

                        "</Placemark>\n";

				content.add(kmlelement);

			}

			content.add(kmlend);

			bw.write(String.join("\n", content));

			System.out.println("Operation Complete");

			bw.close();

		} 

		catch (IOException e) {

			e.printStackTrace();

		}

	}

}

