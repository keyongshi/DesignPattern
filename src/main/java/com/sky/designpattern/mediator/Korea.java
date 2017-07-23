/*
  * @(#)Korea.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.mediator;

/**
 * Korea.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class Korea implements Colleague {
	private Mediator mediator;
	@Override
	public void giveMessage() {
		mediator.deliverMsg(this, "this is korea, don't piss me up");
	}

	@Override
	public void getMessage(String message) {
		System.out.println("I am korea, I get message: " + message);
	}

	public Mediator getMediator() {
		return mediator;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

}

