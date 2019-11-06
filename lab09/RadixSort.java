import java.io.*;
import java.util.*;

public class RadixSort{
  
  static int Max(int arr[], int n){ //function to get the maximum length number.
    int max = arr[0];
    for (int i = 1; i < n; i++)
      if (arr[i] > max) max = arr[i];
    return max;
  }

  static void sort( int arr[], int n, int exp ){
    int output[] = new int[n]; //
    int count[] = new int[10]; //
    Arrays.fill(count, 0);
    
    for (int i = 0; i < n; i++){
      count[(arr[i]/exp)%10]++;
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
  
  static void radixsort(int arr[], int n){
    int m = Max(arr, n);
    for (int exp = 1; m/exp > 0; exp *= 10){
      sort(arr,n,exp);
    }
  }
  
  static void print(int arr[], int n){
    for (int i = 0; i < n; i++){
      System.out.println(arr[i] + "");
    }
  }
  
  public static void main(String[] args){
    int arr[] = {170, 45, 75, 90, 802, 24, 2, 66};
    int n = arr.length;
    radixsort(arr,n);
    print(arr,n);
}
}