/*
  * @(#)Mediator.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.mediator;

/**
 * Mediator.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public interface Mediator {
	public void deliverMsg(Colleague coll, String mess);
}

