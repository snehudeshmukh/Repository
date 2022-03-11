import java.util.Scanner;
class ForLoop {
public static void main (String []args) {
	Scanner sc = new Scanner (System.in);
	int sum = 0;
	System.out.print("enter the number");
	 int number = sc.nextInt();
for(int i=1;i<=number;i++)
{
	sum= sum+i;
}
System.out.println("Sum Of Natural Number=" +sum);
}
}