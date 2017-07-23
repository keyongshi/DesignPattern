/*
  * @(#)Designer.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.facade;

/**
 * Designer.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Designer {
	String str;
	
	public Designer(String str) {
		this.str = str;
	}
	
	public void talk() {
		System.out.println("I am a designer, this is  " + str);
	}
}

