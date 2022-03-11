class EvenOddArray {
public static void main(String [] args) {
int arr[] ={10,13,12,15,17,18,20,8,5,7,16,4};
EvenOddArray s1 = new EvenOddArray();
s1.evenOdd(arr);
}
 void evenOdd (int arr[]) {
int sum1 =0;
int sum2=0;
for (int i=0; i<12;i++) {
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