package designpatterns.rampreethajasmi.designpatterns.structural.decorator.facade;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class FlightBooking {

    private String name;
    private String fromFlightNo;
    private String toFlightNo;
    private String fromDate;
    private String toDate;


    public FlightBooking(String name, String fromFlightNo, String toFlightNo, String fromDate, String toDate) {
        this.name = name;
        this.fromFlightNo = fromFlightNo;
        this.toFlightNo = toFlightNo;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public boolean bookFlight() {
        if (name != null && fromFlightNo != null && toFlightNo != null && fromDate != null && toDate != null) {
            //book flight
            return true;
        }
        else {
            return  false;
        }
    }
}
