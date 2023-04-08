package com.ForLoop;

public class AtmNotesproDemo {
public static void main (String[]args) {
int amount =2500;
if (amount >=500);
{
	int note500=amount/500;
	amount =amount-(note500*500);
	System.out.println("500*"+note500);
}
if(amount>200);
{
int note200=amount/200;
amount=amount-(note200*200);
System.out.println(("200*") +note200);
}
if(amount>100);
{
int note100=amount/100;
amount=amount-(note100*100);
System.out.println("100*"+note100);
}
if(amount>50);
{
	int note50=amount/50;
	amount=amount-(note50*50);
	System.out.println("50*"+note50);
}
if(amount>20);
{
	int note20=amount/20;
	amount=amount-(note20*20);
	System.out.println("20*"+note20);
	}
}
}
	

