import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		p("Enter an integer: ");
		int a = s.nextInt();
		showNumberPlus10(a);
		showNumberPlus100(a);
		showNumberPlus1000(a);
	}
	
	static String[] n = {"\n", "\n\n", "\n\n\n"};
	
	static int showNumberPlus10(int a)
	{
		int b = 10;
		int c = a + b;
		pln(a + " plus " + b + " is " + c + ".");
		return a+b;
	}
	
	static int showNumberPlus100(int a)
	{
		int b = 100;
		int c = a + b;
		pln(a + " plus " + b + " is " + c + ".");
		return a+b;
	}
	
	static int showNumberPlus1000(int a)
	{
		int b = 1000;
		int c = a + b;
		pln(a + " plus " + b + " is " + c + ".");
		return a+b;
	}
	
	static void pln(Object output)
	{
		System.out.println(output);
	}
	
	static void p(Object output)
	{
		System.out.print(output);
	}
}
