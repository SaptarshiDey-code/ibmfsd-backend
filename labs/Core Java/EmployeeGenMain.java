package Day4_Generics;
import java.util.*;
public class EmployeeGenMain {
	TreeSet<EmployeeGenerics<?>> obj=new TreeSet<>();
	public void add() {
		obj.add(new EmployeeGenerics<Double>("Ram",1,"Del","IT",36000.765));
		obj.add(new EmployeeGenerics<Double>("Ajay",2,"BLR","Engg",32000.787));
		obj.add(new EmployeeGenerics<Integer>("Sneha",4,"KOL","IT",40000));
		obj.add(new EmployeeGenerics<Integer>("Erica",3,"GOA","SER",40000));
		
	}
	
	public void display() {
		for(Object o:obj) {
			System.out.println(o);
		}
		
	}
	public static void main(String args[]) {
		
		EmployeeGenMain A=new EmployeeGenMain();
		A.add();
		A.display();
		
		
		
		
		
		
		
	}

}
