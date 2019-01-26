package designpatterns.rampreethajasmi.designpatterns.behavioural.command.state;

/**
 * Created by rampreethajasmi on 2018-04-02.
 */

public class StopState implements State {
    @Override
    public void doAction(ContextObject context) {
        context.setState(new StopState());
    }
}
