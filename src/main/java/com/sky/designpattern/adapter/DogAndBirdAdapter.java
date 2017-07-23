/*
  * @(#)DogAndBirdAdapter.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.adapter;

/**
 * DogAndBirdAdapter.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class DogAndBirdAdapter implements Bird, Dog{
	private Bird bird;
	private Dog dog;
	
	public DogAndBirdAdapter(Bird bird, Dog dog) {
		this.bird = bird;
		this.dog = dog;
	}

	@Override
	public String getHi() {
		if (this instanceof Dog) {
			return dog.getHi();
		}
		if(this instanceof Bird) {
			return bird.getHi();
		}
		return "";
	}
	
}

