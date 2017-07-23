/*
  * @(#)ConcreteCommand.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.command;

/**
 * ConcreteCommand.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class ConcreteCommand implements Command {
	private Army army;
	
	public ConcreteCommand(Army army) {
		this.army = army;
	}

	@Override
	public void march() {
		army.march();
	}

}

