package Inventory.Techground.Methods;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintArrayList {
    public static void printListArray(ArrayList<String[]> arrayList, int columns, boolean price) {

        int length = arrayList.size();

        for (int i = 0; i < length; i++) {

            System.out.println();

            if (!price) {
                System.out.print(i + 1 + ". ");
            } else
                System.out.println(i + 1 + ".");
            for (int j = 0; j < columns; j++) {

                if (j % 3 == 0) { // 0,3,6,9,12,etc
                    if (!price) {
                        System.out.print("Merk: " + Arrays.deepToString(arrayList.get(i)));
                    } else
                        System.out.println("Merk: " + Arrays.deepToString(arrayList.get(i)));
                }
                if (j % 3 == 1) {// 1,4,7,10,13,etc
                    if (!price) {
                        System.out.print(" || Model: " + arrayList.get(i));
                    } else
                        System.out.println("Model: " + arrayList.get(i));
                }
                if (price && j % 3 == 2) { // 2,5,8,11,14,etc
                    System.out.println("Prijs: €" + arrayList.get(i));
                }
            }
        }
    }
}
