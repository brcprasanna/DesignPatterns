package designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer;

import android.util.Log;

/**
 * Created by rampreethajasmi on 2018-04-01.
 */

public class OrderDispatchObserver implements OrderObserver{
    PizzaSubject subject;
    @Override
    public void onUpdateReceived() {
        Log.i("prasanna", "Order dispacth Update Recevied for "+subject.getName());
    }

    @Override
    public void setSubjectState(PizzaSubject subject) {
        this.subject = subject;
    }
}
