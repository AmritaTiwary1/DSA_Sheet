/*Given an array (or string), the task is to reverse the array/string.
Examples :
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4} */
//Brute Force method : O(n)
/*import java.util.*;
class reverse {
    public static void rev(int oldArr[], int newArr[]) {
        int n = oldArr.length;
        for (int i = 0; i < 5; i++) {
            newArr[i] = oldArr[n - i - 1];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oldArr[] = new int[] { 6, 9, 2, 5, 1 };
        int newArr[] = new int[50];
        rev(oldArr, newArr);
        for (int i = 0; i < 5; i++) {
            System.out.println(newArr[i]);
        }
    sc.close();
    }
}*/
// using Recursion
/*import java.util.*;
class reverse {
    public static void rev(int oldArr[], int newArr[],int i) {
        int n = oldArr.length;
        if(i==n)
           return;
         newArr[i] = oldArr[n - i - 1];
         rev(oldArr,newArr,i+1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oldArr[] = new int[] { 6, 9, 2, 5, 1 };
        int newArr[] = new int[50];
        rev(oldArr,newArr,0);
        for (int i = 0; i < 5; i++) {
            System.out.println(newArr[i]);
        }
       sc.close(); 
  }
} */
// O(n/2)
/*import java.util.*;
class reverse {
    public static void rev(int oldArr[]) {
        int n = oldArr.length;
        for (int i = 0; i <= n / 2; i++) {
            int t = oldArr[i];
            oldArr[i] = oldArr[n - 1 - i];
            oldArr[n - 1 - i] = t;

        }
    } public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oldArr[] = new int[] { 6, 9, 2, 5, 1 };
        rev(oldArr);
        for (int i = 0; i < 5; i++) {
            System.out.println(oldArr[i]);
        }
        sc.close();
    }
}*/
