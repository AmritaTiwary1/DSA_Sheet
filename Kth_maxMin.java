
//Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.

//using pririty queue
import java.util.PriorityQueue;
public class Kth_maxMin {
    public static void kthMaxMin(int[] arr,int n ,int k ) 
    {  
        int maxIdx = n-k;
        int minIdx = k-1;
        int minAns, maxAns;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int j=0;
        while (j <= Math.max(maxIdx, minIdx)) {
            if(j==minIdx){
               minAns=pq.peek(); 
               System.out.println(minAns);   //5
            }
            if (j == maxIdx) {
                maxAns = pq.peek();
                System.out.println(maxAns);   //5
            }
            pq.poll();
            j++;
        }
       }
    public static void main(String[] args) {
        int[] arr=new int[]{4,7,9,3,5};
        int k=3;
      kthMaxMin(arr, arr.length,k);   
    }   
}
// no help --by keeping track of old max
/*import java.util.*;
public class Kth_maxMin {
public static void max(int arr[],int pos){
    int oldMax=Integer.MAX_VALUE;
    while (pos!=0) {
        int max=Integer.MIN_VALUE;                      // 4, 7, 9, 3, 5
        for(int i=0;i<arr.length ;i++){                 
            if(arr[i]<oldMax){
              if(max<arr[i]){
                max=arr[i];
              }
            }
         }
        oldMax=max;
        pos--;
    }
    int realMax=oldMax;
    System.out.println(" max : "+ realMax);
}
public static void main(String[] args) {
        int[] array = new int[] { 4, 7, 9, 3, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Kth term :");
        int pos = sc.nextInt();
        max(array, pos);
        //min(array,pos);
        sc.close();
    }

} */

//2.  no help -- using arraylist

/*import java.util.*;

public class Kth_maxMin {
    public static void max(ArrayList<Integer> arr_list, int pos) {
        int maxNum = Integer.MIN_VALUE;
        int n = arr_list.size();
        while (pos > 0) {
            maxNum = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int curr = arr_list.get(i); // 4, 7, 9, 3, 5
                if (maxNum < curr) {
                    maxNum = curr;
                }
            }
            if (pos > 1) {
                arr_list.remove(Integer.valueOf(maxNum));
            }
            n--;
            pos--;
            
        }
          System.out.println("max :" + maxNum );

    }

  public static void min(ArrayList<Integer> arr_list, int pos) {
        int minNum = Integer.MAX_VALUE;
        int n = arr_list.size();
        while (pos > 0) {
            minNum = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                int curr = arr_list.get(i); // 4, 7, 9, 3, 5
                if (minNum > curr) {
                    minNum = curr;
                }
            }
            if (pos > 1) {
                arr_list.remove(Integer.valueOf(minNum));
            }
            n--;
            pos--;
            
        }
          System.out.println("min :" + minNum );

    }
    public static void Arraylist(int arr[], int pos) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arraylist.add(arr[i]);
        }
        max(arraylist, pos);
        min(arraylist, pos);
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 7, 9, 3, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Kth term :");
        int pos = sc.nextInt();
        Arraylist(arr, pos);
        sc.close();
    }
}*/



// 3 . using inbuilt fn Arrays.sort

/*import java.util.*;
public class Kth_maxMin {
    public static void Kth(int arr[],int idx){
        Arrays.sort(arr);
        int length=arr.length;
        System.out.println("maximum "+idx +"th number : "+arr[length-idx]);
        System.out.println("Minimum "+idx +"th number : "+arr[idx-1]);
    }
   public static void main(String[] args) {
    int[] arr=new int[]{4,7,9,3,5};
    Scanner sc=new Scanner(System.in);
    System.out.print("enter Kth term :");
    int idx=sc.nextInt();
    Kth(arr,idx);
    sc.close();
   } 
}*/




// another way is to create array in which we put all k-1 th max min values and inside for loop , we run loop &check the cond. if(arr[i]!=newArr[j]) , find max

