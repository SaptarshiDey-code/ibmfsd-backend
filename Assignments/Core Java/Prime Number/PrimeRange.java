package Day1;
import java.util.*;


import java.util.ArrayList;
public class PrimeRange {
	public static void main(String args[]) {
		int lr,ur;
		List A=new ArrayList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower range:");
		lr=sc.nextInt();
		System.out.println("Enter the upper range:");
		ur=sc.nextInt();
		PrimeRange ob=new PrimeRange();
		for(int i=lr;i<=ur;i++) {
			
			if(ob.Isprime(i) && i!=1) {
				A.add(i);
				
			}
		}
		Iterator it=A.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
	}
	public boolean Isprime(int n) {
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}

}
