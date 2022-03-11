class ArraySortEvenOdd {
public static void main (String []args) {
int[] arr = {10,13,17,18,12,15,7,8,20,19,14,16};
System.out.println("Print Even Numbers of Array:");
for (int num :sortEven(arr))
System.out.println(num);
System.out.println("Print Odd Numbers of Array:");
for(int numbers:sortOdd(arr))
System.out.println(numbers);
}
public static int[] sortEven (int[] even) {
int evenCountNo =0;
for(int num:even) {
if (num%2==0) 
evenCountNo++;
}
int evenArray[] = new int[evenCountNo];
int index=0;
for(int a:even) {
if(a%2==0)
evenArray[index++]=a;
}
return evenArray;
}
public static int[] sortOdd(int[] odd) {
int countOddNo=0;
for(int num:odd) {
	if(num%2!=0)
		countOddNo++;
}
int []oddArray =new int[countOddNo];
int index1=0;
for(int b:odd){
if(b%2!=0)
oddArray[index1++]=b;
}
return oddArray;
}
}