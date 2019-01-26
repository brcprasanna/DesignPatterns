package designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer;

/**
 * Created by rampreethajasmi on 2018-04-01.
 */

public interface OrderObserver {
    void onUpdateReceived();
    void setSubjectState(PizzaSubject pizza);
}
