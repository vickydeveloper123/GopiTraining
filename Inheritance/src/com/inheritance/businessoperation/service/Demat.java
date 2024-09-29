package com.inheritance.businessoperation.service;

public class Demat {

	String name;
	int accNumber;
	boolean status;

	public Demat() {

		System.out.println(" Default constructor is running....");
	}

	public Demat(String name, int accNumber, boolean status) {
		super();
		this.name = name;
		this.accNumber = accNumber;
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Demat [name=" + name + ", accNumber=" + accNumber + ", status=" + status + "]";
	}

	public boolean getAlldetails(int accNumber) {
		if (accNumber > 100) {
			status = true;
		} else
			status = false;
		return status;

	}

}