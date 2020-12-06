import java.util.ArrayList;

public class TobogganTrajectory {


    public static void main(String[] args) {

        ArrayList<String> arrayList = FileToArray.fileToArrayList();

        FindRoute.findRoute(arrayList);

    }
}
