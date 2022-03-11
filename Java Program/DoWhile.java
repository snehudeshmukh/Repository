import java.util.Scanner;
class DoWhile {
public static void main (String[] args) {
	int n =1;
Scanner ref = new Scanner(System.in);
System.out.println("Enter The Number");
int number = ref.nextInt();
do{
System.out.println(n);
n++;
}
while (n<=number);
}
}