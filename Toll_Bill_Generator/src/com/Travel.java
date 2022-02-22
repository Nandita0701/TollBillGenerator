package com;

import java.io.Serializable;
import java.util.Date;

public class Travel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date StartDate;
	private String from;
	private String to;
	public Date getStartDate() {
		return StartDate;
	}

	public void setStartDate(Date startDate) {
		StartDate = startDate;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

}
