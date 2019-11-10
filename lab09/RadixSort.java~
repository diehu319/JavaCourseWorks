import java.io.*;
import java.util.*;

public class RadixSort{
  
  public static void main(String[] args){
    int arr[] = {19,2,3,55,77,31,98,5};
    int n = arr.length;
    radixsort(arr,n);
    for (int i = 0; i < n; i++){
      System.out.print(arr[i] + " ");
    }
  }
 
  static void radixsort(int arr[], int n){
    int m = arr[0];
    for (int i = 1; i < n; i++){
      if (arr[i] > m) m = arr[i]; //find the max length number
    }
    for (int exp = 1; m/exp > 0; exp *= 10){
      int output[] = new int[n]; // create the output as the result.
      int count[] = new int[10]; // create an array named count length of 10.This count shows the number on the digit.
      Arrays.fill(count, 0); // make the array count full of 0.
    
      for (int i = 0; i < n; i++){
        count[(arr[i]/exp)%10]++; //when arr[i]/exp%10 = 1, count[1]+= 1.
      }
      for (int i = 1; i < 10; i++){
        count[i] += count[i-1];
      }
      for (int i = n - 1; i >= 0; i--){
        output[count[(arr[i]/exp)%10]-1] = arr[i];
        count [(arr[i]/exp)%10]--;
      }
      for (int i = 0; i < n; i++){
        arr[i] = output[i];
      }
    }
  }
}