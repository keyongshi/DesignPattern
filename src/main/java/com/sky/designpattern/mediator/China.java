/*
  * @(#)China.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.mediator;


/**
 * China.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class China implements Mediator {
	Korea korea;
	SouthKorea southKorea;
	USA usa;

	public void resigterKorea(Korea korea) {
		this.korea = korea;
	}
	
	public void resigterSouthKorea(SouthKorea southKorea) {
		this.southKorea = southKorea;
	}
	
	public void resigterUSA(USA usa) {
		this.usa = usa;
	}
	@Override
	public void deliverMsg(Colleague coll, String mess) {
		if(coll instanceof Korea) {
			southKorea.getMessage(mess);
			usa.getMessage(mess);
		}
		if(coll instanceof SouthKorea) {
			korea.getMessage(mess);
			usa.getMessage(mess);
		}
		if(coll instanceof USA) {
			southKorea.getMessage(mess);
			korea.getMessage(mess);
		}
	}

}

