/*
  * @(#)FacadeTest.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.facade;

/**
 * FacadeTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class FacadeTest {
	public static void main(String[] args) {
		Facade f = new Facade("test");
		f.talk();
	}
	
}

