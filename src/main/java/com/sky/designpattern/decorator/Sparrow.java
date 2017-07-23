/*
  * @(#)Sparrow.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.decorator;

/**
 * Sparrow.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Sparrow implements Bird {
	public final static int Distance = 100;
	
	public Sparrow() {
		
	}

	@Override
	public int fly() {
		return Distance;
	}

}

