package Inventory.Techground.Methods;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IndexFileToArray {

    public static String[]fileToArray(int rows, String file, boolean caseMenu) {


        String array[] = new String[rows];

        try {
            InputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            if (!caseMenu) {
                int i = 0;
                for (String line = br.readLine(); line != null; line = br.readLine()) {
                    array[i] = (i + 1) + "." + "Toon de " + line + " inventory.\n";
                    i++;
                }
            } else if (caseMenu) {

                int i = 0;
                for (String line = br.readLine(); line != null; line = br.readLine()) {
                    array[i] = line;
                    i++;
                }
            }




        br.close();

        } catch (Exception e) {
            System.err.println("Error: De file kan niet worden gelezen.");
        }

        return array;
    }
}
