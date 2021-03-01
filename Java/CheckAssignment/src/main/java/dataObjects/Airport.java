package dataObjects;

import com.opencsv.bean.CsvBindByPosition;

public class Airport {



   @CsvBindByPosition(position = 0)
   private String id;

   @CsvBindByPosition(position = 1)
   private String ident;

   @CsvBindByPosition(position = 2)
   private String type;

   @CsvBindByPosition(position = 3)
   private String name;

   @CsvBindByPosition(position = 4)
   private String latitude_deg;

   @CsvBindByPosition(position = 5)
   private String longitude_deg;

   @CsvBindByPosition(position = 6)
   private String elevation_ft;

   @CsvBindByPosition(position = 7)
   private String continent;

   @CsvBindByPosition(position = 8)
   private String iso_country;

   @CsvBindByPosition(position = 9)
   private String iso_region;

   @CsvBindByPosition(position = 10)
   private String municipality;

   @CsvBindByPosition(position = 11)
   private String scheduled_service;

   @CsvBindByPosition(position = 12)
   private String gps_code;

   @CsvBindByPosition(position = 13)
   private String iata_code;

   @CsvBindByPosition(position = 14)
   private String local_code;

   @CsvBindByPosition(position = 15)
   private String home_link;

   @CsvBindByPosition(position = 16)
   private String wikipedia_link;

   @CsvBindByPosition(position = 17)
   private String keywords;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdent() {
        return ident;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIso_country() {
        return iso_country;
    }

    public void setIso_country(String iso_country) {
        this.iso_country = iso_country;
    }

    @Override
    public String toString() {
        return "dataObjects.Airport{" +
//                "id='" + id + '\'' +
//                ", ident='" + ident + '\'' +
                ", name='" + name + '\'' +
                ", iso_country='" + iso_country + '\'' +
                '}';
    }
}
