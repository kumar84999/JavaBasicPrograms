package com.ForLoop;

import java.util.Scanner;

public class AtmDemo2 {
	
public static void main (String []args) 
	{
	int balance=30000,withdraw,deposite,num;
	Scanner sc = new Scanner(System.in);
	while (true)
	{
	System.out.println("welcome ATM machine");
	System.out.println("1.withdraw");
	System.out.println("2.deposite");
	System.out.println("3.check Balance");
	System.out.println("4.EXIT");
	num =sc.nextInt();
	switch(num)
	{case 1:
	System.out.println("Enter amount to be withdraw");
	withdraw = sc.nextInt();
	if(balance>=withdraw)
	{
	balance=balance-withdraw;
	System.out.println("Balanceamount is: " +balance);
	System.out.println("please collect money");
	}
	else 
	{
	System.out.println("you dnot have enough money to withdraw");
	}
	System.out.println(" ");
	break;
	case 2:
	System.out.println("Enter amoubt to deposite");
	deposite = sc.nextInt();
	balance =balance +deposite;
	System.out.println("Balance amount is :" +balance);
	System.out.println("Money has been deposited");
	System.out.println(" ");
	break;
	case 3:
	System.out.println("Balance of your Account is: " +balance);
	System.out.println(" ");
	break;
	case 4:
	System.exit(0);
	System.out.println(" ");
					
	}
	}
	}
			
	}







