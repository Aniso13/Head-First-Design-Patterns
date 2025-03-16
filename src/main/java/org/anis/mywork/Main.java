package org.anis.mywork;

import org.anis.mywork.strategy.Duck;
import org.anis.mywork.strategy.FlyRocketPowered;
import org.anis.mywork.strategy.MallardDuck;
import org.anis.mywork.strategy.ModelDuck;

/*
* The Strategy Pattern defines a family of algorithms,
* encapsulates each one, and makes them interchangeable.
* Strategy lets the algorithm vary independently from clients that use it.
* */
public class Main {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}