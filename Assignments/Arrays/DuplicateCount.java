import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 public class DuplicateCount {
    
    static void displayOutput(int[] array){
        int i,j,count;
        for(i=0; i<array.length; i++){
            count = 1;
            for(j=i+1; j<array.length; j++){
                if(array[j] == array[i]){
                    count++;
                }
                else{
                    break;
                }
            }
            i=j-1;
            if(count > 1){
                System.out.println("The element is " + array[i] 
                                   + " and its count is " + count);
            }
        }
    }
    
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred");
                return;
            }
        }
        Arrays.sort(array);
        displayOutput(array);
    }
}