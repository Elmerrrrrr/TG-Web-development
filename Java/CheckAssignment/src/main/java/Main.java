import com.opencsv.bean.CsvToBeanBuilder;
import dataObjects.*;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

/*
*
*
*
* */
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
//            System.out.println("Runways for airports in this country: " + input);

            if (input.equalsIgnoreCase("TOP10")){

                List<CountryAirports> countryAirportsList = new ArrayList<>();

                for (int i = 0; i <countryList.size() ; i++) {

                    CountryAirports countryAirportsObj = new CountryAirports();
                    countryAirportsObj.setCountryId(countryList.get(i).getCountryId());
                    List<Airport> airportsPerCountry = new ArrayList<>();

                    for (int j = 0; j <airportsList.size() ; j++) {

                        if (countryAirportsObj.getTopList().get(i).getId().equals(airportsList.get(j).getIso_country())){

                            Airport airport = new Airport();
                            airport.setId(airportsList.get(j).getId());
                            airport.setName(airportsList.get(j).getName());
                            airportsPerCountry.add(airport);

                        }

//                        airportsPerCountry.add(airportsList);
                    }
                }
//                countryAirportsList.add();

            }



            for (int i = 0; i <countryList.size() ; i++) {
                int countAirport = 0;
                if (input.equalsIgnoreCase(countryList.get(i).getCountryCode()) || input.equalsIgnoreCase(countryList.get(i).getName())){
//                    System.out.println("Country found " + " name= " + countryList.get(i).getName());

                    for (int j = 0; j <airportsList.size() ; j++) {

                        if (airportsList.get(j).getIso_country().equals(countryList.get(i).getCountryCode())){
//
                            System.out.println("\n#"+ ++countAirport + " Airport in " + countryList.get(i).getName()  + " found, with name: " + airportsList.get(j).getName());

                            for (int k = 0; k < runwayList.size(); k++) {

                                if (runwayList.get(k).getAirport_ref().equals(airportsList.get(j).getId())){
                                    System.out.print("- with runways: #"+ runwayList.get(k).getId()+"\n");
                                }

                            }

                        }
                    }

                }
            }



        }
    }



//        List<AirportWithRunways> airportRunwaysList = new ArrayList<>();
//
//        for (int i = 0; i <airportsList.size() ; i++) {
//
//            AirportWithRunways airportWithRunways = new AirportWithRunways();
//            airportWithRunways.setAirportId(airportsList.get(i).getId());
//            airportWithRunways.setAirportName(airportsList.get(i).getName());
//            airportWithRunways.setCounty(airportsList.get(i).getName());
//            airportWithRunways.setAirportCountryCode(airportsList.get(i).getIso_country());
//
//            List<Runway> runwayListAirport = new ArrayList<>();
//            for (int j = 0; j < runwayList.size(); j++) {
//
//                if (airportWithRunways.getAirportId().equals(runwayList.get(j).getAirport_ref())){
//                    airportWithRunways.setRunwaysAmount(Integer.toString(j+1));
//                    Runway runway = new Runway();
//                    runway.setId(runwayList.get(j).getId());
//                    runway.setAirport_ident(runwayList.get(j).getAirport_ident());
//
//                    runwayListAirport.add(runway);
//                }
//
//            }
//
//            airportWithRunways.setRunways(runwayListAirport);
//            airportRunwaysList.add(airportWithRunways);
//        }

//        airportRunwaysList.forEach(System.out::println);

        //Runways for each airport given a country code or country name.
        //Top 10 countries with highest number of airports.


}

