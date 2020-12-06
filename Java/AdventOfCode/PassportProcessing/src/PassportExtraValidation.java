import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PassportExtraValidation {


    public static void passportExtraValidation(ArrayList<String> arrayList){


        int i = 0;
        int validPassports =0;
        int notValidPassports= 0;
        String[] keyRequirements = new String[]{"byr","iyr","eyr","hgt","hcl", "ecl", "pid"};

        Map<String, String> keyValuesMap = new HashMap<>();


        for (String data: arrayList) {

            if(data.isEmpty()){
                i++;


                boolean valid = true;
                for (String key: keyRequirements) {

                    if(keyValuesMap.containsKey("byr")){

                        int year = Integer.parseInt(keyValuesMap.get("byr"));
                        if(year < 1920 || year > 2002)
                            valid = false;
                    }
                }
                if(!valid){

                    System.out.println("Nr."+i+ " PassportValuesAmount: "+ keyValuesMap.size() +" : NOT-VALID");
                    notValidPassports++;
                }

                if (valid){
                    System.out.println("Nr."+i+ " PassportValuesAmount: "+ keyValuesMap.size() +" : VALID!");
                    validPassports++;
                }

                keyValuesMap.clear();

            }
            else{

                String[] lineParts = data.split(" ");

                for (String part: lineParts){
                    String[] keyValuePares = part.split(":");
                    keyValuesMap.put(keyValuePares[0], keyValuePares[1]);
                }

            }

        }

        System.out.println("\nAmount of valid passports: " + validPassports);
        System.out.println("Amount of NOT valid passports: " + notValidPassports);
        System.out.println("TotalAmount: " + i);
        System.out.println("checkSum:" + (validPassports+notValidPassports));

    }

}



    }



}
