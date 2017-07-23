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

public class SeniorWorker implements Worker {
	private Worker next;
	
	@Override
	public void dealWork(int n) {
		if(n < 100) {
			System.out.println("Senior worker deal it");
		} else {
			System.out.println("Senior worker can not deal it");
			next.dealWork(n);
		}
	}

	@Override
	public void setNextWorker(Worker worker) {
		this.next = worker;
	}

}

