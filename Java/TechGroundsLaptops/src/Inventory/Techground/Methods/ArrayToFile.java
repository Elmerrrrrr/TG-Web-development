package Inventory.Techground.Methods;

import java.io.*;

public class ArrayToFile {

    public static void arrayToFile(String[][] array, String file) throws FileNotFoundException {

        new PrintWriter(file).close(); //deletes content in file

        try {
            FileWriter writer = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);

            for (int i = 0; i < array.length; i++) {

                if (i == array.length - 1) {
                    bufferedWriter.write(array[i][0] + " " + array[i][1] + " " + array[i][2]);
                    // no new empty line add the end
                } else if (i < array.length) {
                    bufferedWriter.write(array[i][0] + " " + array[i][1] + " " + array[i][2]);
                    bufferedWriter.newLine();
                }


            }

            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n\nDe file is succeesvol bijgewerkt.");

    }
}
