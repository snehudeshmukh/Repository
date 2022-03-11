class EvenOdd {
public static void main (String[] args){
int result;
result = addition(12,13);
even(result);
System.out.println ("Addtion Result:" +result);
}

public static int addition (int i,int j) {
int sum = i+j;
return sum;
}
public static void even (int result) {
	
 if(result%2==0)
 {
	System.out.println("Even Number");
 }
 else
	 {
	System.out.println("odd Number");
}
}
}
