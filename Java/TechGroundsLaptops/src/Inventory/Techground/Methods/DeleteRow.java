package Inventory.Techground.Methods;

public class DeleteRow {
    public static String[][] deleteRow(String[][] array, int deleteNr, int columns) {

        String[][] arrayNew = new String[array.length - 1][columns];

        System.out.println("\nDeleting... " + deleteNr + ". " + array[deleteNr - 1][0] + " " + array[deleteNr - 1][1]);

        int currentShift = 0;
        for (int i = 0; i < array.length - 1; i++) {

            if (i == deleteNr - 1) {

                for (int j = 0; j < array[i].length; j++) {

                    arrayNew[i][j] = array[i + 1][j];//  shift the index number to delete
                }
                currentShift++;
            } else {

                for (int j = 0; j < array[i].length; j++) {

                    arrayNew[i][j] = array[i + currentShift][j];
                }
            }

        }

        return arrayNew;

    }
}
