/*
  * @(#)StrategyA.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.strategy.another;


/**
 * StrategyA.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class StrategyA implements Strategy {

	@Override
	public int arrange(int a) {
		return a + 1;
	}

}

