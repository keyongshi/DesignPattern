/*
  * @(#)AdapterTest.java    2013-5-27
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.adapter;

/**
 * AdapterTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-27
 */

public class AdapterTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//	    singleAdatper();
		doubleAdatper();
	}
	
	public static void singleAdatper() {
		Dog dog = new MyDog();
		
		Bird bird = new DogAdapter(dog);
		System.out.println(bird.getHi());
	}

	public static void doubleAdatper() {
		Dog dog = new MyDog();
		Bird bird = new Sparrow();
		
		Dog testDog = new DogAndBirdAdapter(bird, dog);
		System.out.println(testDog.getHi());
		
		Bird testBird = new DogAndBirdAdapter(bird, dog);
		System.out.println(testBird.getHi());
	}
}

