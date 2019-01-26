package designpatterns.rampreethajasmi.designpatterns.structural.decorator;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class CheeseDecorator extends PizzaDecorator {
    Pizza mPizza;
    CheeseDecorator(Pizza pizza) {
        //super(mPizza);
        mPizza = pizza;
    }

    @Override
    public String getDescription() {
        return mPizza.getDescription()+" with"+"Cheese";
    }

    @Override
    public double getCost() {
        return mPizza.getCost()+25;
    }
}
