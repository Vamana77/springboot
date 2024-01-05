package com.excelr.spring.ioc.demo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DemoInterImpl implements DemoInter {
	private String message;

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		System.err.println("From DemoInterImpl setMessage Method");
		this.message = message;
	}

	public DemoInterImpl() {
		System.err.println("From DemoInterImpl Cons");
	}

	@Override
	public String wish(String userName) {
		final String METHOD_NAME = "wish";
		// System.out.println("Method Invoked:" + METHOD_NAME + ":" + message);
		String outputMsg = null;
		Calendar calendar = Calendar.getInstance();
		int hour = calendar.get(Calendar.HOUR_OF_DAY);
		if (hour < 12) {
			outputMsg = "Good Morning";
		} else if (hour < 17) {
			outputMsg = "Good Afternoon";
		} else {
			outputMsg = "Good Night";
		}
		outputMsg = message + ":" + outputMsg + ":" + userName;
		// System.out.println("Response From The Method:" + METHOD_NAME + ":" +
		// outputMsg);
		return outputMsg;
	}

	@Override
	public String getDateTime() {
		final String METHOD_NAME = "getDateTime";
		// System.out.println("Method Invoked:" + METHOD_NAME + ":");
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
		String outputMsg = df.format(new Date());
		// System.out.println("Response From The Method:" + METHOD_NAME + ":" +
		// outputMsg);
		return outputMsg;
	}
}
