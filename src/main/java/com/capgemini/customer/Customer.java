package com.capgemini.customer;

import com.capgemini.bank.BankAccount;
import com.capgemini.bank.InsuranceInterface;
import com.capgemini.current.CurrentAccount;
import com.capgemini.current.CurrentAccountv2;
import com.capgemini.saving.SavingAccount;
import com.capgemini.saving.SavingAccountv2;

public class Customer {

	public static void main(String[] args) {
		
//		BankAccount acc=null;
//		acc=new SavingAccount();
//		acc.withdraw(5000);
//		
		InsuranceInterface insuranceInterface=null;
		insuranceInterface=new SavingAccountv2();
		System.out.println("Saving Account-");
		System.out.println(insuranceInterface.insuranceName("icici policy"));
		System.out.println(insuranceInterface.insuranceAmount(50000));
		System.out.println(insuranceInterface.isLifeTime());
		
		insuranceInterface=new CurrentAccountv2();
		System.out.println("Current Account-");
		System.out.println(insuranceInterface.insuranceName("sbi policy"));
		System.out.println(insuranceInterface.insuranceAmount(100000));
		System.out.println(insuranceInterface.isLifeTime());
//		SavingAccount acc1 = new SavingAccount();
//		acc1.deposit(20000);
//		acc1.withdraw(5000);
//		SavingAccount acc2 = new SavingAccount();
//		acc2.deposit(20000);
//		SavingAccount acc3 = new SavingAccount();
//		acc3.deposit(20000);
//
//		System.out.println("Bank Account 1- " + acc1);
//		System.out.println("Bank Account 2- " + acc2);
//		System.out.println("Bank Account 3- " + acc3);
	}
}
