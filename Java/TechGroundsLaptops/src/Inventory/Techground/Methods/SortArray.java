package Inventory.Techground.Methods;

public class SortArray {
    public static String[][] sortArray(String[][] arrayFilled, int rows, boolean az, boolean za, boolean priceUp, boolean priceDown) {


        if (az) {

            int column = 0; //Merk
            int i = 0, j = 0;
            String[] temp = null;
            boolean swap = true;


            for (i = 0; i < (arrayFilled.length); i++) {

                if (i == arrayFilled.length - 1) {
                    break;
                } else if (arrayFilled[i][column].compareTo(arrayFilled[i + 1][column]) > 0) {

                    temp = arrayFilled[i];
                    arrayFilled[i] = arrayFilled[i + 1];
                    arrayFilled[i + 1] = temp;
                    i = 0;

                }


            }

        }

        if (za) {

            int column = 0; //Merk
            int i = 0, j = 0;
            String[] temp = null;
            boolean swap = true;


            for (i = 0; i < (arrayFilled.length); i++) {

                if (i == arrayFilled.length - 1) {
                    break;
                } else if (arrayFilled[i][column].compareTo(arrayFilled[i + 1][column]) < 0) {

                    temp = arrayFilled[i];
                    arrayFilled[i] = arrayFilled[i + 1];
                    arrayFilled[i + 1] = temp;
                    i = 0;

                }

            }
        }

        if (priceUp) {

//       Arrays.sort(arrayFilled,(String[] a,String[] b)->{
//           //here multiple lines of code can be placed
//           return a[0] - b[0];
//       });


//       int column = 2; //price
//       String[] temp = null;
//
//            //Loop for the rows
//           for (int i = 0; i < arrayFilled.length -1; i++) {
//
//               //Loop for columns
//               for (int j=0; j<arrayFilled[i].length; j++){
//
//                   // loop for comparison and swapping
//                    for (int k=0; k<arrayFilled[i].length -j-1; k++) {
//
//                             //Swapping elements
//                            if (arrayFilled[i][column].compareTo(arrayFilled[i + 1][column]) < 0) {
//                                temp = arrayFilled[i];
//                                arrayFilled[i] = arrayFilled[i + 1];
//                                arrayFilled[i + 1] = temp;
//
//                            }
//                    }
//               }
//           }


        }


        if (priceDown) {


            int column = 2; //Price
            String[] temp = null;

            for (int i = 0; i < arrayFilled.length; i++) {

                if (i == arrayFilled.length - 1) {
                    break;
                } else if (arrayFilled[i][column].compareTo(arrayFilled[i + 1][column]) < 0) {

                    temp = arrayFilled[i];
                    arrayFilled[i] = arrayFilled[i + 1];
                    arrayFilled[i + 1] = temp;
                    i = 0;

                }

            }

        }


        return arrayFilled;

    }
}
