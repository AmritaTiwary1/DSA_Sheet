import java.util.*;
public class pairSum {
    // GeeksForGeeks accepted solution :

// class Solution {
//     boolean hasArrayTwoCandidates(int arr[], int n, int x) {
//       Arrays.sort(arr);
//       int j=n-1;
//       int i=0;
//       if(arr[0]>x){
//               return false;
//       }
//       while(i<j){
          
//          if(arr[i]+arr[j]==x){
//               return true;
//           }
//           else if(arr[i]+arr[j]<x){
//               i++;
//           }
//           else if(arr[i]+arr[j]>x){
//               j--;
//           }
//       }
//       return false;
//     }
// }


  public static int findSum(int arr[],int k,int count) {
    int n=arr.length;
    HashMap<Integer,Integer> map=new HashMap<>();
    for (int i = 0; i < n; i++) {
        map.put(i,arr[i]);
    }
    for (int i = 0; i < n-1; i++) {
        int num = k-arr[i];
        map.remove(i);
        if(map.containsValue(num)){
            count=count+1;
            System.out.println(count);
        }
        System.out.println(map);
    }
   
    return count;
  }
    public static void main(String[] args) {
        int arr[]=new int[]{1,5,3,2,4,0,6,1,3};
        int count=0;
        int k=6;
        int ans=findSum(arr, k, count); 
        System.out.println("pair sum = "+ans); 
    }
} 


//WARNING IN GEEKSFORGEEKS : time limit exceeds : TestCase(167/174)

// class Solution {
//     boolean hasArrayTwoCandidates(int arr[], int n, int x) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int i=0;i<n;i++){
//             map.put(i,arr[i]);
//         }
//         for(int i=0;i<n;i++){
//             int num=x-arr[i];
//             map.remove(i);
//             if(map.containsValue(num)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }
