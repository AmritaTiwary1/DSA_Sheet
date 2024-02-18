import java.util.HashMap;

//-------------------------------------------------------------------
//GeeksForGeeks submitted sol.
/* 
class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
        Set<Integer> hashset=new HashSet<Integer>();
             int sum=0;
           for (int i = 0; i < n; i++) {
                 sum=sum+arr[i];
               if(arr[i]==0 || sum==0 || hashset.contains(sum) ){
                   return true;
               }
             hashset.add(sum); 
            }
            return false;
        }
}*/ 

//GFG :more time taken  -----------------------------------------------------------------------------------------------------
/*public class SubArrSumZero {
        public static boolean subArrSumZero(int arr[]){
            HashMap<Integer,Integer> map=new HashMap<>();
           int sum=0;
            for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum==0 || arr[i]==0){
                return true;
            }
          else if(map.containsValue(sum)){
            return true;   }
           else{
            map.put(i, sum);   }
           }
            return false;
        }
     public static void main(String[] args) {
            // int arr[]=new int[]{4,2,-3,1,6};
            // int arr[]=new int[]{4,2,0,1,6};
            // int arr[]=new int[]{1,-1,3};
           int arr[]=new int[]{5,0, 3, 6, 5, 1};
            //int arr[]=new int[]{1,-1,3,2,-2,-8,1,7,10,23};
            boolean res=subArrSumZero(arr);
            System.out.println(res);
        }
    } */
//---------------------------------------------------------------------------------------
    /* 
 public class SubArrSumZero {
//     public static boolean subArrSumZero(int arr[]){
//         int sum=0;
//         for (int i = 0; i < arr.length-1; i++) {
//             sum=arr[i];
//             if(sum==0){
//                 return true;
//             }
//             for (int j = i+1; j < arr.length; j++) {
//                 sum= sum+arr[j];
//                 if(sum==0){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int arr[]=new int[]{4,2,-3,1,6};
//         boolean res=subArrSumZero(arr);
//         System.out.println(res);
//     }
// }
*/


//MaxSubArrZero---------------------------------------------------------------------------------------------
// /*N = 8
// A[] = {15,-2,2,-8,1,7,10,23}
// Output: 5
// Explanation: The largest subarray with
// sum 0 will be -2 2 -8 1 7
// */

//GeeksForGeeks submitted solution _------------------------------------
/*public class SubArrSumZero {
    public static int maxSubarray(int arr[]){ 
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int sum=0;
        int maxSumCount =0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum==0){
                count=i+1;
                maxSumCount=Math.max(maxSumCount,count);
            }
             if(map.containsKey(sum)){  // map will have unique sum only , not repeated sum
                count=i-map.get(sum);
                maxSumCount=Math.max(maxSumCount,count);
             }
             else {
             map.put(sum, i);
             }
           } 
        return maxSumCount;
    }
    public static void main(String[] args) {
       
          int arr[]=new int[]{4,2,-3,1,6};
            // int arr[]=new int[]{4,2,0,1,6};
           // int arr[]=new int[]{1,-1,3};
           // int arr[]=new int[]{5,0, 3, 6, 5, 1};
            ///int arr[]=new int[]{1,-1,3,2,-2,-8,1,7,10,23};
        int count = maxSubarray(arr);
        System.out.println(count);
    }
}
*/
