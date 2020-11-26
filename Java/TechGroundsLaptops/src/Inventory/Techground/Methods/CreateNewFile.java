package Inventory.Techground.Methods;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateNewFile {

    public static void createNewFile (String fileName) {
        try {
            File myObj = new File(fileName+".txt");
            if (myObj.createNewFile()) {
                System.out.println("Nieuwe inventory succesvol aangemaakt: ");
            } else {
                System.out.println("Bestand bestaat al.");
            }
        } catch (IOException e) {
            System.out.println("Er is iets fout gegaan..");
            e.printStackTrace();
        }
    }
}