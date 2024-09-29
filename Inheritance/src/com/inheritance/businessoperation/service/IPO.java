package com.inheritance.businessoperation.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import com.inheritance.businessoperations.controller.Company;
import com.inheritance.businessoperations.controller.ShareHolder;

public class IPO {

	public static void main(String[] args) {

		Company ref1 = new Company("Retail", 65464, "AVX123", 3543);
		Company ref2 = new Company("Wholesale", 69464, "AVrt123", 2743);
		Company ref3 = new Company("whole-retail", 868564, "sefX123", 9853);
		Company ref4 = new Company("self manufacture", 98464, "AV87123", 3983);

		List<Company> data = new ArrayList();
		data.add(ref1);
		data.add(ref2);
		data.add(ref3);
		data.add(ref4);

		ShareHolder ref21 = new ShareHolder(data);
		List<Company> alldetails = ref21.getAlldetails();

		Demat d1 = new Demat();
		d1.setName("Gopi");
		d1.setAccNumber(123);

		Demat d2 = new Demat();
		d2.setName("Dora");
		d2.setAccNumber(723);

		for (Company dat : alldetails) {
			if (d2.getAlldetails(723)) {
//				System.out.println("Adhar Number :" + dat.getAdhar() + "Pan Number :" + dat.getPan() + "status :");
//				
//				System.out.println("---------------------------------------------------------------");
//				
				System.out.println("Demat user details :"+d2.getName()+"  , Account Number :"+d2.getAccNumber());
			} else {
				System.out.println("Details not found in the company....");
			}
		}

	}

}