import java.util.Scanner;
class WhileLoop {
public static void main (String []args) {
	Scanner sc = new Scanner (System.in);
	int number= 100;
	int sum = 0;
	int i=0;
	System.out.print("enter the number");
	 number = sc.nextInt();
while(i<=number)
{
	sum= sum+i;
	i++;
}
System.out.println("Sum Of Natural Number=" +sum);
}
}