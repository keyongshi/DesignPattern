package com.sky.designpattern.strategy.algorithm;

/**
 * @author KeyongShi
 * @version 1.0
 * @since 2017/7/23.
 */
public class NoRun implements Runable {
    @Override
    public void run() {
        System.out.println("Can't run ....");
    }
}
