/*
  * @(#)JuniorWorker.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.chain;

/**
 * JuniorWorker.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class SuperWorker implements Worker {
	private Worker next;
	
	@Override
	public void dealWork(int n) {
		System.out.println("Super worker deal it");
	}

	@Override
	public void setNextWorker(Worker worker) {
		this.next = worker;
	}

}

