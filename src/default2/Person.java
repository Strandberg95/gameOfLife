package default2;

import java.util.*;

public class Person {
	
	long uniqueID;
	String name;
	int age;
	Random rdm = new Random();
	
//	public static void main(String args[]){
//		
//	}
	public Person(int age, String name){
		this.age = age;
		this.name = name;
		uniqueID = rdm.nextLong();
	}
	
	public void writeInfo(){
	 System.out.println("persons name: " + name);
	 System.out.println("persons age: " + age);
	 System.out.println("persons ID numbers: " + uniqueID);
	 System.out.println(" ");
	}
	

}
