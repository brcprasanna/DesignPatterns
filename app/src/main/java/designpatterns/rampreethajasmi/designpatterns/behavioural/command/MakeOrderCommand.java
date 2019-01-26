package designpatterns.rampreethajasmi.designpatterns.behavioural.command;

import android.util.Log;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class MakeOrderCommand implements OrderCommand {

    Food food;
    public MakeOrderCommand(Food food) {
        this.food = food;
    }
    @Override
    public void execute() {
        food.makeFood();
        Log.i("prasanna", "MakeOrderCommand is executed");
    }
}
