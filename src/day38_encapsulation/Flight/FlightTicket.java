package day38_encapsulation.Flight;

public class FlightTicket {
    /*
    declare these instance variables :
    type (first , Business, economy)
    departure location/airport
    arrival  location/airport
    encapsulate all of them
    create constructor to set up the object
    NOTE : type should only be first, business, economy
     */


    private String type;
    private String departureLocation;
    private String arrivalLocation;

    public FlightTicket(String type, String departureLocation, String arrivalLocation) {
        setType(type);
        this.departureLocation = departureLocation;
        this.arrivalLocation = arrivalLocation;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(type.equalsIgnoreCase("first") || type.equalsIgnoreCase("business") || type.equalsIgnoreCase("economy")){
            this.type = type;
        }
    }

    public String getDepartureLocation() {
        return departureLocation;
    }

    public void setDepartureLocation(String departureLocation) {
        this.departureLocation = departureLocation;
    }

    public String getArrivalLocation() {
        return arrivalLocation;
    }

    public void setArrivalLocation(String arrivalLocation) {
        this.arrivalLocation = arrivalLocation;
    }
}

