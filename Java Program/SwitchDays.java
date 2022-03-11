import java.util.Scanner;
class SwitchDays {
public static void main (String [] args) {
System.out.println("Enetr The Day ");
Scanner input = new Scanner(System.in);
String weekOfDays = input.nextLine();
String typeOfDay ="";
switch(weekOfDays){
case "Monday":
typeOfDay="Start Of Working week";
break;
case "Tuesday":
case "Wensday":
case "Thursday":
typeOfDay="Working Days";
break;
case "Friday":
typeOfDay="Last Day Of Working week";
break;
case "Saturday":
case "Sunday":
typeOfDay="Weekend";
break;
default :
System.out.println("Invalid Days");
typeOfDay="Invalid Days";
}
System.out.println(typeOfDay);
}
}