/*
  * @(#)StrategyTest.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.strategy.another;

/**
 * StrategyTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class StrategyTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Strategy s1 = new StrategyA();
		Strategy s2 = new StrategyB();
		
		Calculate c = new Calculate(s1);
		System.out.println(c.cal(10));
		
		c = new Calculate(s2);
		System.out.println(c.cal(10));
	}

}

