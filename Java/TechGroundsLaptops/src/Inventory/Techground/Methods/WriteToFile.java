package Inventory.Techground.Methods;

import java.io.*;

public class WriteToFile {
    public static void writeToFile(String file, String inputAddBrand, String inputAddModel, String inputAddPrice) {

        try {
            InputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

          if (br.readLine() == null) {
              bufferedWriter.write(inputAddBrand + " " + inputAddModel + " " + inputAddPrice);
              bufferedWriter.close();

          }

          else {
              bufferedWriter.newLine();
              bufferedWriter.write(inputAddBrand + " " + inputAddModel + " " + inputAddPrice);
              bufferedWriter.close();
            }
            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nDe file is succeesvol bijgewerkt.");

    }
}
