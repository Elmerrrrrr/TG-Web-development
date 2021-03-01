import java.util.List;

public class BinaryBoarding {


    public static void main(String[] args) {

        List<String> dataInputList = FileToArray.fileToArrayList();

//        dataInputList.forEach(System.out::println);
//        System.out.println("Data amount: " + dataInputList.size());


        int[] rowIdsFront = {64, 32, 16, 8, 4, 2};
        int[] rowIds = {127, 63, 31, 15, 7, 3, 1, 0};
        int[] rowIdsBack = {64, 32, 16, 8, 4, 2};


        int i =0;
        for (String row: dataInputList ) {

            //Split every sequence into letters
            String[] array = row.split("");
            int rowID = 0;
            int min = 1;
            int max = 128;
            i++;
            for (String character: array) {


                // Upper half
                if (character.matches("B")) {

                    min = max - (max/2); //128-32
                    max = max;  //128
                }

                // Lower half
                else if(character.matches("F")){
                    min = min;
                    max = max/2;

                    }

                }
            System.out.println("Row#"+i+" min:" + min +" max:"+max);
            }

        }


    }


