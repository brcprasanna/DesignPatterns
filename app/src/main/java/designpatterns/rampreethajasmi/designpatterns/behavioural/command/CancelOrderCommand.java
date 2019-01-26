package designpatterns.rampreethajasmi.designpatterns.behavioural.command;

import android.util.Log;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class CancelOrderCommand implements OrderCommand {

    Food food;

    public CancelOrderCommand(Food food) {
        this.food = food;
    }
    @Override
    public void execute() {
        food.cancelFood();
        Log.i("prasanna", "CancelOrderCommand is executed");
    }
}
