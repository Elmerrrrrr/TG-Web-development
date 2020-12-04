import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;


public class FileToArrayList {

    public static String[][]  fileToArrayList() {

        String[][] arrayPsw = new String[1000][3];


        int columns = 3;

        try {
            InputStream fis = new FileInputStream("pws.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            int i = 0;
            for (String line = br.readLine(); line != null; line = br.readLine()) {

                for (int j = 0; j < columns; j++) {

                    arrayPsw[i] = line.split(" ");

                }

                i++;
            }

            br.close();
        } catch (Exception e) {
            System.err.println("Error: De text file kan niet worden gelezen.");
        }
         System.out.println(Arrays.deepToString(arrayPsw));

        return arrayPsw;
    }
}