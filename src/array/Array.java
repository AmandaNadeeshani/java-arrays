/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Amanda Nadeeshani
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0]= 12;
        arr[2]=15;
        arr[9]=23;
        
        System.out.println(arr[9]);
        
        // 2 type
        System.out.println(" 2 array");
       int anum[]={12,13,14,15}; 
         System.out.println(anum[2]);
      
         System.out.println("3 array");
      int num[] ={12,14,18,15,45};
      
      for(int i=0; i<num.length; i++){
          System.out.println(num[i]);  
      }
      
       
    }
    
}
