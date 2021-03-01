package dataObjects;

import com.opencsv.bean.CsvBindByPosition;

public class Runway {

   @CsvBindByPosition(position = 0)
   private String id;

   @CsvBindByPosition(position = 1)
   private String airport_ref;

   @CsvBindByPosition(position = 2)
   private String airport_ident;

   @CsvBindByPosition(position = 3)
   private String length_ft;

   @CsvBindByPosition(position = 4)
   private String width_ft;

   @CsvBindByPosition(position = 5)
   private String surface;

   @CsvBindByPosition(position = 6)
   private String lighted;

   @CsvBindByPosition(position = 7)
   private String closed;

   @CsvBindByPosition(position = 8)
   private String le_ident;

   @CsvBindByPosition(position = 9)
   private String le_latitude_deg;

   @CsvBindByPosition(position = 10)
   private String le_longitude_deg;

   @CsvBindByPosition(position = 11)
   private String le_elevation_ft;

   @CsvBindByPosition(position = 12)
   private String le_heading_degT;

   @CsvBindByPosition(position = 13)
   private String le_displaced_threshold_ft;

   @CsvBindByPosition(position = 14)
   private String he_ident;

   @CsvBindByPosition(position = 15)
   private String he_latitude_deg;

   @CsvBindByPosition(position = 16)
   private String he_longitude_deg;

   @CsvBindByPosition(position = 17)
   private String he_elevation_ft;

   @CsvBindByPosition(position = 18)
   private String he_heading_degT;

   @CsvBindByPosition(position = 19)
   private String he_displaced_threshold_ft;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAirport_ref() {
        return airport_ref;
    }

    public void setAirport_ref(String airport_ref) {
        this.airport_ref = airport_ref;
    }

    public String getAirport_ident() {
        return airport_ident;
    }

    public void setAirport_ident(String airport_ident) {
        this.airport_ident = airport_ident;
    }

    @Override
    public String toString() {
        return "dataObjects.Runway{" +
//                "id='" + id + '\'' +
                ", airport_ref='" + airport_ref + '\'' +
                ", airport_ident='" + airport_ident + '\'' +
                '}';
    }
}
