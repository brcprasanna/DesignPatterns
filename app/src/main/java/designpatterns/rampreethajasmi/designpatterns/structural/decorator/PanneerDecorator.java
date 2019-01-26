package designpatterns.rampreethajasmi.designpatterns.structural.decorator;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class PanneerDecorator extends PizzaDecorator {
    Pizza mPizza;
    public PanneerDecorator(Pizza pizza) {
        //super(mPizza);
        this.mPizza = pizza;
    }

    @Override
    public String getDescription() {
        return mPizza.getDescription() + "PannerDecorator";
    }

    @Override
    public double getCost() {
        return mPizza.getCost()+50;
    }
}
