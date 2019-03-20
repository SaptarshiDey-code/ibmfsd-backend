package Day4_Generics;
import java.io.*;
public class ReadDataConsole {
	public static void main(String args[])throws IOException {
		
		String name;
		int id;
		Console c=System.console();
		name=c.readLine();
		id=Integer.parseInt(c.readLine());
		System.out.println("Name:"+name+" "+"Id:"+id);
			
			
		
	}

}
