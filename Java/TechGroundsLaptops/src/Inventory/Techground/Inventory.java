package Inventory.Techground;

import Inventory.Techground.Methods.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inventory {

    public String inventoryName;

    public Inventory(String inventoryName){
        this.inventoryName = inventoryName;
    }




    public static void main(String[] args) throws FileNotFoundException {

        String inventoryFile = "inventory-overview.dat";

        Scanner scanner = new Scanner(System.in);
        String inputContinue = " ";
        boolean inputCont = true;


        while (inputCont) {

           int rowsIndex = CountRows.countRows(inventoryFile);
           String[] indexArray = IndexFileToArray.fileToArray(rowsIndex,inventoryFile, false);


                    System.out.print("\n\n<----Welkom bij TechGrounds Inventory, selecteer één van de volgende opties:---->\n\n" +
                            (indexArray.length >0 ? indexArray[0]:"Maak de eerste inventory categorie aan!") +
                            (indexArray.length >1 ? indexArray[1]:"") +
                            (indexArray.length >2 ? indexArray[2]:"") +
                            (indexArray.length >3 ? indexArray[3]:"") +
                            (indexArray.length >4 ? indexArray[4]:"") +
                            (indexArray.length >5 ? indexArray[5]:"") +
                            "\n11.Voeg een nieuwe inventory categorie toe.\n" +
                            "12.Beëindig de applicatie" +
                            "\n\n>Uw keuze: ");


            String inputChoice = scanner.nextLine();

            String[] indexCaseArray = IndexFileToArray.fileToArray(rowsIndex,inventoryFile, true);

            switch (inputChoice) {

                case "1":

                    MenuInventoryItems.menu(indexCaseArray[0], indexCaseArray[0]+".dat");

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "2":

                    MenuInventoryItems.menu(indexCaseArray[1], indexCaseArray[1]+".dat");
                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;


                case "3":
                    if (indexCaseArray.length>2){
                    MenuInventoryItems.menu(indexCaseArray[2], indexCaseArray[2]+".dat");
                    }
                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "4":
                    if (indexCaseArray.length>3) {
                        MenuInventoryItems.menu(indexCaseArray[3], indexCaseArray[3]+".dat");
                    }
                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;


                case "5":
                    if (indexCaseArray.length>4) {
                        MenuInventoryItems.menu(indexCaseArray[4], indexCaseArray[4]+".dat");
                    }
                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "11":

                    System.out.print("Wat is de naam van de nieuwe inventory categorie? ");
                    String itemName = scanner.nextLine();

//                    Inventory newItem = new Inventory(itemName);
                    CreateNewFile.createNewFile (itemName);
                    WriteNewInventoryItemToFile.writeToFile(inventoryFile,itemName);

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                break;

                case "12":
                    inputCont = false;
                    System.out.println("\n      <---Bedankt voor het gebruik van deze software!--->\n\n");
                    break;

                default:

                    System.out.println("Dit is geen juiste keuze!");
                    break;

            }
        }





    }

}
