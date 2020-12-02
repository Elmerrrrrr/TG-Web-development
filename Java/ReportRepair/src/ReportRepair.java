import java.util.ArrayList;
import java.util.Arrays;


public class ReportRepair {


    public static void main(String[] args) {

        ArrayList<Integer>reportList = ReadFiletoArray.fileToListArray();

//        System.out.println(Arrays.toString(reportList.toArray()));
//        for(int nr : reportList) System.out.println(nr);

        for(int i=0; i<reportList.size(); i++){

                     for (int j=1; j<reportList.size()-1; j++){

                            if(reportList.get(i)+reportList.get(j)==2020){

                                System.out.println("Found on position: " + i +" and " + j);
                                System.out.printf("%d %d", reportList.get(i), reportList.get(j));
                                System.out.println("\nThe multiplication of these numbers is: " + reportList.get(i)*reportList.get(j));
                                continue;
                            }

                         for (int k=2; k<reportList.size()-2; k++){

                             if(reportList.get(i)+reportList.get(j)+reportList.get(k)==2020){

                                 System.out.println("\nFound on position: " + i +" and " + j +" and " + k);
                                 System.out.printf("%d %d %d", reportList.get(i), reportList.get(j), reportList.get(k));
                                 System.out.println("\nThe multiplication of these numbers is: " + reportList.get(i)*reportList.get(j)*reportList.get(k));
                                 return;

                             }



                         }

                     }

        }


    }

}




