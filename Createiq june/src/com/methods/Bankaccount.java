package com.methods;

public class Bankaccount {
	String bankname;
	String branchname;
	String location;
	String name;
	String accountnumber;
	String accounttype;
	int balance;
	String ifsccode;
	
	
	public void bankaccount() {
		System.out.println("bankname:"+bankname);
		System.out.println("branchname:"+branchname);
		System.out.println("location:"+location);
		System.out.println("name:"+name);
		System.out.println("accountnumber:"+accountnumber);
		System.out.println("accountnumber:"+accountnumber);
		System.out.println("balance:"+balance);
		System.out.println("IFSCCode:"+ifsccode);
		System.out.println("--------------------");
			}
	public static void main (String []args) {
		Bankaccount b1 = new Bankaccount();
		b1.bankname="state bank of india";
		b1.branchname="mancherial";
		b1.location="mancherial IB";
		b1.name="kumar";
		b1.accountnumber="33419111293";
		b1.balance=10202;
		b1.ifsccode="SBIN0006267";
		b1.bankaccount();
		
		Bankaccount b2 = new Bankaccount();
		b2.bankname="state bank od";
		b2.branchname="mancherial";
		b2.location="mancherial IB";
		b2.name="alekya";
		b2.accountnumber="33419111321";
		b2.balance=15235;
		b2.ifsccode="SBIN0006267";
		b2.bankaccount();
		
		
	}

}
