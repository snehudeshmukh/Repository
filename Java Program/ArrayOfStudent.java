public class ArrayOfStudent {
public static void main (String[] args) {
StudentDemo s1 = new StudentDemo (10,"Ram","Pune");
StudentDemo s2 =new StudentDemo (20,"Sham","Nagpur");
StudentDemo s3 =new StudentDemo (25,"Ruma","Pune");
StudentDemo s4 =new StudentDemo (30,"Pavan","Kolhapur");
StudentDemo s5 =new StudentDemo (35,"Rohit","Kolhapur");
StudentDemo s6 =new StudentDemo (40,"Renu","Nagpur");
StudentDemo s7 =new StudentDemo (45,"AAA","Pune");
StudentDemo s8 =new StudentDemo (50,"BBB","Nagpur");
StudentDemo s9 =new StudentDemo (55,"NNN","Pune");
StudentDemo s10 =new StudentDemo (52,"SSS","Kolhapur");
StudentDemo s11 =new StudentDemo (60,"RRR","Nagpur");
StudentDemo s12 =new StudentDemo (20,"PQR","Pune");
StudentDemo studentArray[]=new StudentDemo[12];
studentArray[0]=s1;
studentArray[1]=s2;
studentArray[2]=s3;
studentArray[3]=s4;
studentArray[4]=s5;
studentArray[5]=s6;
studentArray[6]=s7;
studentArray[7]=s8;
studentArray[8]=s9;
studentArray[9]=s10;
studentArray[10]=s11;
studentArray[11]=s12;
for(StudentDemo t :studentArray) {
if (t.address.equals("Nagpur")) {
System.out.println(t);
}
}
}
}