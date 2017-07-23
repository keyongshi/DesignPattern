/*
  * @(#)BabyToy.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.factory;

/**
 * BabyToy.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class BabyToy extends Toy {
	
	public BabyToy() {
		name = "BabyToy";
	}
	
	@Override
	public void play() {
		System.out.println("Baby like this toy!");
	}

}

