package designpatterns.rampreethajasmi.designpatterns.structural.decorator;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class VegPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Veg Food";
    }

    @Override
    public double getCost() {
        return 100;
    }
}
