import java.lang.*; 
import java.util.*;  
class StringInsertion { 
  
  public static void main(String[] args) 
    { 
        Scanner input=new Scanner(System.in);
        
        // Input original string
        System.out.println("Enter the Original String: ");
        String firStr = input.nextLine();
        
        //Input the second string to be inserted
        System.out.println("Enter the String to be Inserted: ");
        String secStr = input.nextLine();
        
        //Input the index after which the string should be inserted
        System.out.println("Enter the Index: ");
        int index = input.nextInt();
  
        String newStr = new String(); 
  
        for (int i = 0; i < firStr.length(); i++) { 
            //Add character by character to new string 
            newStr += firStr.charAt(i); 
           
            if (i == index) { 
                //Insert the second string
                newStr += secStr; 
            } 
        } 
  
        // Output 
        System.out.println("New String After Insertion: "+ newStr);
 
    } 
}