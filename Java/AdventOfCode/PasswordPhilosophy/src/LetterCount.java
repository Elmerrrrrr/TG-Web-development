import java.util.ArrayList;
import java.util.Arrays;

public class LetterCount {


    public static void letterCheck(String[][] array) {


        int letterCount = 0;
        int totalApproved = 0;
        int totalNotApproved = 0;
        int minimumLetterCheck = 0;
        int maximumLetterCheck = 0;
        String stringToCheck = "";
        char letterToCheck = '-';
        char letterToCheck2 = '-';

        int validPositionCheck1 = 0;
        int validPositionCheck2 = 0;

        System.out.println("array.length " + array.length);


        for (int i = 0; i < array.length; i++) {


            letterToCheck = array[i][1].replace(":", "").charAt(0);
            stringToCheck = array[i][2];
            minimumLetterCheck = Integer.parseInt(array[i][0].replaceAll("(-\\d+)", ""));
            maximumLetterCheck = Integer.parseInt(array[i][0].replaceAll("(\\d+-)", ""));


            for (int j = 0; j < stringToCheck.length(); j++) {

                if (stringToCheck.charAt(j) == letterToCheck) {
                    letterCount++;

                }

            }


            if (letterCount > 0 && (letterCount < minimumLetterCheck || letterCount > maximumLetterCheck)) {

                System.out.println("ERR: " + (i+1) + ". " + stringToCheck + " " + letterToCheck + "=" + letterCount + " min:" + minimumLetterCheck + " max:" + maximumLetterCheck + " :Not approved! ");
                letterCount = 0;
                totalNotApproved++;
            }
            else if (letterCount > 0 && letterCount >= minimumLetterCheck && letterCount <= maximumLetterCheck) {

                System.out.println("OK: " + (i+1) + ". " + stringToCheck + " " + letterToCheck + "=" + letterCount +  " min:" + minimumLetterCheck + " max:" + maximumLetterCheck +" :Approved! ");
                letterCount = 0;
                totalApproved++;
            }


        }
        System.out.println("\n totalNOTApproved: " + totalNotApproved);
        System.out.println("\n totalApproved: " + totalApproved);
    }

}
