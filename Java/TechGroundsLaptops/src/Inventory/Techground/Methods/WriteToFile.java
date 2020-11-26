package Inventory.Techground.Methods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void writeToFile(String file, String inputAddBrand, String inputAddModel, String inputAddPrice) {

        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();
            bufferedWriter.write(inputAddBrand + " " + inputAddModel + " " + inputAddPrice);

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nDe file is succeesvol bijgewerkt.");

    }
}
