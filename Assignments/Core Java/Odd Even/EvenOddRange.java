package Day1;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EvenOddRange {
	public static void main(String args[]) {
	int lr,ur;
	List A=new ArrayList();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the lower range:");
	lr=sc.nextInt();
	System.out.println("Enter the upper range:");
	ur=sc.nextInt();
	EvenOddRange ob=new EvenOddRange();
	ob.seperate(lr, ur);
	
	}


public  void seperate(int l,int u) {
	
	List E=new ArrayList();
	List O=new ArrayList();
	for(int i=l;i<=u;i++) {
		if(i%2==0) {
			E.add(i);
		}
		else {
			O.add(i);
		}
	}
	
	System.out.print("Even:");
	
	E.forEach((i)->System.out.print(i+" "));
	System.out.println();
	System.out.print("Odd:");
	O.forEach((j)->System.out.print(j+" "));
	
}
}