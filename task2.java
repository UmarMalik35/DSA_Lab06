/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad_Umar
 */
public class task2 {
    public void earlystopbubblesort(int[] arr){
       int count =0;
       boolean stop =false;
     
      // System.out.print("Total steps: ");
       for(int i=0; i<arr.length-1; i++){
           for(int j=0; j<arr.length-i-1; j++){    
              if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] = temp;
                   count++;
                   stop = true;
               }
           }
       }// checking if an aray is sorted 
        if(stop == false){
                 System.out.println("Array is already sorted");
                 return;
             }
           System.out.print("Total steps "+count);
        System.out.println("");
   }
    public static void main(String args[]) {
      task2 obj = new task2();
         int[] arr={5,4,3,2,1,0};
      obj.earlystopbubblesort(arr);
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" " );
      }
    }
}
