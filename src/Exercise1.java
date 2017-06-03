import java.util.*;
abstract class Calc{
	int a, b;
	abstract void setValue(int a, int b);
	abstract int calculate();
}
class Add extends Calc{
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	int calculate()
	{
		int c = 0;
		return c = a + b;
	}
}
class Sub extends Calc{
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	int calculate()
	{
		int c = 0;
		return c = a - b;
	}
}
class Mul extends Calc{
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	int calculate()
	{
		int c = 0;
		return c = a * b;
	}
}
class Div extends Calc{
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	int calculate()
	{
		int c = 0;
		return c = a / b;
	}
}
public class Exercise1 {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a = 0, b = 0;
		String c = new String();
		System.out.print("두 정수와 연산자를 입력하시오>>");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.next();

		if(c.equals("+"))
		{
			Add x = new Add();
			x.setValue(a, b);
			System.out.println(x.calculate());
		}
		else if(c.equals("-"))
		{
			Sub x = new Sub();
			x.setValue(a, b);
			System.out.println(x.calculate());
		}
		else if(c.equals("*"))
		{
			Mul x = new Mul();
			x.setValue(a, b);
			System.out.println(x.calculate());
		}
		else if(c.equals("/"))
		{
			Div x = new Div();
			x.setValue(a, b);
			System.out.println(x.calculate());
		}
		else
		{
			System.out.println("ERROR");
		}
	}
}