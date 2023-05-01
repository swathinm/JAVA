package Atm;
import java.io.IOException;
import java.util.*;
import java.util.Map.Entry;
import java.text.DecimalFormat;

public class Option extends Account{
	Scanner menuInput = new Scanner(System.in);
	DecimalFormat moneyFormat=new DecimalFormat("'$'###,##0.00");
	
	HashMap<Integer,Integer> data=new HashMap<Integer,Integer>();
	
	public void getLogin() throws IOException{
		int x=1;
		do {
			try {
				data.put(12345, 2001);
				data.put(123456, 2002);
				
				System.out.println("Welcome to the ATM project!");
				
				System.out.print("Enter the Customer Number :");
				setCustomerNumber(menuInput.nextInt());
				
				System.out.print("Enter u r pin number:");
				setPinNumber(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("\n"+"Invalid Charcter(s).Only number."+"\n");
				x=2;
			}
			
			for(Entry<Integer, Integer> entry : data.entrySet()) {
				if (entry.getKey()==getCustomerNumber()&&entry.getValue()==getPinNumber());
				getAccountType();
			}System.out.println("\n"+"Wrong Customer NUmber or Pin Number."+"\n");
		}while(x==1);
		
	}

	private void getAccountType() {
		System.out.println("Select the Account you want to access:");
		System.out.println("Type 1 - Current Account");
		System.out.println("Type 2 - Saving Account");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			getCurrent();
			break;
		
		case 2:
			getSaving();
			break;
			
		case 3:
			System.out.println("Thank you");
			break;
			
		default :
			System.out.println("\n"+"Invalid Choice"+"\n");
			getAccountType();
		}
		
	}
	public void getCurrent() {
		System.out.println("Current Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 3 - deposit Funds");
		System.out.println("Type 4 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Saving Account Balance:"+moneyFormat.format(getCurrentAccount()));
			getAccountType();
			break;
			
		case 2:
			CurrentWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			CurrentDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thankyou for using this ATM :)");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getCurrent();
		
		}
		
	}
	public void getSaving() {
		System.out.println("Saving Account");
		System.out.println("Type 1 - View Balance");
		System.out.println("Type 2 - Withdraw Funds");
		System.out.println("Type 2 - deposit Funds");
		System.out.println("Type 3 - Exit");
		System.out.print("Choice: ");
		
		selection = menuInput.nextInt();
		
		switch(selection) {
		case 1:
			System.out.println("Current Account Balance:"+moneyFormat.format(getSavingAccount()));
			getAccountType();
			break;
			
		case 2:
			SavingWithdrawInput();
			getAccountType();
			break;
			
		case 3:
			SavingDepositInput();
			getAccountType();
			break;
			
		case 4:
			System.out.println("Thankyou for using this ATM :)");
			break;
			
		default:
			System.out.println("\n"+"Invalid Choice."+"\n");
			getSaving();
		
		}
	}
	int selection;
	
	

}
