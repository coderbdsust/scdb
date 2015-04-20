package com.coderbd.scdb.web.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "event_details")
public class EventDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4983614943766619554L;

	@Id
	@GeneratedValue
	@Column(name = "event_id")
	private int eventId;

	@Column(name = "event_title")
	private String eventTitle;

	@Column(name = "event_start_time")
	private Date eventStartTime;

	@Column(name = "event_end_time")
	private Date eventEndTime;

	@Column(name = "event_team_size")
	private int eventTeamSize=0;

	@Column(name = "reg_need")
	private boolean regNeed=false;;

	public EventDetail() {
	}

	public EventDetail(int eventId, String eventTitle, Date eventStartTime,
			Date eventEndTime, int eventTeamSize, boolean regNeed) {

		this.eventId = eventId;
		this.eventTitle = eventTitle;
		this.eventStartTime = eventStartTime;
		this.eventEndTime = eventEndTime;
		this.eventTeamSize = eventTeamSize;
		this.regNeed = regNeed;
	}

	public EventDetail(String eventTitle, Date eventStartTime,
			Date eventEndTime, int eventTeamSize, boolean regNeed) {
		
		this.eventTitle = eventTitle;
		this.eventStartTime = eventStartTime;
		this.eventEndTime = eventEndTime;
		this.eventTeamSize = eventTeamSize;
		this.regNeed = regNeed;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public Date getEventStartTime() {
		return eventStartTime;
	}

	public void setEventStartTime(Date eventStartTime) {
		this.eventStartTime = eventStartTime;
	}

	public Date getEventEndTime() {
		return eventEndTime;
	}

	public void setEventEndTime(Date eventEndTime) {
		this.eventEndTime = eventEndTime;
	}

	public int getEventTeamSize() {
		return eventTeamSize;
	}

	public void setEventTeamSize(int eventTeamSize) {
		this.eventTeamSize = eventTeamSize;
	}

	public boolean isRegNeed() {
		return regNeed;
	}

	public void setRegNeed(boolean regNeed) {
		this.regNeed = regNeed;
	}

	@Override
	public String toString() {
		return "EventDetail [eventId=" + eventId + ", eventTitle=" + eventTitle
				+ ", eventStartTime=" + eventStartTime + ", eventEndTime="
				+ eventEndTime + ", eventTeamSize=" + eventTeamSize
				+ ", regNeed=" + regNeed + "]";
	}
	
	

}
