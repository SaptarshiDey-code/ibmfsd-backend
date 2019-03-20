package PracticeEx;

import java.io.*;
import java.util.concurrent.Callable;
public class CitiMain  {
	
	public static void main(String args[])throws IOException, ClassNotFoundException {
		
		Object O;
		CitiOp ob1=new CitiOp();
	try {
		ObjectInputStream obi=new ObjectInputStream(new FileInputStream("D:\\File-Java\\citi1.txt"));
		//while((O=obi.readObject())!=null) {
		while((O=obi.readObject())!=null) {
			if(O instanceof Citi) {
				
		System.out.println((Citi)obi.readObject());
		System.out.println("Employee Added");
		}
		}	
		obi.close();
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		//Callable <Boolean> importThrd=new Callable<Boolean>(); {
			
			
		//};
		
		
		ob1.add();
		ob1.Display();
		
		
	}
	/*@Override
	public Boolean call()  {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " -->Start Running thread");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			//throw new MyException();
		}
		System.out.println(Thread.currentThread().getName() + " -->Stop thread");
		ob1.add();
		return true;
	}
	*/
	
}

