import java.util.Scanner;
class MissingNumber {
public static void main (String [] args) {
	int sum1 =0;
	int sum2 =0;
int arr[] = {10,20,30,40,50,60,70,80,90,100};
int r1[] = {10,20,30,40,50,60,80,90,100};
for (int i=0;i<arr.length;i++) {
	sum1=sum1+arr[i];
}
for(int i=0;i<r1.length;i++)
{
sum2=sum2+r1[i];
}
int sub=sum1-sum2;
System.out.println("Missing Number is =" +sub);
}
}