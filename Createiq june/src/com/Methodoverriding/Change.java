package com.Methodoverriding;

public class Change extends Marry {
	@Override
	void marryDate() {
		System.out.println("marry will be on 27dec");
		super.marryDate();
	}

}
