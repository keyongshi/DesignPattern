/*
  * @(#)GirlToy.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.factory;

/**
 * GirlToy.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class GirlToy extends Toy {

	public GirlToy() {
		name = "GirlToy";
	}
	@Override
	public void play() {
		System.out.println("Girl like this toy");
	}

}

