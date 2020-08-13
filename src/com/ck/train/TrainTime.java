package com.ck.train;

public class TrainTime {
	Integer time;
	Boolean isArrival;

	public TrainTime(Integer time, Boolean isArrival) {
		super();
		this.time = time;
		this.isArrival = isArrival;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public boolean isArrival() {
		return isArrival;
	}

	public void setArrival(boolean isArrival) {
		this.isArrival = isArrival;
	}

	@Override
	public String toString() {
		return "\n" + "TrainTime [time=" + time + ", isArrival=" + isArrival + "]";
	}
}
