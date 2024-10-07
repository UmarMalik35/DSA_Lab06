/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad_Umar
 */
public class task3 {
    public void stringbubblesort(String[] arr){
         int count=0;
         boolean stop = false;
      for(int i=0; i<arr.length-1; i++){
           for(int j=0; j<arr.length-i-1; j++){    
              if(arr[j].length()>arr[j+1].length()){
                  String temp=" ";
                    temp=arr[j];
                   arr[j]=arr[j+1];
                   arr[j+1] = temp;
                   count++;
                   stop = true;
              }
               }
           }
       if(stop == false){
                 System.out.println("Array is already sorted");
                 return;
             }
        System.out.print("Total steps "+count);
        System.out.println("");
       }
    public static void main(String[] args){
        task3 obj = new task3();
        String[] arr={"PineApple"," Apple "," Banana "," Strawberry"};
        obj.stringbubblesort(arr);
        
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
