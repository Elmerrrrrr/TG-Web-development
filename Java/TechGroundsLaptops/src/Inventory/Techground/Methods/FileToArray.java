package Inventory.Techground.Methods;

import Inventory.Techground.Inventory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileToArray {
    public static String[][] fileToArray(int rows, int columns, String file) {


        String array[][] = new String[rows][columns];

        try {
            InputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            int i = 0;
            for (String line = br.readLine(); line != null; line = br.readLine()) {

                for (int j = 0; j < columns; j++) {
                    array[i] = line.split(" ");
                }
                i++;
            }

            br.close();
        } catch (Exception e) {
            System.err.println("Error: De text file kan niet worden gelezen.");
        }

        return array;
    }
}
