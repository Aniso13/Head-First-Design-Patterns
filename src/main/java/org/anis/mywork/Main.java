package org.anis.mywork;

import org.anis.mywork.Strategy.Duck;
import org.anis.mywork.Strategy.FlyRocketPowered;
import org.anis.mywork.Strategy.MallardDuck;
import org.anis.mywork.Strategy.ModelDuck;

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