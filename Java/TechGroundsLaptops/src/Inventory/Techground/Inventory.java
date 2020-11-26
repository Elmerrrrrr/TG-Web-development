package Inventory.Techground;

import Inventory.Techground.Items.Laptops;
import Inventory.Techground.Methods.*;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Inventory {

    public String itemName;

    public Inventory(String itemName){
        this.itemName = itemName;
//        this.brandName = brandName;
//        this.model = model;
//        this.price = price;
    }

    public Inventory() {

    }


    public static void main(String[] args) throws FileNotFoundException {

        String inventoryFile = "inventory-overview.txt";

        String newMenuItem3 ="";
        String newItem4="";


        Scanner scanner = new Scanner(System.in);
        String inputContinue = "";
        boolean inputCont = true;

        if (inputContinue == "c") {
            inputCont = true;
        }

        while (inputCont) {

            int rowsIndex = CountRows.countRows(inventoryFile);
           String[] indexArray = IndexFileToArray.fileToArray(rowsIndex,inventoryFile);


            for(int i=0; i<indexArray.length; i++) {


                    System.out.print("\nWelkom bij TechGrounds Inverntory, selecteer één van de volgende opties:\n" +
                            "1.Toon de " + indexArray[i]+ " inventory.\n" +
                            "2.Toon de " + indexArray[i]+ " inventory.\n" +
                            newMenuItem3 +
                            "\n11.Voeg een nieuwe inventory categorie toe.\n" +
                            "12.Beëindig de applicatie\n" +
                            "\n" +
                            ">Uw keuze: ");

            }

            String inputChoice = scanner.nextLine();


            switch (inputChoice) {

                case "1":

                    Laptops laptops = new Laptops();
                    laptops.menuLaptop();

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "2":

                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();

                    break;

                case "11":

                    System.out.print("Wat is de naam van de nieuwe inventory categorie? ");
                    String itemName = scanner.nextLine();

                    Inventory newItem = new Inventory(itemName);

                    int i=0;
                    newMenuItem3 = "3.Toon de "+indexArray[i]+ " inventory.\n";

                    CreateNewFile.createNewFile (itemName);

                    WriteNewInventoryItemToFile.writeToFile(inventoryFile,itemName);
                    System.out.println("\nDruk Enter om verder te gaan");
                    inputContinue = scanner.nextLine();
                break;

                case "12":

                    inputCont = false;
                    break;

                default:

                    System.out.println("Dit is geen juiste keuze!");
                    break;

            }
        }





    }

}
