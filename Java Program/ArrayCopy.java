class ArrayCopy {
public static void array (int a[]) {
int numCopy []=new int [a.length];
for(int i=0;i<a.length;i++){
numCopy[i]=a[i];
System.out.println ("Print Copied Array:" +numCopy[i]);
}
}
public static void main (String []args) {
int a [] = {12,13,14,15,17,18,19,20,25,50};
array(a);
}
}