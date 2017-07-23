/*
  * @(#)CommandTest.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.command;

/**
 * CommandTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class CommandTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Army team1 = new Army("team1");
//		Army team2 = new Army("team2");
		
		Command command = new ConcreteCommand(team1);
		
		General general = new General(command);
		general.startExecuteCommand();

	}

}

