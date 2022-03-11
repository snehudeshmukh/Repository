import java.util.Scanner;
class SwitchDemo {
public static void main (String [] args) {
System.out.println("Enetr The Month Number ");
Scanner input = new Scanner(System.in);
int month = input.nextInt();
switch (month) {
case 1:
System.out.println ("Its January");
case 2:
System.out.println ("Its Feb");
case 3:
System.out.println ("Its March");
case 4:
System.out.println ("Its April");
break;
case 5:
System.out.println ("Its May");
break;
case 6:
System.out.println ("Its June");
break;
case 7:
System.out.println ("Its July");
break;
case 8:
System.out.println ("Its August");
break;
case 9:
System.out.println ("Its September");
break;
case 10:
System.out.println ("Its Oct");
break;
case 11:
System.out.println ("Its Nov");
break;
case 12:
System.out.println ("Its December");
break;
default:
System.out.println("Invaid Year");
}
}
}