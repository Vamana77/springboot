package com.excelr.ioc.demo1;

import java.io.Serializable;

public class Trainee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int traineeId;
	private String traineeName;
	private String traineePwd;
	private long contactNumber;
	private Course course; // Dependency
	{
		System.out.println("Trainee instance block");
	}

	/**
	 * @return the course
	 */
	public Course getCourse() {
		return course;
	}

	/**
	 * @param course
	 *            the course to set
	 */
	public void setCourse(Course course) {
		System.err.println("set Course Method:" + course.hashCode());
		this.course = course;
	}

	/**
	 * @param traineeId
	 * @param traineeName
	 * @param traineePwd
	 * @param contactNumber
	 */
	public Trainee(int traineeId, String traineeName, String traineePwd, long contactNumber) {
		System.out.println("Trainee Cons");
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.traineePwd = traineePwd;
		this.contactNumber = contactNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", traineePwd=" + traineePwd
				+ ", contactNumber=" + contactNumber + ", course=" + course + "]";
	}

	public String displayEmpDetails() {
		return this.toString();
	}
}
