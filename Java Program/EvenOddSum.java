import java.util.Scanner;
class EvenOddSum {
public static void main (String[]args){
	int sum1 =0;
	int sum2 =0;
	Scanner sc =new Scanner (System.in);
	System.out.println ("Enter the Number Addition Required");
	int number = sc.nextInt();
for (int i=1; i<=number; i++) {
if (i%2==0) {
	sum1=sum1+i;
 }
 else {
	 sum2=sum2+i; 
  }
  }
    System.out.println(" Addition of Odd Number is" +sum1); 
	System.out.println(" Addition of Odd Number is" +sum2);
  }
}