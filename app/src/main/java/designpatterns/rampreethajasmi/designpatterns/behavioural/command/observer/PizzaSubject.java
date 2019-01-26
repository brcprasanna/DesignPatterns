package designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rampreethajasmi on 2018-04-01.
 */

public class PizzaSubject {
    private String name;
    List<OrderObserver> orderObserverList = new ArrayList<>();

    public PizzaSubject(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void placeOrder() {
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (OrderObserver orderObserver : orderObserverList) {
            orderObserver.onUpdateReceived();
        }
    }

    public void register(OrderObserver observer) {
        orderObserverList.add(observer);
        observer.setSubjectState(this);
    }

    public void unRegister(OrderObserver observer) {
        orderObserverList.remove(observer);
    }
}
