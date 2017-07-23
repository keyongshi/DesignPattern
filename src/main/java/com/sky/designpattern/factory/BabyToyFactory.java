/*
  * @(#)BabyToyFactory.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.factory;

/**
 * BabyToyFactory.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class BabyToyFactory extends Factory {

	@Override
	public Toy generateToy() {
		return new BabyToy(); 
	}
	
}

