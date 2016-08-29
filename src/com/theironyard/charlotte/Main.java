package com.theironyard.charlotte;

import java.io.IOException;

public class Main { //ReadFile
    public static void main(String[] args) throws IOException {
        String file_name = "/Users/meekinsworks/documents/ironyard/people/people.csv";
        try {
            Person file = new Person(file_name); // I accessed the data from the Person class. I referenced the object
//            // and used a copy of that reference I executed the actions in the person class
//            // with this new copy. I ran the code from person in this class on the file name above.
//            //I put code in one place and copied it into another using the reference calling
//            // and in short it is being executed here.
            String[] people = file.OpenFile();
            int i;
            for (i = 0; i < people.length; i++) {
//                System.out.println(people[i]);
////
            }
//
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
//
//    }
//
//    ;


    private static void NameCountry() throws IOException {

        String file_name = "/Users/meekinsworks/documents/ironyard/people/people.csv";
        Person file = new Person(file_name);
        String[] people = file.OpenFile();

        String[][] nc = {people
        };
//            run a scanner loop
//
//
//
//
//
//
//            call it country


//
//            HashMap<String, String> nc = new HashMap<>();
//            nc.put(name, country);


//            return people;


    }
}








