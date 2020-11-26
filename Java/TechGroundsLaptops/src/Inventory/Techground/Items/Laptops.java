package Inventory.Techground.Items;
import Inventory.Techground.Inventory;
import Inventory.Techground.Methods.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Laptops extends Inventory  {

    public static String file = "laptops.txt";

    public Laptops() {
        super();

    }


    public void menuLaptop() throws FileNotFoundException {


        int columns = 3; //for the current layout

        Scanner scanner = new Scanner(System.in);
        String inputContinue = "";
        boolean inputCont = true;

        if (inputContinue == "c") {
            inputCont = true;
        }

        while (inputCont) {

            int rows = CountRows.countRows(file);

            System.out.print("\nWelkom bij TechGrounds Inventory Laptops, selecteer één van de volgende opties:\n" +
                    "1.Weergeef alle producten.\n" +
                    "2.Weergeef alle producten gesorteerd op merknaam van a → z.\n" +
                    "3.Weergeef alle producten gesorteerd op merknaam van z ← a.\n" +
                    "4.Weergeef alle producten gesorteerd op prijs van hoog naar laag.\n" +
                    "5.Weergeef alle producten gesorteerd op prijs van laag naar hoog.\n" +
                    "6.Voeg een product toe.\n" +
                    "7.Verwijder een product.\n" +
                    "8.Terug naar vorig menu.\n" +
                    "9.Beëindig de applicatie\n" +
                    "\n" +
                    ">Uw keuze: ");

            String inputChoice = scanner.nextLine();


            switch (inputChoice) {

                case "1":

                    String[][] array = FileToArray.fileToArray(rows, columns, file);
                    PrintArray.printArray(array, columns,true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "2":

                    String[][] arrayAZ = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayAZ = SortArray.sortArray(arrayAZ,rows,true, false,false, false);
                    PrintArray.printArray(sortedArrayAZ, columns, true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "3":

                    String[][] arrayZA = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayZA = SortArray.sortArray(arrayZA, rows, false, true,false, false);
                    PrintArray.printArray(sortedArrayZA, columns,true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;


                case "4":

                    String[][] arrayPriceUp = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayPriceUp = SortArray.sortArray(arrayPriceUp,rows,false, false,true,false);
                    PrintArray.printArray(sortedArrayPriceUp, columns,true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "5":
                    String[][] arrayPriceDown = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayPriceDown = SortArray.sortArray(arrayPriceDown,rows,false, false,false,true);
                    PrintArray.printArray(sortedArrayPriceDown, columns,true);

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

                    WriteToFile.writeToFile(file, inputAddBrand, inputAddModel, inputAddPrice);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                    break;

                case "7":

                    String[][] arrayDelete = FileToArray.fileToArray(rows, columns, file);

                    System.out.println("Dit zijn de aanwezige laptops:");
                    PrintArray.printArray(arrayDelete, columns, false);

                    System.out.print("\n\nWelke nummer wilt u verwijderen? ");
                    String inputDeleteItem = scanner.nextLine();
                    int delNr = Integer.parseInt(inputDeleteItem);

                    String[][] arrayNew = DeleteRow.deleteRow(arrayDelete,delNr, columns);
                    ArrayToFile.arrayToFile(arrayNew, file);
                    PrintArray.printArray(arrayNew, columns, false);

                    System.out.println("\n\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                    break;

                case "8":
                    Inventory inventory = new Inventory();
                    inventory.main(null);


                    break;

                case "9":
                    return; //exit program

                case "10":
                    //int rows, int columns, String file
                    ArrayList<String[]> arrayList = FileToArrayList.fileToListArray(rows,columns,file);

                    //printListArray(ArrayList<String[]> arrayList , int columns, boolean price)
                    PrintArrayList.printListArray(arrayList,columns,true);

                    System.out.println("Druk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                    break;

                default:
                    System.out.println("Dit is geen juiste keuze!");
                    break;

            }
        }
    }

}

