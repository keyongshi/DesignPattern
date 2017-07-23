package com.sky.designpattern.strategy.algorithm;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class Fly implements Flyable {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
