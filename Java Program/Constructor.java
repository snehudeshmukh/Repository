public class Constructor {
int rollNo;
String name;
String universityName;

public static void main (String[] args) {
 final Constructor s1 = new Constructor();
s1.rollNo = 10;
s1.name = "Ram";
s1.universityName= "Pune University";
System.out.println (s1.rollNo);
System.out.println (s1.name);
System.out.println (s1.universityName);
Constructor s2 = new Constructor();
s2.rollNo = 20;
s2.name = "Sham";
s2.universityName= "Pune University";
System.out.println (s2.rollNo);
System.out.println (s2.name);
System.out.println (s2.universityName);
s1=s2;
}
}