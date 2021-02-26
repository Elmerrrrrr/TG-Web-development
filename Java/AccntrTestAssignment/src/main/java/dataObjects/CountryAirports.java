package dataObjects;

import java.util.List;

public class CountryAirports {

    private String countryId;
    private String countryName;
    private List<Airport> topList;

    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public List<Airport> getTopList() {
        return topList;
    }

    public void setTopList(List<Airport> topList) {
        this.topList = topList;
    }



}
