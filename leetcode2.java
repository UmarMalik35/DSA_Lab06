
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Muhammad_Umar
 */
public class leetcode2 {
    
    public void intersection(int arr1[],int arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i]==arr2[j]){
                    System.out.println("Intersecting element "+arr1[i]);
                }
            }
        }
    }
    public static void main(String []args){
        leetcode2 obj = new leetcode2();
        int[] ar={1,2,3,4,5};
        int[] arr={1,3,5,4,0};
        obj.intersection(ar, arr);
        
    }
}
