package Algorithms;

import java.io.*;

import File_format.CSVReader;
import File_format.Csv2kml;
import GIS.project;
/**
 * This class get a directory and search recursively all the csv files int the directory and convert them to a new single kml file.
 * @author Bar Genish
 * @author Elyashiv Deri
 */
public class MultiCSV {

	/**
	 * This function make a new csv file "allkml.csv" 
	 * @param p project that we want to convert.
	 * @param filepath the path of directory that we want to search recursively csv files and convert them.
	 */
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
	/**
	 * This help function make a new project from all the csv that we want to convert 
	 * @param path the path of directory that we want to add to our project.
	 * @return p project that we want to convert.
	 */
	public static project multicsv(String path) {
		project p=new project();
		p=multicsvRec(path,p);
		if(p.isEmpty())System.out.println("there aren't csv file in this folder");
		return p;
	}
	/**
	 * This help function search recursively all the csv files in this folder. 
	 * @param filepath the path of directory that we want to search recursively in her.
	 * @param p project that we want to add to him all informatrion before we convert him.
	 * @return p project that has all the information and is ready to convert.
	 */
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

}
