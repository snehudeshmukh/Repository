import java.util.Arrays;
class Ascending {
public static void main (String []args) {
int a[]= {12,9,18,25,5,35,11,40,21,55,3};
Arrays.sort(a);
System.out.println("Print Array in Ascending Order:");
System.out.println(Arrays.toString(a));
System.out.println("Print Array in Descending Order:");
for(int i=a.length-1;i>0;i--) {
System.out.print(a[i]+ " ");
}
}
}