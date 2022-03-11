class SortArray {
public static void main (String []args) {
int arr[] = {4,15,19,8,12,2,35,25};
for (int i=0; i<arr.length;i++) {
for (int j=i+1; j<arr.length;j++) {
if(arr[i]>arr[j]) {
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("After Array Sorted:");
for(int i=0; i<arr.length;i++) {
System.out.println(arr[i]++);
}
}
}