package designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer;

import android.util.Log;

/**
 * Created by rampreethajasmi on 2018-04-01.
 */

public class PaymentObserver implements OrderObserver {
    PizzaSubject subject;
    @Override
    public void onUpdateReceived() {
        Log.i("prasanna", "Payment observer update recieved for "+subject.getName());
    }

    @Override
    public void setSubjectState(PizzaSubject subject) {
        this.subject = subject;
    }
}
