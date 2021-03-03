import java.util.ArrayList;
import java.util.List;

public class BinaryBoarding {


    public static void main(String[] args) {

        List<String> dataInputList = FileToArray.fileToArrayList();


        List<Integer> boardInputList = new ArrayList<>();

        int i =0;
        for (String data: dataInputList ) {

            //Split every sequence into letters
            String[] array = data.split("");
            int minC = 0;
            int maxC = 127;
            int minR = 0;
            int maxR = 7;
            i++;
            for (String character: array) {


                // Upper half
                if (character.matches("[B|R]")) {
                    minC = (maxC - (maxC - minC)/2);
                    maxC = maxC;
//                    System.out.println("B- Min: " + minC + " max: " +maxC);
                }

                // Lower half
                 if(character.matches("[F|L]")){

                    minC = minC;
                    maxC = (maxC - (maxC -minC)/2 -1);
//                    System.out.println("F- Min: " + minC + " max: " +maxC);
                    }



            }
            boardInputList.add(minC*8+minR);
            System.out.println("BoardingPass#"+i+" Column: " + minC+" seatID: "+(minC*8+minR));

            }

        boardInputList.sort(Integer::compareTo);
        boardInputList.forEach(System.out::println);

        }


    }


