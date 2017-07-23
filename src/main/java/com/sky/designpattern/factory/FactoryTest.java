/*
  * @(#)FactoryTest.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.factory;

/**
 * FactoryTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class FactoryTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BabyToy babyToy = new BabyToy();
		GirlToy girlToy = new GirlToy();
		
		BabyToyFactory vtf = new BabyToyFactory();
	}

}

