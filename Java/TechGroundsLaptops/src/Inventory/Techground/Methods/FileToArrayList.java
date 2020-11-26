package Inventory.Techground.Methods;

import Inventory.Techground.Inventory;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileToArrayList {

    public static ArrayList<String[]> fileToListArray(int rows, int columns, String file) {


        ArrayList<String[]> arrayList = new ArrayList<>();


        try {
            InputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            int i = 0;
            for (String line = br.readLine(); line != null; line = br.readLine()) {

                for (int j = 0; j < columns; j++) {
                    arrayList.add(line.split(" "));
                }
                i++;
            }

            br.close();
        } catch (Exception e) {
            System.err.println("Error: De text file kan niet worden gelezen.");
        }

        return arrayList;
    }
}
