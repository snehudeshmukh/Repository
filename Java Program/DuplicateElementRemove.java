import java.util.Arrays;
class DuplicateElementRemove {
public static void main (String []args){
int num [] ={2,2,3,5,6,7,6,4,3,8,5};
Arrays.sort(num);
System.out.println("Array Elements sorted:");
for(int i=0; i<num.length;i++) {
System.out.println(num[i]);
}
int a=0;
for(int i=0;i<num.length-1;i++) {
if(num[i]!=num[i+1]) {
	num[a++]=num[i];
}
}
num[a++]=num[num.length-1];
System.out.println("Array after Duplicate Elements Remove:");
for(int j=0;j<a;j++)
	System.out.println(num[j]);
}
}