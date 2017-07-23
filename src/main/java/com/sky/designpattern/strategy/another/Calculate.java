package com.sky.designpattern.strategy.another;
/*
  * @(#)Calculate.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

/**
 * Calculate.java
 *
 * @version
 * @date 2013-5-27
 */

public class Calculate {
	private  Strategy strategy;
	
	public Calculate(Strategy strtegy) {
		this.strategy = strtegy;
	}
	
	public int cal(int a) {
		return strategy.arrange(a);
	}
}

