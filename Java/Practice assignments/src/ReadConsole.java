import java.io.*;
public class ReadConsole {

    public static void main(String args[]) throws IOException {
        InputStreamReader cin = null;

        try {
            cin = new InputStreamReader(System.in);
            System.out.println("Enter characters, 'q' to quit.");
            char c = 0;
            while(c != 'q') {
                c = (char) cin.read();
                System.out.print(c);
            }
        }finally {
            if (cin != null) {
                cin.close();
            }
        }
    }
}