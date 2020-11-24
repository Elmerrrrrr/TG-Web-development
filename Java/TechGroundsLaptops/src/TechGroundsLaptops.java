import java.io.*;
import java.util.Scanner;




public class TechGroundsLaptops {


    public static int countRows(String file){

        int countRows=0;

        try{
            InputStream fileInput = new FileInputStream(file);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInput));

            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                countRows++;
            }

            reader.close();
        }
        catch(Exception e){
            System.err.println("Error: De text file kan niet worden gelezen.");
        }
        return countRows;
    }

    public static String[][] fileToArray(int rows, int columns, String file){


        String array[][] = new String[rows][columns];

        try{
            InputStream fis = new FileInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            int i= 0;
            for (String line = br.readLine(); line != null; line = br.readLine()) {

                for (int j = 0; j < columns; j++) {
                    array[i] = line.split(" ");
                }
                i++;
            }

            br.close();
        }
        catch(Exception e){
            System.err.println("Error: De text file kan niet worden gelezen.");
        }

    return array;
    }

    public static void printArray(String array[][], int columns, boolean price){


        for (int i= 0; i<array.length; i++) {

            System.out.println();

            if(!price){
                System.out.print(i+1 + ". ");
            }else
                System.out.println(i+1 + ".");
            for (int j = 0; j < columns; j++) {

                if (j % 3 == 0) { // 0,3,6,9,12,etc
                    if(!price){
                        System.out.print("Merk: " + array[i][j]);
                    }else
                    System.out.println("Merk: " + array[i][j]);
                }
                if (j % 3 == 1) {// 1,4,7,10,13,etc
                    if(!price){
                        System.out.print(" || Model: " + array[i][j]);
                    }else
                    System.out.println("Model: " + array[i][j]);
                }
                if (price && j % 3 == 2) { // 2,5,8,11,14,etc
                    System.out.println("Prijs: €" + array[i][j]);
                }
            }
        }
    }

    public static void writeToFile(String file, String inputAddBrand, String inputAddModel, String inputAddPrice){
    try {
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferedWriter = new BufferedWriter(writer);
        bufferedWriter.newLine();
        bufferedWriter.write(inputAddBrand + " " + inputAddModel + " " + "€" + inputAddPrice);

        bufferedWriter.close();
    }
    catch (IOException e) {
        e.printStackTrace();
    }
       System.out.println("\nDe database is succeesvol bijgewerkt.");

    }

    public static String[][] sortArray(String[][] arrayFilled,int rows, boolean az, boolean za, boolean priceUp, boolean priceDown){


   if(az){


         int column = 0; //Merk
         int i=0,j=0;
         String[] temp = null;
         boolean swap=true;

         while(swap)
             for (i = 0; i < rows - 1; i++) {
                 swap=false;
                 if(arrayFilled[i][column].compareTo(arrayFilled[i+1][column]) > 0){
                     temp = arrayFilled[i];
                     arrayFilled[i] = arrayFilled[i+1];
                     arrayFilled[i+1]=temp;
                     swap=true;
                 }
             }


     }

   if(za){

         int column = 0; //Merk
         int i=0,j=0;
         String[] temp = null;
         boolean swap=true;

         while(swap)
             for (i = 0; i < rows - 1; i++) {
                 swap=false;
                 if(arrayFilled[i][column].compareTo(arrayFilled[i+1][column]) < 0){
                     temp = arrayFilled[i];
                     arrayFilled[i] = arrayFilled[i+1];
                     arrayFilled[i+1]=temp;
                     swap=true;
                 }
             }


     }

   if(priceUp){
         int column = 2; //price
         int i=0,j=0;
         String[] temp = null;
         boolean swap=true;
       System.out.println(arrayFilled[0][column]);

         while(swap)
             for (i = 0; i < rows -1 ; i++) {
                 swap=false;
                 if(arrayFilled[i][column].compareTo(arrayFilled[i+1][column]) > 0){
                     temp = arrayFilled[i];
                     arrayFilled[i] = arrayFilled[i+1];
                     arrayFilled[i+1]=temp;
                     swap=true;
                 }
             }

     }

   if(priceDown){
         int column = 2; //price
         int i=0,j=0;
         String[] temp = null;
         boolean swap=true;
//         System.out.println(rows);
         while(swap)
             for (i = 0; i < rows -1; i++) {
                 swap=false;
                 if(arrayFilled[i][column].compareTo(arrayFilled[i+1][column]) < 0){
                     temp = arrayFilled[i];
                     arrayFilled[i] = arrayFilled[i+1];
                     arrayFilled[i+1]=temp;
                     swap=true;
                 }
             }

     }


//It keeps applying the bubblesort until no more swaps are performed. At that point,the condition while(swap)
// is no longer satisfied and the method returns

return arrayFilled;

 }

    public static String[][] deleteRow( String[][] array, int deleteNr, int rows){

       String[][] arrayNew = new String[array.length-1][];

        System.out.println("\nDeleting... " + deleteNr+ ". " + array[deleteNr-1][0] +" " + array[deleteNr-1][1]);

        for (int i = 0; i<array.length; i++) {


            for(int j = 0; j<array[i].length; j++){

                if (i == deleteNr-1) { // check if index is crossed, continue without copying
                    continue;
                }
                array[i][j] = arrayNew[i][j]; //does not function yet, and needs a array write to file functionality
            }

        }

        return arrayNew;

    }



    public static void main(String[] args) throws IOException {

        String file = "laptops.txt";
        int rows = countRows(file);
        int columns = 3; //for the current layout


        Scanner scanner = new Scanner(System.in);
        String inputContinue = "";
        boolean inputCont = true;

        if (inputContinue == "c") {
            inputCont = true;
        }

        while (inputCont) {
            System.out.print("\nWelkom bij TechGrounds Laptops, selecteer één van de volgende opties:\n" +
                    "1.Weergeef alle producten.\n" +
                    "2.Weergeef alle producten gesorteerd op merknaam van a → z.\n" +
                    "3.Weergeef alle producten gesorteerd op merknaam van z ← a.\n" +
                    "4.Weergeef alle producten gesorteerd op prijs van hoog naar laag.\n" +
                    "5.Weergeef alle producten gesorteerd op prijs van laag naar hoog.\n" +
                    "6.Voeg een product toe.\n" +
                    "7.Verwijder een product.\n" +
                    "8.Beëindig de applicatie\n" +
                    "\n" +
                    ">Uw keuze: ");

            String inputChoice = scanner.nextLine();


            switch (inputChoice) {

                case "1":

                    String[][] array = fileToArray(rows, columns, file);
                    printArray(array, columns,true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "2":

                    String[][] arrayAZ = fileToArray(rows, columns, file);
                    String[][] sortedArrayAZ = sortArray(arrayAZ,rows,true, false,false, false);
                    printArray(sortedArrayAZ, columns, true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "3":

                    String[][] arrayZA = fileToArray(rows, columns, file);
                    String[][] sortedArrayZA = sortArray(arrayZA, rows, false, true,false, false);
                    printArray(sortedArrayZA, columns,true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;


                case "4":

                    String[][] arrayPriceUp = fileToArray(rows, columns, file);
                    String[][] sortedArrayPriceUp = sortArray(arrayPriceUp,rows,false, false,true,false);
                    printArray(sortedArrayPriceUp, columns,true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "5":
                    String[][] arrayPriceDown = fileToArray(rows, columns, file);
                    String[][] sortedArrayPriceDown = sortArray(arrayPriceDown,rows,false, false,false,true);
                    printArray(sortedArrayPriceDown, columns,true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "6":

                    System.out.print("\nWat is het merk van de laptop? ");
                        String inputAddBrand = scanner.nextLine();
                    System.out.print("Wat is het model van de laptop? ");
                        String inputAddModel = scanner.nextLine();
                    System.out.print("Wat is de prijs van de laptop? ");
                        String inputAddPrice = scanner.nextLine();

                    writeToFile(file, inputAddBrand, inputAddModel, inputAddPrice);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                    break;

                case "7":

                    String[][] arrayDelete = fileToArray(rows, columns, file);

                    System.out.println("Dit zijn de aanwezige laptops:");
                    printArray(arrayDelete, columns, false);
                    System.out.print("\n\nWelke nummer wilt u verwijderen? ");
                    String inputDeleteItem = scanner.nextLine();
                    int delNr = Integer.parseInt(inputDeleteItem);

                    String[][] arrayNew = deleteRow(arrayDelete,delNr,rows);

                    System.out.println("\nDe database is succeesvol bijgewerkt.");
                    printArray(arrayNew, columns, false);

                    System.out.println("Druk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                    break;

                case "8":
                    return;

                default:
                    System.out.println("Dit is (nog) geen keuze!");
                    break;

            }
        }
    }

}
