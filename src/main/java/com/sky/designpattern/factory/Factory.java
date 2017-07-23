/*
  * @(#)Factory.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.factory;

/**
 * Factory.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public abstract class Factory {
	public Factory() {
		System.out.println("this factory generate toy : " + generateToy().name );
	}
	
	public abstract Toy generateToy();
}

