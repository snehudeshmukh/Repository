public class ParaConstructor {
	String name;
	int rollNo;
	String uniName;
public ParaConstructor(String name,int rollNo, String uniName) //parameterised Cons
{
this.name=name;
this.rollNo= rollNo;
this.uniName=uniName;
}
public ParaConstructor()
{
}
public static void main (String[] args){
ParaConstructor s1= new ParaConstructor("Ram",20,"Pune University");
System.out.print(s1.name);
System.out.print(s1.rollNo);
System.out.print(s1.uniName);

ParaConstructor s2= new ParaConstructor("Sham",30,"Pune University");
System.out.print(s2.name);
System.out.print(s2.rollNo);
System.out.print(s2.uniName);

}
}