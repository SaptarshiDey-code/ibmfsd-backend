package PracticeEx;

import java.util.*;
import java.io.*;

public class CitiOp {
	ArrayList <Citi> obj=new ArrayList <Citi>();
	
	public void add()throws IOException {
		
		String O;
		try {
			/*FileOutputStream f = new FileOutputStream(new File("D:\\File-Java\\myObjects.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);

			// Write objects to file
			o.writeObject(p1.getName()+"\t"+p1.getAge());
			
			o.writeObject(p2.getName()+"\t"+p2.getAge());
			
			o.close();
			f.close();*/
			BufferedReader obi=new BufferedReader(new FileReader("D:\\File-Java\\citi1.txt"));
			while((O=obi.readLine())!=null) {
				String A[]=O.split(",");
				//Object C=O;
				
			//System.out.println(A[0]);
				System.out.println("Employee Added");
				obj.add(new Citi(Integer.parseInt(A[0]),A[1],Integer.parseInt(A[2]),A[3]));
			
			}
			
			obi.close();
			
			
			
			
				
			
		}
		
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		//System.out.println("Data Deserialized");
		
	}
	
	public void Display()throws IOException {
		
		try {
			BufferedWriter br=new BufferedWriter(new FileWriter("D:\\File-Java\\Citi.txt"));
			for(Citi w:obj) {
			br.write(w.getId()+"\t"+w.getAge()+"\t"+w.getName()+"\t"+w.getCity()+"\n");
			}
			br.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		obj.forEach(w->System.out.println(w.getId()+"\t"+w.getAge()+"\t"+w.getName()+"\t"+w.getCity()));
		
	}
	
	

}
