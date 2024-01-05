package com.excelr.ioc.demo1;

import java.io.Serializable;

public class Course implements Serializable {
	{
		System.out.println("From course instance block");
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String courseId;
	private String courseName;
	private String courseType;
	private int courseDuration;
	private double courseCost;

	/**
	 * @return the courseId
	 */
	public String getCourseId() {
		return courseId;
	}

	/**
	 * @param courseId
	 *            the courseId to set
	 */
	public void setCourseId(String courseId) {
		System.out.println(courseId);
		this.courseId = courseId;
	}

	/**
	 * @return the courseName
	 */
	public String getCourseName() {
		return courseName;
	}

	/**
	 * @param courseName
	 *            the courseName to set
	 */
	public void setCourseName(String courseName) {
		System.out.println(courseName);
		this.courseName = courseName;
	}

	/**
	 * @return the courseType
	 */
	public String getCourseType() {
		return courseType;
	}

	/**
	 * @param courseType
	 *            the courseType to set
	 */
	public void setCourseType(String courseType) {
		System.out.println(courseType);
		this.courseType = courseType;
	}

	/**
	 * @return the courseDuration
	 */
	public int getCourseDuration() {
		return courseDuration;
	}

	/**
	 * @param courseDuration
	 *            the courseDuration to set
	 */
	public void setCourseDuration(int courseDuration) {
		System.out.println(courseDuration);
		this.courseDuration = courseDuration;
	}

	/**
	 * @return the courseCost
	 */
	public double getCourseCost() {
		return courseCost;
	}

	/**
	 * @param courseCost
	 *            the courseCost to set
	 */
	public void setCourseCost(double courseCost) {
		System.out.println(courseCost);
		this.courseCost = courseCost;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseType=" + courseType
				+ ", courseDuration=" + courseDuration + ", courseCost=" + courseCost + "]";
	}

	public String courseDetails() {
		return this.toString();
	}
}
