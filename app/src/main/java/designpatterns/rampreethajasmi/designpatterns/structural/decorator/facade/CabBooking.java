package designpatterns.rampreethajasmi.designpatterns.structural.decorator.facade;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class CabBooking {

    private String name;
    private String cabTime;

    public CabBooking(String name, String cabTime) {
        this.name = name;
        this.cabTime = cabTime;
    }

    public boolean bookCab() {
        if (name != null && cabTime != null) {
            //book cab through some
            return true;
        }

        else
            return false;
    }
}
