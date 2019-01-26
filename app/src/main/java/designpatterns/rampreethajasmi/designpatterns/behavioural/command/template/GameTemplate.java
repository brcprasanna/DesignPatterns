package designpatterns.rampreethajasmi.designpatterns.behavioural.command.template;

/**
 * Created by rampreethajasmi on 2018-04-02.
 */

public abstract class GameTemplate {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    public final void play() {
        initialize();
        startPlay();
        endPlay();
    }

}
