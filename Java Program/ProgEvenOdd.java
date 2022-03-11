import java.util.Scanner;
class ProgEvenOdd{
public static void main(String [] args) {
Scanner sc = new Scanner (System.in);
System.out.println ("Enter Array Size:" );
int size =sc.nextInt();
EvenOddArray s1 = new EvenOddArray();
int sum1 =0;
int sum2=0;
int arr [] = new int [size];
for (int i=0; i<size;i++) {
 arr[i]= sc.nextInt();
System.out.println ("Enter the Array Values:" );
if(arr[i]%2==0) {
sum1=sum1+arr[i];
}
else {
sum2=sum2+arr[i];
}
}
System.out.println ("Addition Of Even Number:" +sum1);
System.out.println ("Addition Of Odd Number:" +sum2);
}
}