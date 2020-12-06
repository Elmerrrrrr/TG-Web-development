import java.util.ArrayList;
import java.util.List;


public class PassportProcessing {


    public static void main(String[] args) {

        ArrayList<String> ArrayList  = FileToArray.fileToArrayList();

         PassportCheck.passportCheck(ArrayList); //assignment 1

         PassportExtraValidation.passportExtraValidation(ArrayList);





    }
}
