package designpatterns.rampreethajasmi.designpatterns.structural.decorator.facade;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class TourPackage {

    private String name;
    private String fromFlightNo;
    private String toFlightNo;
    private String fromFlightDateTime;
    private String fromCabDateTime;
    private String fromHotelDateTime;
    private String toFlightDateTime;
    private String toCabDateTime;
    private String toHotelDateTime;

    public TourPackage(String name, String fromFlightNo, String toFlightNo, String fromFlightDateTime, String fromCabDateTime,
                            String fromHotelDateTime, String toFlightDateTime, String toCabDateTime, String toHotelDateTime ) {

        this.name = name;
        this.fromFlightNo = fromFlightNo;
        this.toFlightNo = toFlightNo;
        this.fromFlightDateTime = fromFlightDateTime;
        this.fromCabDateTime = fromCabDateTime;
        this.fromHotelDateTime = fromHotelDateTime;
        this.toFlightDateTime = toFlightDateTime;
        this.toCabDateTime = toCabDateTime;
        this.toHotelDateTime = toHotelDateTime;
    }

    public boolean bookPackage() {
        if (new FlightBooking(name, fromFlightNo, toFlightNo, fromFlightDateTime, toFlightDateTime).bookFlight()) {
            if (new HotelBooking(name, fromHotelDateTime, toHotelDateTime).bookHotel()) {
                if (new CabBooking(name, fromCabDateTime).bookCab()) {
                    if (new CabBooking(name, toCabDateTime).bookCab()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
