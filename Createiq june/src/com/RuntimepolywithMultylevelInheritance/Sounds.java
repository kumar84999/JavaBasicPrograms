package com.RuntimepolywithMultylevelInheritance;

public class Sounds {
	public static void main (String []args) 
	{
		AnimalSound Sounds =new AnimalSound();
		AnimalSound Buffallo=new Buffallo();
		AnimalSound Snake=new Snake();
		AnimalSound Tiger=new Tiger();
		
		Sounds.Sound();
		Buffallo.Sound();
		Snake.Sound();
		Tiger.Sound();
		
		
		}
}
