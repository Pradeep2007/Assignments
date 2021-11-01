package com.finalkeyword;

public class Finalkeyword {
	final int usn;
	final String name;
	String address;
	String Qualification;
	public Finalkeyword(int usn,String name,String address,String Qualification) {
		this.usn = usn;
		this.name=name;
		this.address=address;
		this.Qualification=Qualification;
	}
	public void display() {
		System.out.println("USN of the student is:"+usn);
		System.out.println("Name of the student is:"+name);
		System.out.println("Address of the student is:"+address);
		System.out.println("Qualification of the student is:"+Qualification);
		
	}
	public static void main(String[] args) {
		Finalkeyword f = new Finalkeyword(19,"Pradeep A","Markandhaiha Nagar","MCA");
		f.display();
	}

}
