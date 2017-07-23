/*
  * @(#)DecoratorTest.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.decorator;

/**
 * DecoratorTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class DecoratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //装饰模式使用被装饰类的一个子类的实例，把客户端的调用委派到被装饰类，装饰模式的关键在于这种扩展是完全透明的。
	    //
		Bird bird1 = new Sparrow();
		Bird bird2 = new SparrowDecorate(bird1, 20);
		System.out.println("bird1 fly " + bird2.fly());
	}

}

