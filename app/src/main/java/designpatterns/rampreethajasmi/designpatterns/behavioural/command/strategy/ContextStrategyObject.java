package designpatterns.rampreethajasmi.designpatterns.behavioural.command.strategy;

/**
 * Created by rampreethajasmi on 2018-04-02.
 */

public class ContextStrategyObject {

    private Strategy strategy;

    public ContextStrategyObject(Strategy strategy) {
        this.strategy = strategy;
    }

    public double executeStrategy(int num1, int num2) {
        return strategy.doExecute(num1, num2);
    }
}
