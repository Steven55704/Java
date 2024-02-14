public class Main {
	public static void main(String[] args) {
		int a = 5;
		int b = 4;
		add(a,b);
		subt(a,b);
		add(10,5);
		subt(10,5);
		info(19, "Judiell");
	}
	
	static String[] n = {"\n", "\n\n", "\n\n\n"};
	
	static int add(int a, int b)
	{
		//int c = a + b;
		p("Add: " + a + " + " + b + " = " + c);
		return a+b;
	}
	
	static int subt(int a,  int b)
	{
		int c = a - b;
		p("Minus: " + a + " - " + b + " = " + c);
		return c;
	}
	
	static void info(int age, String name)
	{
		p("My name is " + name + ", " + "I'm " + age +" years old");
	}
	
	static void p(Object output)
	{
		System.out.println(output);
	}
}
