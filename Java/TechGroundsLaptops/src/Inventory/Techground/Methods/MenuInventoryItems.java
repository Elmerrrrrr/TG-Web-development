package Inventory.Techground.Methods;

import Inventory.Techground.Inventory;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuInventoryItems {

    public static void menu(String inventoryName, String file) throws FileNotFoundException {


        int columns = 3; //for the current layout

        Scanner scanner = new Scanner(System.in);
        String inputContinue = "";
        boolean inputCont = true;



        while (inputCont) {

            int rows = CountRows.countRows(file);

            System.out.print("\n\n<----Welkom bij TechGrounds Inventory "+inventoryName+", selecteer één van de volgende opties:---->\n\n" +
                    "1.Toon alle "+inventoryName+".\n" +
                    "2.Toon alle "+inventoryName+" gesorteerd op merknaam van a → z.\n" +
                    "3.Toon alle "+inventoryName+" gesorteerd op merknaam van z ← a.\n" +
                    "4.Toon alle "+inventoryName+" gesorteerd op prijs van hoog naar laag.\n" +
                    "5.Toon alle "+inventoryName+" gesorteerd op prijs van laag naar hoog.\n" +
                    "6.Voeg "+inventoryName+" toe.\n" +
                    "7.Verwijder "+inventoryName+".\n" +
                    "8.Terug naar het hoofd menu.\n" +
                    "\n>Uw keuze: ");

            String inputChoice = scanner.nextLine();


            switch (inputChoice) {

                case "1":

                    String[][] array = FileToArray.fileToArray(rows, columns, file);
                    PrintArray.printArray(array, columns, true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "2":

                    String[][] arrayAZ = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayAZ = SortArray.sortArray(arrayAZ, rows, true, false, false, false);
                    PrintArray.printArray(sortedArrayAZ, columns, true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "3":

                    String[][] arrayZA = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayZA = SortArray.sortArray(arrayZA, rows, false, true, false, false);
                    PrintArray.printArray(sortedArrayZA, columns, true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;


                case "4":

                    String[][] arrayPriceUp = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayPriceUp = SortArray.sortArray(arrayPriceUp, rows, false, false, true, false);
                    PrintArray.printArray(sortedArrayPriceUp, columns, true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "5":
                    String[][] arrayPriceDown = FileToArray.fileToArray(rows, columns, file);
                    String[][] sortedArrayPriceDown = SortArray.sortArray(arrayPriceDown, rows, false, false, false, true);
                    PrintArray.printArray(sortedArrayPriceDown, columns, true);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "6":

                    System.out.print("\nWat is het merk van de " + inventoryName + "? ");
                    String inputAddBrand = scanner.nextLine();
                    System.out.print("Wat is het model van de " + inventoryName + "? ");
                    String inputAddModel = scanner.nextLine();
                    System.out.print("Wat is de prijs van de " + inventoryName + "? ");
                    String inputAddPrice = scanner.nextLine();

                    WriteToFile.writeToFile(file, inputAddBrand, inputAddModel, inputAddPrice);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                    break;

                case "7":

                    String[][] arrayDelete = FileToArray.fileToArray(rows, columns, file);

                    System.out.println("Dit zijn de aanwezige "+inventoryName+":");
                    PrintArray.printArray(arrayDelete, columns, false);

                    System.out.print("\n\nWelke nummer wilt u verwijderen? ");
                    String inputDeleteItem = scanner.nextLine();
                    int delNr = Integer.parseInt(inputDeleteItem);

                    String[][] arrayNew = DeleteRow.deleteRow(arrayDelete, delNr, columns);
                    ArrayToFile.arrayToFile(arrayNew, file);
                    PrintArray.printArray(arrayNew, columns, false);

                    System.out.println("\n\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                    break;

                case "8":
                    inputCont = false;
                    return;


                case "9":

                    break;

                case "10":
                    //int rows, int columns, String file
                    ArrayList<String[]> arrayList = FileToArrayList.fileToListArray(rows, columns, file);

                    //printListArray(ArrayList<String[]> arrayList , int columns, boolean price)
                    PrintArrayList.printListArray(arrayList, columns, true);

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
