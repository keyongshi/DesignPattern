/*
  * @(#)BirdDogAnimal.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.adapter;

/**
 * BirdDogAnimal.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class DogAdapter implements Bird{
	
	Dog dog;
	
	public DogAdapter(Dog dog) {
		this.dog = dog;
	}

	@Override
	public String getHi() {
		return dog.getHi();
	}

}

