public class Square {
public static void main(String[] args){
System.out.println("Main method started!!!");
int result;
result = addition(30,50);
System.out.println("Addition Result:" +result);
int square;
square = squareAddition(result);
System.out.println("Square Result:" +square);
System.out.println("Main Method ended!!!");
}
public static int addition(int a,int b)
{
System.out.println("Addition method started");
int sum=a+b;
System.out.println("Addition method ended");
return sum;
}
public static int squareAddition(int result)
{
	System.out.println("Square method started!!!");
	int square=result*result;
	System.out.println(square);
		System.out.println("Square method Ended!!!");
	return square;
}

}

