package Day1;
import java.util.*;
public class SwapTwo {

	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		SwapTwo ob=new SwapTwo();
		ob.Swap(a,b);
		
		
		
	}
	
	public void Swap(int c,int d) {
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println("After Swapping:");
		System.out.println("a:"+c);
		System.out.println("b:"+d);
	}
}
