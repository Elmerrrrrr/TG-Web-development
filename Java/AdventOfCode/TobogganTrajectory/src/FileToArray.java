import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class FileToArray {

    public static ArrayList<String>  fileToArrayList() {

        ArrayList<String> arrayList =new ArrayList<String>();

        int i = 0;
            try {
                InputStream fis = new FileInputStream("map.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                for (String line = br.readLine(); line != null; line = br.readLine()) {

                        arrayList.add(line);
                        i++;
                }

                br.close();
            } catch (Exception e) {

                    System.err.println("Error: De text file kan niet worden gelezen.");
            }
            System.out.println(arrayList);
            System.out.println("lines: " + i);

            return arrayList;
    }
}

