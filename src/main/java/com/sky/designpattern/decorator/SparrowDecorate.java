/*
  * @(#)SparrowDecorate.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.decorator;

/**
 * SparrowDecorate.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class SparrowDecorate extends Decorator {
	private int dis;
	
	public SparrowDecorate(Bird bird, int dis) {
		super(bird);
		this.dis = dis;
	}
	
	@Override
	public int fly() {
		return super.fly() + dis;
	}
}	

