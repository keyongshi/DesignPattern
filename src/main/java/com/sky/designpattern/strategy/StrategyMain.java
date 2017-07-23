package com.sky.designpattern.strategy;

import com.sky.designpattern.strategy.algorithm.Fly;
import com.sky.designpattern.strategy.algorithm.Flyable;
import com.sky.designpattern.strategy.context.Animal;
import com.sky.designpattern.strategy.context.Bird;
import com.sky.designpattern.strategy.context.Lion;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class StrategyMain {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.setName("bird");
        bird.run();
        bird.fly();

        Animal lion = new Lion("辛巴");
        lion.run();
        lion.fly();

        Animal animal = new Animal();
        animal.fly();
        animal.run();

        animal.setFlyable(new Fly());
        animal.fly();
    }
}
