package File_format;

import java.io.File;

public class Csv_File_New {



    public static String getResourcePath(String fileName) {

       final File f = new File("");

       final String dossierPath = f.getAbsolutePath() + File.separator + fileName;

       return dossierPath;

   }


   public static File getResource(String fileName) {

       final String completeFileName = getResourcePath(fileName);

       File file = new File(completeFileName);

       return file;

   }

}

