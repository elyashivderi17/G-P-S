package Algorithms;

import java.io.*;

import File_format.CSVReader;
import File_format.Csv2kml;
import GIS.project;
public class MultiCSV {
	public static void multcsv2kml(project p,String filepath) {
		String fileName = "allkml.csv";
		String newfilepath=filepath+"\\"+fileName;
		String kmlpath=newfilepath.split("csv")[0];
		kmlpath+="kml";
		PrintWriter pw=null;
		try 
		{
			pw = new PrintWriter(new File(filepath+"\\"+fileName));
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			return;
		}
		pw.write(p.toString());
		pw.close();

		Csv2kml.convertCsv2Kml(newfilepath,kmlpath);
		System.out.println("done");
	}
	public static project multicsv(String path) {
		project p=new project();
		p=multicsvRec(path,p);
		if(p.isEmpty())System.out.println("there aren't csv file in this folder");
		return p;
	}
	private static project multicsvRec (String path,project p) {
		File folder = new File(path); 
		File[] list=folder.listFiles();
		for(File f : list) {
			if(f.isDirectory()) {
				multicsvRec(f.getAbsolutePath(),p);
			}
			else {
				if(f.getName().contains(".csv")) {
					p.add(CSVReader.CsvReader(f.getAbsolutePath()));
				}
			}
		}
		return p;
	}

	public static void main(String[] args) {
		project p=multicsv("C:\\Users\\barge\\Desktop\\‏‏תיקיה חדשה");
		multcsv2kml(p,"C:\\Users\\barge\\Desktop\\‏‏תיקיה חדשה");
	}
}
