/*
  * @(#)Parents.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.observer;

/**
 * Parents.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Parents implements Observer {
	private String name;

	public Parents (String name) {
		this.name = name;
	}
	@Override
	public void hearMessage() {
		System.out.println(name + " get message");
	}
}

