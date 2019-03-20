package Day6;
import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
public class LambdaConsumer {
	BiFunction<Integer, Integer, Integer> add;
	BiFunction<Integer, Integer, Integer> sub;
	BiFunction<Integer, Integer, Integer> mul;
	BiFunction<Integer, Integer, Integer> div;
	Function<Integer, Integer> fact;	
	public int factorial(int a) {
		int f=1;
		for(int i=1;i<=a;i++) {
			f*=i;
		}
		return f;
		}
	public void eval()
		{
		//public void demo() {System.out.println(5); }
		add =(a,b)->a+b;
		sub =(a,b)->a-b;
		mul =(a,b)->a*b;
		div =(a,b)->a/b;
		fact=(a)-> factorial(a);
		}
		
		public static void main(String args[]) {
		LambdaConsumer ob=new LambdaConsumer();
		ob.eval();
		System.out.println("Addition:"+ob.add.apply(20, 30));
		System.out.println("Subtraction:"+ob.sub.apply(60, 30));
		System.out.println("Multiplication:"+ob.mul.apply(20, 30));
		System.out.println("Division:"+ob.div.apply(90, 30));
		System.out.println("Factorial:"+ob.fact.apply(6));
		
		
	}

}
