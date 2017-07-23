/*
  * @(#)work.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.chain;

/**
 * work.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public interface Worker {
	public void dealWork(int n);
	public void setNextWorker(Worker worker);
}

