import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFiletoArray {


        public static ArrayList<Integer> fileToArrayList(String file) {


            ArrayList<Integer> arrayList = new ArrayList<>();


            try {
                InputStream fis = new FileInputStream(file);
                BufferedReader br = new BufferedReader(new InputStreamReader(fis));

                for (String line = br.readLine(); line != null; line = br.readLine()) {

                    arrayList.add(Integer.parseInt(line));

                }

                br.close();
                fis.close();

            } catch (Exception e) {
                System.err.println("Error: De text file kan niet worden gelezen.");
            }

            return arrayList;
        }
    }

