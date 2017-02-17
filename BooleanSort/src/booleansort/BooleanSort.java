/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package booleansort;

import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author misho.velichkovski
 */
public class BooleanSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random r = new Random();
       boolean[] array= new boolean[r.nextInt(50)];
               
        for (int i = 0; i < array.length; i++) {
           array[i]=r.nextBoolean();
        }
        
        ArrayList<Boolean> Tlist = new ArrayList();
        ArrayList<Boolean> Flist = new ArrayList();
        for (int i = 0; i < array.length; i++) {
           if(array[i]==true)
           {
               Tlist.add(array[i]);
           }
           else
           {
               Flist.add(array[i]);
           }
        }
        int i ;
        for ( i=0;  i < Tlist.size(); i++) {
           array[i]=Tlist.get(i);
            
        }
         int j;
         int m=0;
        for(j=i ; j<array.length;j++ )
        {   
            array[j]=Flist.get(m);
            m++;
        }
        
        for(int n=0; n<array.length; n++)
            System.out.print(array[n] + " ");
                 
    }
    
}
