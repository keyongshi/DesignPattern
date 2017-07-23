/*
  * @(#)Developer.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.facade;

/**
 * Developer.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Developer {
	String str;
	
	public Developer(String str) {
		this.str = str;
	}
	
	public void talk() {
		System.out.println("I am a Developer, this is  " + str);
	}
}

