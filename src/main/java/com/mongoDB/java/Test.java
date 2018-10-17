package com.mongoDB.java;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
public class Test {

    /**
     * List all the files and folders from a directory
     * @param directoryName to be listed
     */
    public void listFilesAndFolders(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            System.out.println(file.getName());
        }
    }
    /**
     * List all the files under a directory
     * @param directoryName to be listed
     */
    public void listFiles(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getAbsolutePath());
            }
        }
    }
    /**
     * List all the folder under a directory
     * @param directoryName to be listed
     */
    public void listFolders(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isDirectory()){
                System.out.println(file.getAbsolutePath());
            }
        }
    }
    /**
     * List all files from a directory and its subdirectories
     * @param directoryName to be listed
     */
    public void listFilesAndFilesSubDirectories(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        for (File file : fList){
            if (file.isFile()){
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()){
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
            }
        }
    }
    public static void main (String[] args){
       // Test listFilesUtil = new Test();
       /// final String directoryLinuxMac ="C://Users//ssc.rbapanapalli//Desktop//Test";
        //Windows directory example
        //final String directoryWindows ="C://Users//ssc.rbapanapalli//Desktop";
        //listFilesUtil.listFolders(directoryLinuxMac);
    	
    	//String startTime = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    	//String endTime="12:01:46";
    	Calendar c = Calendar.getInstance();
		   String batchUploadMonth=c.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH );
    	Date d1=new Date();
    	System.out.println(batchUploadMonth);
    	System.out.println(d1);
    }
}