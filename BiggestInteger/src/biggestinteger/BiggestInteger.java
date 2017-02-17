/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biggestinteger;
import java.util.Random;
/**
 *
 * @author misho.velichkovski
 */
public class BiggestInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       Random r = new Random();
       int j=0;
       
       int[] array = new int[r.nextInt(50)];
        for (int i = 0; i < array.length; i++) {
           array[i]=r.nextInt(50);
        }
        System.out.println("The list is : " + array.length + " long : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            
        }
        int biggest= array[0];
        
        for (int i = 0; i < array.length; i++) {
            if (array[i]>biggest)
            {   biggest=array[i];
                j=i;
            }
            
        }
        
        System.out.println("\nThe bigest Integer in the array is " + biggest +" and it's on " + j + "th position");  
        System.out.println("Complexity : O(n)");
    }
    
    
}
