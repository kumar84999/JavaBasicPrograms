package com.methods;

public class Students {
	int id;
	String name;
	int HTnum;
	int telugu;
	int hindi;
	int english;
	int maths;
	int science;
	int social;
	public void displyMarks() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("HTnum:"+HTnum);
		System.out.println("telugu:"+telugu);
		System.out.println("hindi:"+hindi);
		System.out.println("english:"+english);
		System.out.println("maths:"+maths);
		System.out.println("science:"+science);
		System.out.println("social:"+social);
		System.out.println();
		
		
	}
	public static void main (String []args) {
	
		Students s1=new Students();
		s1.id=100;
		s1.name="kumar";
		s1.HTnum=123456;
		s1.telugu=56;
		s1.hindi=65;
		s1.english=78;
		s1.maths=77;
		s1.science=83;
		s1.social=78;
		s1.displyMarks();
		
		Students s2=new Students();
		s2.id=101;
		s2.name="sriman";
		s2.HTnum=632614;
		s2.telugu=75;
		s2.hindi=65;
		s2.english=70;
		s2.maths=87;
		s2.science=80;
		s2.social=78;
		s2.displyMarks();
		
	}

}
