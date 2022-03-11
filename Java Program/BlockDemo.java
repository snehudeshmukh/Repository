public class BlockDemo {

{
System.out.println("Instance1 Block Display");
}
static
{
System.out.println("Static2 Block Display");
}
static
{
System.out.println("Static1 Block Display");
}	
{
System.out.println("Instance 2 Block Display");
}
public BlockDemo()
{
System.out.println("Constructor Display");
}
public static void main (String[] args)
{
System.out.println ("Main Mthod Started");
BlockDemo obj = new BlockDemo();
}
}