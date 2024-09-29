package com.inheritance.businessoperations.controller;

public class Company {

	String type;

	long adhar;
	String pan;
	int funds;
	boolean status;

	public Company() {

		System.out.println("Default constructor is running");
	}

	@Override
	public String toString() {
		return "Company [type=" + type + ", adhar=" + adhar + ", pan=" + pan + ", funds=" + funds + ", status=" + status
				+ "]";
	}

	public Company(String type, long adhar, String pan, int funds) {
		super();
		this.type = type;
		this.adhar = adhar;
		this.pan = pan;
		this.funds = funds;
		this.status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getAdhar() {
		return adhar;
	}

	public void setAdhar(long adhar) {
		this.adhar = adhar;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public int getFunds() {
		return funds;
	}

	public void setFunds(int funds) {
		this.funds = funds;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
