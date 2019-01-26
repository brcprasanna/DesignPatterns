package designpatterns.rampreethajasmi.designpatterns.behavioural.command.strategy;

/**
 * Created by rampreethajasmi on 2018-04-02.
 */

public class StrategyDivision implements Strategy{
    @Override
    public double doExecute(int num1, int num2) {
        return num1 / num2;
    }
}
