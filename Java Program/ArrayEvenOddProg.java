class ArrayEvenOddProg {
public static void main (String []args) {
int result;
int numbers[] = {8,13,6,7,12,18,9,4,15,24,17,20,25,14,11,26,27,29,30,32};
result=evenAddition(numbers);
System.out.println("Even Number Addition Result:"    +result);
result =oddAddition(numbers);
System.out.println("Odd Number Addition Result:"    +result);
}
public static int evenAddition(int numbers [])
{
int sum1 =0;
for (int i=0;i<numbers.length;i++) {
if (numbers[i]%2==0) {
System.out.println(" Print Even Numbers :" +numbers[i]);
 sum1 =sum1+numbers[i];
}
}
 return sum1;
}
public static int oddAddition(int numbers []) {
int sum2=0;
for (int i=0;i<=19;i++) {
if (numbers[i]%2!=0) {
System.out.println(" Print Odd Numbers :" +numbers[i]);
 sum2 =sum2+numbers[i];
}
}
 return sum2;
}
}