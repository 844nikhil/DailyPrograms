package com.capgemini.current;

import com.capgemini.bank.InsuranceInterface;

public class CurrentAccountv2 extends CurrentAccount implements InsuranceInterface{

	public String insuranceName(String insuranceName) {
		// TODO Auto-generated method stub
		return insuranceName;
	}

	public double insuranceAmount(double insuranceAmount) {
		// TODO Auto-generated method stub
		return insuranceAmount;
	}

	public boolean isLifeTime() {
		// TODO Auto-generated method stub
		return false;
	}
}
