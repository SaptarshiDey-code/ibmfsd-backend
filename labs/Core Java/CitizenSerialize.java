package Day7;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.*;
public class CitizenSerialize {
	public static void main(String args[])throws IOException
	{
		Citizen c=new Citizen();
		c.name="Sameer";
		c.address="10,Cloverfeild Lane";
		c.Id=305;
		c.UID=777898;
		try {
			FileOutputStream fout=new FileOutputStream("D:\\File-Java\\cit.ser");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(c);
			out.close();
			fout.close();
			System.out.printf("Serialized data is saved in D:\\Temp\\cit.ser");
		}
		catch(IOException i) {
			i.printStackTrace();
		}
	}

}
