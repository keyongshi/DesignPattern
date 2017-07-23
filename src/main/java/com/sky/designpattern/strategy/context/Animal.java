package com.sky.designpattern.strategy.context;

import com.sky.designpattern.strategy.algorithm.Fly;
import com.sky.designpattern.strategy.algorithm.Flyable;
import com.sky.designpattern.strategy.algorithm.NoFly;
import com.sky.designpattern.strategy.algorithm.NoRun;
import com.sky.designpattern.strategy.algorithm.Runable;
import com.sky.designpattern.strategy.context.Live;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class Animal implements Live {
    private Flyable flyable = new NoFly();
    private Runable runable = new NoRun();
    private String name = "animal";

    public Flyable getFlyable() {
        return flyable;
    }

    public void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    public Runable getRunable() {
        return runable;
    }

    public void setRunable(Runable runable) {
        this.runable = runable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("my name is " + getName());
        runable.run();
    }

    @Override
    public void fly() {
        System.out.println("my name is " + getName());
        flyable.fly();
    }
}
