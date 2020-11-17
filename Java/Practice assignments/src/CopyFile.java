import java.io.*;
public class CopyFile {

    public static void main(String args[]) throws IOException {
//        FileInputStream in = null; //8bit (reads one byte at a time)
//        FileOutputStream out = null;

            FileReader in = null; //16bit (reads two bytes at a time)
            FileWriter out = null;

        try {
//            in = new FileInputStream("input.txt");
//            out = new FileOutputStream("output.txt");

            in = new FileReader("input.txt");
            out = new FileWriter("output.txt");

            int c;
//            System.out.println("Before: " + c);
            while ((c = in.read()) != -1) {
                System.out.println("After: " + c);
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}