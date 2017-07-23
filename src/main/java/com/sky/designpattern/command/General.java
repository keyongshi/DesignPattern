/*
  * @(#)General.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.command;

/**
 * General.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class General {
	private Command command;
	
	public General (Command command) {
		this.command = command;
	}
	
	public void startExecuteCommand() {
		this.command.march();
	}
}

