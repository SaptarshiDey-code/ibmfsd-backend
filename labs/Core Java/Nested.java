package Day5;

public class Nested {
	public void Say() {
		System.out.println("Hello");
		
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	static class Inside{
		public static void SayHello() {
			System.out.println("Say Hello");
		}
		
		public static int eval(int a,int b,int c) {
			return add(a,b)*c;
		}
	}
public static void main(String args[]) {
	System.out.println("--------------------Outer Class--------------------");
	Nested N=new Nested();
	N.Say();
	System.out.println("Add Called:"+add(10, 20));
	System.out.println("--------------------Inside Class--------------------");
	//Inside I=N.new Inside();
	Inside.SayHello();
	System.out.println("Eval Called:"+Inside.eval(5,7,6));
	
}
}
