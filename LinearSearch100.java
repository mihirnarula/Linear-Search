// Linear Search 
// LOGIC - It does sequential access of an array to find the number
package linearsearch10.pkg0;
import java.util.*;
public class LinearSearch100 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int count = 0;
        System.out.println("Enter 10 numbera: ");
        for(int i = 0; i < 10; i++){
        a[i] = sc.nextInt();
        }
        System.out.println("Enter number to be searched: ");
        int num = sc.nextInt();
        
        for(int j = 0; j < 10; j++){
            if(a[j] == num){
              count = 1;  
            }
       
        }
     if(count == 1)
            System.out.println("The number is present");
        else
            System.out.println("The number is not present");
    }
    
}
