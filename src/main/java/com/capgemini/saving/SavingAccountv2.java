package com.capgemini.saving;

import com.capgemini.bank.InsuranceInterface;

public class SavingAccountv2  extends SavingAccount implements InsuranceInterface{

	
	
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
		return true;
	}
}
