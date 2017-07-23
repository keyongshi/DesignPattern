/*
  * @(#)ChainTest.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.chain;


/**
 * ChainTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class ChainTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	    //开始工作之前将work以一种固定的方式组合到一起，可以将set放置到spring的xml来完成，这样就提供了灵活性
		Worker junior = new JuniorWorker();
		Worker senior = new SeniorWorker();
		Worker superworker = new SuperWorker();
		
		junior.setNextWorker(senior);
		senior.setNextWorker(superworker);
		
		junior.dealWork(900);
	}

}

