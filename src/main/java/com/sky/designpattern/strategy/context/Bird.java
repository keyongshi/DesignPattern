package com.sky.designpattern.strategy.context;

import com.sky.designpattern.strategy.algorithm.Fly;
import com.sky.designpattern.strategy.algorithm.Flyable;
import com.sky.designpattern.strategy.algorithm.NoRun;
import com.sky.designpattern.strategy.algorithm.Runable;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class Bird extends Animal {
    public Bird() {
        setFlyable(new Fly());
        setRunable(new NoRun());
    }

    public Bird(String name) {
        setName(name);
        setFlyable(new Fly());
        setRunable(new NoRun());
    }
}
