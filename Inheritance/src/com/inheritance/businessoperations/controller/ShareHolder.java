package com.inheritance.businessoperations.controller;

import java.util.List;

public class ShareHolder {

	private List<Company> company; // reference field of collections Company

	public ShareHolder() {
	}

	public ShareHolder(List<Company> ref2) {

		this.company = ref2;

	}

	public List<Company> getAlldetails() {
		return company;
	}

}
