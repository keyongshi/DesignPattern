/*
  * @(#)Baby.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;

/**
 * Baby.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class Baby implements Subject {
	List<Observer> observerList = new ArrayList<Observer>();
	
	@Override
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		if (CollectionUtils.isNotEmpty(observerList)) {
			for (Observer observer : observerList) {
				observer.hearMessage();
			}
		}
	}

}

