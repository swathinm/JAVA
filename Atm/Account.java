package Atm;

import java.io.IOException;
import java.util.*;
import java.text.DecimalFormat;

public class Account {
	Scanner input=new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");

	private int customerNumber;
	private int pinNumber;
	private double currentAccount=0;
	private double savingAccount=0;
	
	
	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public void setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
	}

	public double getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(double currentAccount) {
		this.currentAccount = currentAccount;
	}

	public double getSavingAccount() {
		return savingAccount;
	}

	public void setSavingAccount(double savingAccount) {
		this.savingAccount = savingAccount;
	}

	public double calCurrentWithdraw(double amount) {
		currentAccount=(currentAccount - amount);
		return currentAccount;
	}
	 
	public double calCurrentDeposit(double amount) {
		currentAccount=(currentAccount + amount);
		return currentAccount;
	}
	
	public double calSavingsWithdraw(double amount) {
		savingAccount=(savingAccount - amount);
		return savingAccount;
	}
	
	public double calSavingsDeposit(double amount) {
		savingAccount=(savingAccount + amount);
		return savingAccount;
	}
	public void CurrentWithdrawInput() {
		System.out.println("Checking Account Balance :"+moneyFormat.format(currentAccount));
		System.out.println("Amount you want to withdraw from Checking Account:");
		double amount=input.nextDouble();
		
		if((currentAccount- amount )>=0) {
			calCurrentWithdraw(amount);
			System.out.println("New Checking Account balance:"+moneyFormat.format(currentAccount));
		}else {
			System.out.println("Balance cannot be negative."+"\n");
		}
		
	}
	public void CurrentDepositInput() {
		System.out.println("Checking Account Balance :"+moneyFormat.format(currentAccount));
		System.out.println("Amount you want to withdraw from Checking Account:");
		double amount=input.nextDouble();
		
		if((currentAccount + amount )>=0) {
			calCurrentDeposit(amount);
			System.out.println("New Checking Account balance:"+moneyFormat.format(currentAccount));
		}else {
			System.out.println("Balance cannot be negative."+"\n");
		}
		
	}
	public void SavingWithdrawInput() {
		System.out.println("Checking Account Balance :"+moneyFormat.format(savingAccount));
		System.out.println("Amount you want to withdraw from Saving Account:");
		double amount=input.nextDouble();
		
		if((savingAccount-amount)>=0) {
			calSavingsWithdraw(amount);
			System.out.println("New Checking Account balance:"+savingAccount+"\n");
		}else {
			System.out.println("Balance cannot be negative "+"\n");
		}
	}
	
	public void SavingDepositInput() {
		System.out.println("Checking Account Balance :"+moneyFormat.format(savingAccount));
		System.out.println("Amount you want to withdraw from Saving Account:");
		double amount=input.nextDouble();
		
		if((savingAccount + amount)>=0) {
			calSavingsDeposit(amount);
			System.out.println("New Checking Account balance:"+savingAccount+"\n");
		}else {
			System.out.println("Balance cannot be negative "+"\n");
		}
	}
	
}