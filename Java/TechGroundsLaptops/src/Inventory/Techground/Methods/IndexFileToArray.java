package Inventory.Techground.Methods;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IndexFileToArray {
    public static String[]fileToArray(int rows, String file) {


        String array[] = new String[rows];

        try {
            InputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            for (String line = br.readLine(); line != null; line = br.readLine()) {

                for (int i = 0; i < rows; i++) {
                    array = line.split(" ");
                }

            }

            br.close();
        } catch (Exception e) {
            System.err.println("Error: De file kan niet worden gelezen.");
        }

        return array;
    }
}
