import java.util.Scanner;
class Array {
public static void main (String [] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println ("Enter the size:");
	int size = sc.nextInt();
int sum =0;
int [] arr = new int [size];
for (int i=0;i<size;i++) {
	arr[i]=sc.nextInt();
}
System.out.println("Printed array elements:");
for (int i=0;i<size;i++) {
	sum=sum+arr[i];
}
System.out.println(sum);
}
}