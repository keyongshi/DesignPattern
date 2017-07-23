/*
  * @(#)MediatorTest.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.mediator;

/**
 * MediatorTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class MediatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Korea korea = new Korea();
		SouthKorea southKorea = new SouthKorea();
		USA usa = new USA();
		China china = new China();
		korea.setMediator(china);
		southKorea.setMediator(china);
		usa.setMediator(china);
		china.resigterKorea(korea);
		china.resigterSouthKorea(southKorea);
		china.resigterUSA(usa);
		
//		korea.giveMessage();
//		southKorea.giveMessage();
		usa.giveMessage();
		
	}

}

