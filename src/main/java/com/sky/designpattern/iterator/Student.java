/*
  * @(#)Student.java    2013-5-29
  *
  * Copyright (c) 2016 sky.com, Inc. All rights reserved.
  */

package com.sky.designpattern.iterator;

/**
 * Student.java
 *
 * @author KeyongShi
 * @version 
 * @date 2013-5-29
 */

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private int score;
	
	public Student() {
		
	}
	
	public Student(int id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.getScore();
	}
}

