package designpatterns.rampreethajasmi.designpatterns.behavioural.command;

import android.util.Log;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class Food {

    private String name;
    private int quantity;

    public Food(String name, int count) {
        this.name = name;
        this.quantity = count;
    }

    public void makeFood() {
        Log.i("prasanna", "makeFood");
    }

    public void cancelFood() {
        Log.i("prasanna", "cancelFood");
    }


}
