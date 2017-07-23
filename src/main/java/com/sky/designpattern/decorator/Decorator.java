/*
  * @(#)Decorator.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.decorator;

/**
 * Decorator.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Decorator implements Bird{
	private Bird bird;
	
	public Decorator(Bird bird) {
		this.bird = bird;
	}
	
	public int fly() {
		return bird.fly();
	}
}

