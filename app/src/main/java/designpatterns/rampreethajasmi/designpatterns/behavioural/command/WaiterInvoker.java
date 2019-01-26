package designpatterns.rampreethajasmi.designpatterns.behavioural.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rampreethajasmi on 2018-03-31.
 */

public class WaiterInvoker {

    List<OrderCommand> listOfFood = new ArrayList<>();

    public void takeOrder(OrderCommand orderCommand) {
        listOfFood.add(orderCommand);
    }

    public void placeOrder() {
        for (OrderCommand orderCommand : listOfFood) {
            orderCommand.execute();
        }
    }
}
