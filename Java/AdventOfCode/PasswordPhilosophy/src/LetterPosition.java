
    public class LetterPosition  {



        public static void letterCheck(String[][] array){


            int totalApproved = 0;
            int totalNotApproved = 0;
            int positionCheck1 = 0;
            int positionCheck2 = 0;
            String stringToCheck = "";
            char letterToCheck ='-';
            boolean valid1 = false;
            boolean valid2 =true;

            int i =0;

            System.out.println("array.length "+ array.length);


            for(i =0; i< array.length; i++ ) {


                letterToCheck = array[i][1].replace(":", "").charAt(0);
                stringToCheck = array[i][2];
                int stringLength = stringToCheck.length();
                positionCheck1 = Integer.parseInt(array[i][0].replaceAll("(-\\d+)", ""));
                positionCheck2 = Integer.parseInt(array[i][0].replaceAll("(\\d+-)", ""));


                for ( int  j = 0; j < stringToCheck.length(); j++) {

                    if (stringToCheck.charAt(j) == letterToCheck && positionCheck1 == j+1 ) {

                         valid1=true;

                    }
                    if(valid1 && stringToCheck.charAt(j) == letterToCheck && positionCheck2 == j+1){

                        valid2 = false;
                    }

                    if(!valid1 && stringToCheck.charAt(j) == letterToCheck && positionCheck2 == j+1){

                        valid1 = true;
                    }

                }

                    if (valid1 && valid2) {

                        System.out.println("OK: " + (i+1) + ". " + stringToCheck + " " + positionCheck1+ letterToCheck + " and not/or " +positionCheck2 + letterToCheck + " :Approved! ");
                        totalApproved++;
                        valid1=false;
                        valid2 = true;
                    }

                    else{
                        System.out.println("ERR: " + (i+1) + ". " + stringToCheck + " " + positionCheck1+ letterToCheck + " and not/or " +positionCheck2 + letterToCheck + " :NOT Approved! ");

                        totalNotApproved++;
                        valid1=false;
                        valid2 = true;

                    }

            }

            System.out.println("\n totalNOTApproved: " + totalNotApproved);
            System.out.println("\n totalApproved: " + totalApproved);
        }
}


