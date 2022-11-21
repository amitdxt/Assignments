class Heap
{
public static void main(String... ar)
{
String s1 = "Hello";  //creating a String object in String Constant Pool heap memory
String s2 = "Hello";  //creating a String object in String Constant Pool with duplicate value

String s3 = new String("Hello"); //creating String object in the normal heap memory.
String s4 = new String("Hello"); //creating String object in the normal heap memory.

System.out.println("Do s1 and s2 point to a same String object ? "+ (s1==s2));

System.out.println("Do s1 and s3 point to a same String object ? "+ (s1==s3));

System.out.println("Do s3 and s4 point to a same String object ? "+ (s3==s4));
}
}