package Day7;
import java.io.*;
public class File2_BR {
	public static void main(String args[])throws IOException {
		BufferedReader in=null;
		BufferedWriter op = null;
		int c;String S;
		try {
			in=new BufferedReader(new InputStreamReader(System.in));
			S=in.readLine();
			op=new BufferedWriter(new FileWriter("D:\\File-Java\\output1.txt"));

			while((c=in.read())!=-1)
					{
				System.out.println((char)c);
				op.write(c);
		}
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found"+e.getMessage());
		}
		
		finally {
			in.close();
			op.close();
		}
	}

}
