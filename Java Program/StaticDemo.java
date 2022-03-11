class StaticDemo {
public static void main (String [] args) {
	StaticDemo obj = new StaticDemo();
	obj.print();
	hello();
System.out.println("Main Method Started");
}
void print()
{
System.out.println("print");
}
private static void hello()
{
	System.out.println("Hello");
}
}