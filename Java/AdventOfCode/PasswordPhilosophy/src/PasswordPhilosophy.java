
public class PasswordPhilosophy {

    public static void main(String[] args) {


       String[][] passwordsList = FileToArrayList.fileToArrayList();

//        System.out.println(Arrays.toString(passwordsList.toArray()));
//        for(String[] nr : passwordsList) System.out.println(Arrays.toString(nr));


        LetterCount.letterCheck(passwordsList);//assignment 1

       // LetterPosition.letterCheck(passwordsList);//assignment 2

    }

}


