/*
  * @(#)ObserverTest.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.observer;

/**
 * ObserverTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class ObserverTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Observer tom = new Parents("Tom");
		Observer amy = new Parents("amy");
		
		Subject baby = new Baby();
		baby.addObserver(amy);
		baby.addObserver(tom);
		baby.notifyObservers();
		
		//tom go to work
		baby.deleteObserver(tom);
		baby.notifyObservers();
	}

}

