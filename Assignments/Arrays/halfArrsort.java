
import java.util.Arrays;
public class halfArrsort {
    public static void main(String[] args) {
        int[] a={3,1,8,7,9,4};
        System.out.println(Arrays.toString(halfOrder(a)));
    }

    static int[] halfOrder(int[] a){
        int size = a.length, temp;
        //first half ascending
        for(int i=0;i<size/2;i++){
            for(int j=i+1;j<size/2;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        
        for(int i=size/2;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]<a[j]){
                    temp = a[i];
                    a[i]=a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}

