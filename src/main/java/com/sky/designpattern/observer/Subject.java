/*
  * @(#)Subject.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.observer;


/**
 * Subject.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public interface Subject {
	
	public void addObserver(Observer observer);
	
	public void deleteObserver(Observer observer);
	
	public void notifyObservers();
}

