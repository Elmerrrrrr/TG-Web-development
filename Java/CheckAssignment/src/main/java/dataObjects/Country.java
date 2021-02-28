package dataObjects;

import com.opencsv.bean.CsvBindByPosition;

public class Country {

    @CsvBindByPosition(position = 0)
    private String countryId;

    @CsvBindByPosition(position = 1)
    private String countryCode;

    @CsvBindByPosition(position = 2)
    private String name;

    @CsvBindByPosition(position = 3)
    private String continent;

    @CsvBindByPosition(position = 4)
    private String wikipedia_link;

    @CsvBindByPosition(position = 5)
    private String keywords;


    public String getCountryId() {
        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





    @Override
    public String toString() {
        return "Country{" +
                "countryId='" + countryId + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
