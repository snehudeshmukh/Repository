public class StudentDemo {
int roll;
String name;
String address;
public StudentDemo() {
}
public StudentDemo (int roll,String name,String address) {
this.roll=roll;
this.name=name;
this.address=address;
}
public String toString() {
	return roll+" "+name+" "+address;
}
}
