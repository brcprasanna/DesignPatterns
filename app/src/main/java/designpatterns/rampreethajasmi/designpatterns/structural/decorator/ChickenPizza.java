package designpatterns.rampreethajasmi.designpatterns.structural.decorator;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class ChickenPizza implements Pizza {
    @Override
    public String getDescription() {
        return "Chicken Food";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
