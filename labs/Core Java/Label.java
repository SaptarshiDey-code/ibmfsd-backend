package Day2;

public class Label {
	public static void main(String args[]) {
		outer: for(int i=1;i<=5;i++) {
			inner:for(int j=1;j<=5;j++) {
				if(i==2 && j==3)
					break outer;
			
	System.out.println("Output:"+j);
		}
	}
	}

}
