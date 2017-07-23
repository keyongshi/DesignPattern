/*
  * @(#)USA.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.mediator;

/**
 * USA.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class USA implements Colleague {
	private Mediator mediator;
	@Override
	public void giveMessage() {
		mediator.deliverMsg(this, "this is USA, every one stand up");
	}

	@Override
	public void getMessage(String message) {
		System.out.println("I am USA, I get message: " + message);
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}

