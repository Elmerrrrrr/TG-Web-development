import com.opencsv.bean.CsvToBeanBuilder;
import dataObjects.Airport;
import dataObjects.Country;
import dataObjects.CountryAirports;
import dataObjects.Runway;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName1 = "src/main/java/data/airports.csv";
        String fileName2 = "src/main/java/data/countries.csv";
        String fileName3 = "src/main/java/data/runways.csv";


        List<Airport> airportsList = new CsvToBeanBuilder(new FileReader(fileName1))
                .withType(Airport.class)
                .build()
                .parse();


        List<Country> countryList = new CsvToBeanBuilder(new FileReader(fileName2))
                .withType(Country.class)
                .build()
                .parse();

        List<Runway> runwayList = new CsvToBeanBuilder(new FileReader(fileName3))
                .withType(Runway.class)
                .build()
                .parse();



//        airportsList.forEach(System.out::println);
//        countryList.forEach(System.out::println);
//        runwayList.forEach(System.out::println);


        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.print("\n Enter a valid country code or country name ");
            System.out.print("\n Or type 'TOP10' for a list of the ten countries with the most airports ");
            System.out.print("\n > ");

            String input = in.nextLine();


            // Runways for each airport given a country code or country name

            for (int i = 0; i <countryList.size() ; i++) {
                int countAirport = 0;
                if (input.equalsIgnoreCase(countryList.get(i).getCountryCode())
                        || input.equalsIgnoreCase(countryList.get(i).getName())
                        || countryList.get(i).getName().toLowerCase().startsWith(input.toLowerCase())
                ){

                    for (int j = 0; j <airportsList.size() ; j++) {

                        if (airportsList.get(j).getIso_country().equals(countryList.get(i).getCountryCode())){

                            System.out.println("\n#"+ ++countAirport + " dataObjects.Airport in " + countryList.get(i).getName()  + " found, with name: " + airportsList.get(j).getName());

                            for (int k = 0; k < runwayList.size(); k++) {

                                if (runwayList.get(k).getAirport_ref().equals(airportsList.get(j).getId())){
                                    System.out.print("- with runways: #"+ runwayList.get(k).getId()+"\n");
                                }
                            }
                        }
                    }
                }
            }



            // Top 10 countries with highest number of airports

            if (input.equalsIgnoreCase("TOP10")){

                List<CountryAirports> countryAirportsList = new ArrayList<>();

                for (int i = 0; i <countryList.size() ; i++) {

                    CountryAirports countryAirportsObj = new CountryAirports();
                    countryAirportsObj.setCountryCode(countryList.get(i).getCountryCode());
                    countryAirportsObj.setCountryName(countryList.get(i).getName());

                    List<Airport> airportsPerCountryList = new ArrayList<>();


                    for (int j = 0; j <airportsList.size() ; j++) {

                        if (countryAirportsObj.getCountryCode().equals(airportsList.get(j).getIso_country())){

                            Airport airport = new Airport();
                            airport.setId(airportsList.get(j).getId());
                            airport.setName(airportsList.get(j).getName());
                            airport.setIso_country(airportsList.get(j).getIso_country());
                            airportsPerCountryList.add(airport);

                        }

                        countryAirportsObj.setTopList(airportsPerCountryList);

                    }

                    countryAirportsObj.setAirportCount(airportsPerCountryList.size());
                    countryAirportsList.add(countryAirportsObj);

                }

                countryAirportsList.sort(Collections.reverseOrder());
                countryAirportsList.subList(0, 9).forEach(System.out::println);

            }



        }

    }

}

