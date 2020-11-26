package Inventory.Techground.Methods;

public class PrintArray {
    public static void printArray(String array[][], int columns, boolean price) {


        for (int i = 0; i < array.length; i++) {

            System.out.println();

            if (!price) {
                System.out.print(i + 1 + ". ");
            } else
                System.out.println(i + 1 + ".");
            for (int j = 0; j < columns; j++) {

                if (j % 3 == 0) { // 0,3,6,9,12,etc
                    if (!price) {
                        System.out.print("Merk: " + array[i][j]);
                    } else
                        System.out.println("Merk: " + array[i][j]);
                }
                if (j % 3 == 1) {// 1,4,7,10,13,etc
                    if (!price) {
                        System.out.print(" || Model: " + array[i][j]);
                    } else
                        System.out.println("Model: " + array[i][j]);
                }
                if (price && j % 3 == 2) { // 2,5,8,11,14,etc
                    System.out.println("Prijs: €" + array[i][j]);
                }
            }
        }
    }
}
