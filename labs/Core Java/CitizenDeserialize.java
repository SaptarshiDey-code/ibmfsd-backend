package Day7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class CitizenDeserialize {
	public static void main(String args[])throws IOException
	{
		Citizen c=null;		
		try {
			FileInputStream fin=new FileInputStream("D:\\File-Java\\cit.ser");
			ObjectInputStream in=new ObjectInputStream(fin);
			c=(Citizen) in.readObject();
			in.close();
			fin.close();
			
		}
		catch(IOException i) {
			i.printStackTrace();
			return;
		}
		catch(ClassNotFoundException f) {
			System.out.println("Citizen Class Not Found");
			f.printStackTrace();
			
			
		}
		System.out.println("Deserialized Employee...");
	      System.out.println("Name: " + c.name);
	      System.out.println("Address: " + c.address);
	      System.out.println("SSN: " + c.UID);
	      System.out.println("Id: " + c.Id);
	}

}
