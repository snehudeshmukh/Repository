class ReturnArrayCopy {
public static int[] array (int a[]) {
int numCopy []=new int [a.length];
for(int i=0;i<a.length;i++){
numCopy[i]=a[i];
}
return numCopy;
}
public static void main (String []args) {
int result;
int a [] = {12,13,14,15,17,18,19,20,25,50};
int num[]=array(a);
for(int i=0;i<num.length;i++) {
System.out.println("Copied Array values:" +num[i]);
}
}
}