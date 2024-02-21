import java.util.Arrays;
import java.util.HashMap;
public class repeatNBYk {
//GEEKSFORGEEKS Submitted answer
    //Function to find all elements in array that appear more than n/k times.
    public static int countOccurence(int[] arr, int n, int k) 
    {    
    int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int val=map.get(arr[i]);
                if(val>n/k){
                    continue;
                }
                map.replace(arr[i],val+1);
                if(val+1>n/k){
                    count++;
                }
            }
            else{
                map.put(arr[i],1);
            }
        }
        return count;
      }
    public static void main(String[] args) {
        //int arr[]=new int[]{3,1,2,2,1,2,3,3}; int k=4;
        //int arr[]=new int[]{1,1,2,2,3,5,4,2,2,3,1,1,1}; int k=4;
        int arr[]=new int[]{9,8,7,9,2,9,7}; int k=3;
         int n=arr.length;
       int cnt=countOccurence(arr,n,k); 
       System.out.println(cnt);
 }
/*public class repeatNBYk {
    public static void find(int arr[],int n,int k){  
        Arrays.sort(arr); 
        int i=0;
        int count=1;
        int temp[]=new int[n];
        int idx=0;
        while(i<n-1){
            if(count>n/k && arr[i]==arr[i+1]){
              
              i++;
             continue;
         }
            else if(count>n/k){
            temp[idx++]=arr[i];
            i++;
            count=1;
        }
            else if(arr[i]==arr[i+1]){
                count++;
                i++;
            }
            else{
                count=1;
                i++;
            }
        }
        if (count>n/k) {
            temp[idx++]=arr[i];
        }
        for (int j = 0; j <idx; j++) {
            System.out.println(temp[j]);
        }
    }
    public static void main(String[] args) {
        // int arr[]=new int[]{3,1,2,2,1,2,3,3}; int k=4;
        int arr[]=new int[]{1,1,2,2,3,5,4,2,2,3,1,1,1}; int k=4;
        // int arr[]=new int[]{9,8,7,9,2,9,7}; int k=3;
        
        int n=arr.length;
       find(arr,n,k); 
       
    }
     }*/
}
