package designpatterns.rampreethajasmi.designpatterns;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import designpatterns.rampreethajasmi.designpatterns.behavioural.command.Food;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.MakeOrderCommand;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.WaiterInvoker;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer.OrderDispatchObserver;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer.OrderObserver;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer.PaymentObserver;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.observer.PizzaSubject;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.state.ContextObject;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.state.StartState;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.state.StopState;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.strategy.ContextStrategyObject;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.strategy.StrategyAdd;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.template.Cricket;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.template.Football;
import designpatterns.rampreethajasmi.designpatterns.behavioural.command.template.GameTemplate;
import designpatterns.rampreethajasmi.designpatterns.creational.builder.Student;
import designpatterns.rampreethajasmi.designpatterns.structural.decorator.CheeseDecorator;
import designpatterns.rampreethajasmi.designpatterns.structural.decorator.PanneerDecorator;
import designpatterns.rampreethajasmi.designpatterns.structural.decorator.Pizza;
import designpatterns.rampreethajasmi.designpatterns.structural.decorator.PizzaDecorator;
import designpatterns.rampreethajasmi.designpatterns.structural.decorator.VegPizza;
import designpatterns.rampreethajasmi.designpatterns.structural.decorator.facade.TourPackage;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        testTemplate();

    }

    private void testTemplate() {
        GameTemplate gameTemplate = new Cricket();
        gameTemplate.play();

        GameTemplate gameTemplate1 = new Football();
        gameTemplate1.play();

    }

    private void testStrategy() {
        ContextStrategyObject
                contextObject = new ContextStrategyObject(new StrategyAdd());
        double result = contextObject.executeStrategy(5,10);
    }

    private void testState() {
        ContextObject contextObject = new ContextObject();
        StartState startState = new StartState();
        startState.doAction(contextObject);
        contextObject.getState();

        StopState stopState = new StopState();
        stopState.doAction(contextObject);
        contextObject.getState();




    }

    private void testObserver() {
        PizzaSubject subject = new PizzaSubject("veg pizza");
        OrderObserver observer = new PaymentObserver();
        subject.register(observer);

        observer = new OrderDispatchObserver();
        subject.register(observer);

        subject.placeOrder();
    }

    /**
     *
     There're couple of benefits of Command pattern that I've experienced. But first of all, I would like to remind that as all other patterns this pattern is also to increase code readability and bring some common understanding to your (probably) shared code base.

     I use this pattern to transition from a method-oriented interface to a command-oriented interface. That means, I'm encapsulating method calls into concrete commands along with necessary data. It makes the code more readable yes but more importantly I can treat methods as objects which lets you easily add/remove/modify commands without increasing the complexity of the code. So it makes it easy to manage as well easy to read.

     Secondly, since you've your methods as objects, you can store/queue them to execute them later. Or to cancel them even after you've executed them. This is where this pattern helps you to implement "Undo".

     Finally, command pattern also used to decouple command execution and commands themselves. It's like a waiter doesn't know about how to cook the orders that he received. He doesn't care. He doesn't have to know. If he'd know that, he'd be working as a cook as well. And if the restaurant owner wants to fire the waiter, he/she ends up with having no cook as well. Of course this definition is not special or related to command pattern only. That's explains why we need decoupling or dependency management in general.
     */

    private void testCommand() {
        Food food = new Food("idly", 5);
        MakeOrderCommand makeOrderCommand =  new MakeOrderCommand(food);

        Food food1 = new Food("dosa", 2);
        MakeOrderCommand makeOrderCommand1 =  new MakeOrderCommand(food1);



        WaiterInvoker waiterInvoker = new WaiterInvoker();
        waiterInvoker.takeOrder(makeOrderCommand);
        waiterInvoker.takeOrder(makeOrderCommand1);

        waiterInvoker.placeOrder();


    }

    private void testFacade() {
        new TourPackage("prasanna", "DD123", "DD143", "121212", "131313", "121212", "131313", "121212", "131313").bookPackage();
    }

    public void testBuilder() {
        Student.StudentBuilder builder = new Student.StudentBuilder("prasanna","105", 2001);
        builder.setIsDayScholar(true);

        Student user = builder.build();

        Log.i("Student : ",user.toString());
    }

    //onion decorator
    public void testDecorator() {
        Pizza pizza = new VegPizza();
        pizza = new PanneerDecorator(pizza);
        pizza.getDescription();
        pizza.getCost();

        Log.i("Food cost", pizza.getCost()+"");

        PizzaDecorator pizzaDecorator = new PanneerDecorator(new VegPizza());
        pizzaDecorator.getCost();
        pizzaDecorator.getDescription();
    }
}
