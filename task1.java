/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad_Umar
 */
public class task1 {
     public void bubblesort(int[] arr){
       int count =0;
       System.out.print("Total steps: ");
       for(int i=0; i<arr.length-1; i++){
           for(int j=0; j<arr.length-i-1; j++){
               if(arr[j]>arr[j+1]){
                   int temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] = temp;
                   count++;
                   
               }
           }
       }
           System.out.print(count);
        System.out.println("");
   }
    public static void main(String args[]) {
      task1 obj = new task1();
      int[] arr={5,4,3,2,1,0};
      obj.bubblesort(arr);
      for(int i=0; i<arr.length; i++){
          System.out.print(arr[i]+" " );
      }
    }
}
