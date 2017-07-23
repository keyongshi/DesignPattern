/*
  * @(#)StudentSet.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.iterator;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * StudentSet.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class StudentSet {
	private Set<Student> set = new TreeSet<Student>();
	
	public void add(Student stu) {
		set.add(stu);
	}
	
	public void printStudentByScore() {
		Iterator<Student> it = set.iterator();
		while(it.hasNext()) {
			Student stu = it.next();
			System.out.println("id: " + stu.getId() + ", name: " + stu.getName() + ", score: " + stu.getScore());
		}
	}
}

