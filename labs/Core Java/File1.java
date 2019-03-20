package Day7;
import java.io.*;
public class File1 {
	public static void main(String args[])throws IOException {
		FileInputStream in=null;
		FileOutputStream op=null;
		int c;
		try {
			in=new FileInputStream("D:\\File-Java\\input1.txt");
			op=new FileOutputStream("D:\\File-Java\\output1.txt");
			while((c=in.read())!=-1) {
				System.out.print((char) c);
				op.write( c);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File Not Found Exception"+e.getMessage());
		}
	}

}
