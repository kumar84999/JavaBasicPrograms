package com.ParametarisedConstractor;

public class Studentmarks {
 String studentname;
 int id;
 int telugu;
 int english;
 int maths;
 int science;
 int java;
public Studentmarks(String studentname,int id,int telugu,int english,int maths,int science,int java){
 this.studentname=studentname;
 this.id=id;
 this.telugu=telugu;
 this.english=english;
 this.maths=maths;
 this.science=science;
 this.java=java;
}
 void printstudentmarks() {
	 System.out.println("studentname:"+studentname);
	 System.out.println("id:"+id);
	 System.out.println("telugu:"+telugu);
	 System.out.println("english:"+english);
	 System.out.println("maths:"+maths);
	 System.out.println("science:"+science);
	 System.out.println("java:"+java);
	 System.out.println("-------------------");
	 
	 
 }
 public static void main (String []args) {
	 Studentmarks s1=new Studentmarks("kumar",1,89,85,75,83,80);
	 Studentmarks s2=new Studentmarks("sriman",2,90,92,93,95,98);
	 Studentmarks s3=new Studentmarks("shannu baby",3,75,77,70,78,90);
	 s1.printstudentmarks();
	 s2.printstudentmarks();
	 s3.printstudentmarks();
 
 }
}