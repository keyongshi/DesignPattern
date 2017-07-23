/*
  * @(#)Facade.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.facade;

/**
 * Facade.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Facade {
	private Designer de;
	private Developer deve;
	
	public Facade (String str) {
		de = new Designer(str);
		deve = new Developer(str);
	}
	
	public void talk() {
		de.talk();
		deve.talk();
	}
}

