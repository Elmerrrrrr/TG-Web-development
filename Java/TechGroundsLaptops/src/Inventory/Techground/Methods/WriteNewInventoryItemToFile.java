package Inventory.Techground.Methods;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNewInventoryItemToFile {
    public static void writeToFile(String file, String newInventory) {

        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.newLine();
            bufferedWriter.write(newInventory);


            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nDe main file is succeesvol bijgewerkt.");

    }
}
