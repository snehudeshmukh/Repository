class Sort {
public static void main (String []args) {
int a[] = {0,1,2,0,0,0,1,2,1,2,1,0,2,1,0};
int i,count0=0,count1=0,count2=0;
for(i=0;i<a.length;i++) {
switch(a[i]) 
{
case 0:count0++;
break;
case 1:count1++;
break;
case 2:count2++;
break;
}
}
System.out.println("count0 print:" +count0);
System.out.println("count0 print:" +count1);
System.out.println("count0 print:" +count2);
i=0;
while(count0>0) {
	a[i++]=0;
	count0--;
}
while(count1>0) {
	a[i++]=1;
	count1--;
}
while(count2>0) {
	a[i++]=2;
	count2--;
}
System.out.println("Count of 0 1 2");
for(i=0;i<a.length;i++) {
System.out.print(" " +a[i]);
}
}
}	