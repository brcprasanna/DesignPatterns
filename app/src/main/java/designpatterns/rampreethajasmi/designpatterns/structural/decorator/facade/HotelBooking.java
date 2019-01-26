package designpatterns.rampreethajasmi.designpatterns.structural.decorator.facade;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class HotelBooking {
    private String name;
    private String fromDate;
    private String toDate;

    public HotelBooking(String name, String fromDate, String toDate) {
        this.name = name;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public boolean bookHotel() {
        if (name != null && fromDate != null && toDate != null) {
            //book cab through some
            return true;
        }
        else {
            return false;
        }
    }
}
