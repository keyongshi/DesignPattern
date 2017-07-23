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

public class JuniorWorker implements Worker {
	private Worker next;

	@Override
	public void dealWork(int n) {
		if(n < 10) {
			System.out.println("Junior worker deal it");
		} else {
			System.out.println("Junior worker can not deal it");
			next.dealWork(n);
		}
	}

	@Override
	public void setNextWorker(Worker worker) {
		this.next = worker;
	}

}

