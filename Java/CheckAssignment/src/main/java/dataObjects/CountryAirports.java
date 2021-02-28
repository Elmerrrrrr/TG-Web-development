package dataObjects;

import java.util.List;

public class CountryAirports implements Comparable <CountryAirports>{

    private String countryCode;
    private String countryName;
    private Integer airportCount;
    private List<Airport> topList;

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }



    public Integer getAirportCount() {
        return airportCount;
    }

    public void setAirportCount(Integer airportCount) {
        this.airportCount = airportCount;
    }

    // Sort on airport count
    @Override
    public int compareTo(CountryAirports o) {
        return this.getAirportCount().compareTo(o.getAirportCount());
    }



    public List<Airport> getTopList() {
        return topList;
    }

    public void setTopList(List<Airport> topList) {
        this.topList = topList;
    }


    @Override
    public String toString() {
        return "CountryAirports{" +
                "countryId='" + countryCode + '\'' +
                ", countryName='" + countryName + '\'' +
                ", airportCount='" + airportCount + '\'' +
//                ", topList=" + topList +
                '}';
    }





}
