package Inventory.Techground.Methods;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CountRows {

    public static int countRows(String file) {

        int countRows = 0;

        try {
            InputStream fileInput = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInput));

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                countRows++;
            }

            reader.close();
        } catch (Exception e) {
            System.err.println("Error: Het bestand kan niet worden gelezen.");
        }
        return countRows;
    }
}