package com.theironyard.charlotte;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by meekinsworks on 8/27/16.
 */

public class Person {
    private String path;

    //-------------Field to find the path----------------
    public Person(String file_path) {
        path = file_path;
    }



    //---------------Method to open the file--------------

    public String[] OpenFile() throws IOException {
        FileReader fr = new FileReader(path);
        BufferedReader textReader = new BufferedReader(fr);

        // ------------Array - storing the data in the file---------
        int numberOfLines = (1001);
        String[] textData = new String[numberOfLines];

        //--------------loops to count/collects data from array/store textData ----
        int i;
        for (i = 0;
             i < numberOfLines;
             i++) {
            textData[i] = textReader.readLine();
        }
        textReader.close();
        return textData;}
        //-----------------------READS THE LINES------------------

    int readLines() throws IOException {
        FileReader file_to_read = new FileReader(path);
        BufferedReader bf = new BufferedReader(file_to_read);
        String aLine;
        int numberOfLines = 0;
        while ((aLine = bf.readLine()) != null) {
            numberOfLines++;}
            bf.close();
            return numberOfLines;


    }


}










