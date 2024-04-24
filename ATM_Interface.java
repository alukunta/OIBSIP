package Rc.Tech.Solutions;

import java.util.*;

public class ATM_Interface {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		int balance = 100000;
		int Transactions_History;
		int Withdraw;
		int Deposit;
		int Transfer;
		
        System.out.println("Welcome to Automated Teller Machine");
        System.out.println("Please enter user id");
        String user = "1234";
        String id = c.next();
        System.out.println("Please enter your pin");
        String pin = "7995";
        String pwd = c.next();
        
        if(user.equals(id) && pin.equals(pwd)) {
        	System.out.println("Welcome");
            System.out.print("Choose the operation you want to perform:");  
            System.out.println("");
        }
        else {
        	System.out.println("Please check user id and pin");
        	System.exit(0);
        }
        
        while(true) {
        	System.out.println("Choose 1 for Transactions_History");
        	System.out.println("Choose 2 for Withdraw");
        	System.out.println("Choose 3 for Deposit");
        	System.out.println("Choose 4 for Transfer");
        	System.out.println("Choose 5 for EXIT");
        	
        	int choice = c.nextInt();
        	switch(choice) {
        	case 1:
        		System.out.println("Transactions History" + balance);
        		System.out.println();
        		break;
        	
        	case 2:
        		System.out.println("Enter amount to be withdraw");
        		Withdraw = c.nextInt();
        		if(balance >= Withdraw) {
        			balance = balance-Withdraw;
        			System.out.println("Please collect your amount");
        		}
        		else {
        			System.out.println("Insufficient Balance");
        		}
        		System.out.println("");
        		break;
        		
        	case 3:
        		System.out.println("Enter money to be Deposited:");
        		Deposit = c.nextInt();
        		balance = balance+Deposit;
        		System.out.println("Your amount has been successfully deposited");
        		System.out.println("");
        		break;
        		
        	case 4:
        		System.out.println("please enter revicer user id");
				String tfid = c.next();
        		System.out.println("Please enter amount");
        		int Tf= c.nextInt();
        		if(balance>=Tf) {
        			balance = balance-Tf;
        			System.out.println("amount successfully transfed");
        		}
        		else {
        			System.out.println("Insufficient Balance");
        		}
        		System.out.println();
        		break;
        	case 5:
        		System.out.println("Thankyou Visit again");
        		System.exit(0);
        		
        	}
        }
        
		
	}
}
