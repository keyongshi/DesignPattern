package com.sky.designpattern.strategy.context;

import com.sky.designpattern.strategy.algorithm.Flyable;
import com.sky.designpattern.strategy.algorithm.NoFly;
import com.sky.designpattern.strategy.algorithm.Run;
import com.sky.designpattern.strategy.algorithm.Runable;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class Lion extends Animal {

    public Lion(String name) {
        this.setName(name);
        this.setFlyable(new NoFly());
        this.setRunable(new Run());
    }

    @Override
    public void run() {
        System.out.println("my name is " + getName());
        getRunable().run();
    }

    @Override
    public void fly() {
        System.out.println("my name is " + getName());
        getFlyable().fly();
    }
}
