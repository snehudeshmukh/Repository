import java.util.Scanner;
class EvenSeries {
public static void main (String[]args){
	Scanner sc =new Scanner (System.in);
	System.out.println ("Enter the Number Addition Required");
	int number = sc.nextInt();
for (int i=1; i<=number; i++) {
if (i%2==0) {
    System.out.println("Even Number is" +i);	
  }
  }
}
}