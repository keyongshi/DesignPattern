/*
  * @(#)IteratorTest.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.iterator;

/**
 * IteratorTest.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class IteratorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StudentSet set = new StudentSet();
		Student stu1 = new Student(1, "tom", 70);
		set.add(stu1);
		Student stu2 = new Student(2, "jack", 80);
		set.add(stu2);
		Student stu3 = new Student(3, "amy", 60);
		set.add(stu3);
		Student stu4 = new Student(4, "lily", 75);
		set.add(stu4);
		set.printStudentByScore();
	}

}

