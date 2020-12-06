import java.math.BigInteger;
import java.util.ArrayList;

public class FindRoute {

    public static void findRoute(ArrayList<String>arrayList){

        char tree = '#';
        char square = '.';
        int treeCount= 0;
        int openSquare = 0;
        int slope = 0;
        int i = 0;
        int j = 0;




        for (i = 0; i <arrayList.size(); i++) {

            String lineToCheck = arrayList.get(i);

//            int slopeCheck = lineToCheck.length()%3;
//            System.out.println(slopeCheck);


            for ( j = 0; j < lineToCheck.length(); j++) {


               if (lineToCheck.charAt(slope)==tree){

                System.out.println("line: "+(i+1)+ " pos: " +(slope+1) +": X");
                treeCount++;
                break;
                }



                else if (lineToCheck.charAt(slope)==square){
                System.out.println("line: "+(i+1)+ " pos: " + (slope+1) +": O");
                openSquare++;
                break;
                }



            }

//            slope= (slope+=3) % 31; //assignment 1

//            slope= (slope+=1) % 31; // 66
//            slope= (slope+=3) % 31; // 153
//            slope= (slope+=5) % 31; // 79
//            slope= (slope+=7) % 31; // 92
            slope= (slope+=1) % 31; // 33
            i++;




        }

        BigInteger totalSlopes = new BigInteger("1");
        totalSlopes = totalSlopes.multiply(BigInteger.valueOf(66)).multiply(BigInteger.valueOf(153)).multiply(BigInteger.valueOf(79)).multiply(BigInteger.valueOf(92)).multiply(BigInteger.valueOf(33));

        System.out.println("\nAmount of Trees are: " + treeCount); //assignment 1
        System.out.println("Amount of openSquares are: " + openSquare);
        System.out.println("Total: " + (treeCount+openSquare));

        System.out.println("\nTotal Slopes: " + totalSlopes);



    }

}


