class ProgramArray {
public static void main (String [] args) {
String name [] = {"abc","pqr","xyz","efg"};
String alphabets[] = {"a","b","c","d","f","g","h"};
String fruit []= {"banana","papai","mango","orange"};
arrayLength(null);
arrayLength(name);
arrayLength(alphabets);
arrayLength(fruit);
}
public static void arrayLength(String array[])
{
if (array==null) {
System.out.println("array is null cant determine length");
}
else {
int arrayLength=array.length;
System.out.println ("array length is:" +arrayLength);
}
}
}