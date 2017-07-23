/*
  * @(#)Army.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.command;

/**
 * Army.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Army {
	private String name;
	
	public Army (String name) {
		this.name = name;
	}
	
	public void march() {
		System.out.println(name + " is marching!");
	}
}

