import java.util.Arrays;
class SecondHighestNumber {
public static void main (String[]args) {
int arr[] = {12,8,15,18,7,19,18,25,35,10};
highestNum(arr);
}
public static void highestNum (int[]arr) {
int num[]= new int[arr.length];
for(int i=0;i<arr.length;i++) {
num[i]=arr[i];
}
Arrays.sort(num);
System.out.println(Arrays.toString(num));
System.out.println(num[num.length-2]);
}
}





