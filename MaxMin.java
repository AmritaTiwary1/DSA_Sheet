/*Given an array of size N. The task is to find the maximum and the minimum element of the array using the minimum number of comparisons
Input: arr[] = {3, 5, 4, 1, 9}
Output: Minimum element , Maximum element is: 9 */

import java.util.Arrays;

public class maxMin {
    public static void maxmin(int a[]){
        int n=a.length;
    Arrays.sort(a);
    System.out.println("Max= "+a[n-1]+" Min : "+a[0]);
    }
    public static void main(String[] args){
        int a[] = new int[] { 6, 9, 2, 5, 1 };
        maxmin(a);
    }
}
