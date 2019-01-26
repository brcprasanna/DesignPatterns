package designpatterns.rampreethajasmi.designpatterns.behavioural.command.state;

/**
 * Created by rampreethajasmi on 2018-04-02.
 */

public class ContextObject {
    State state;
    public ContextObject() {
        state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
