// move all negative num to one side 

 // no help-- can use pivot method frontIdx,lastIdx , swapping FrontIdx and lastIdx if(arr[i]>0)

 public class negativeNoOneSide {
    public static void moveNegative(int arr[]){
        int n=arr.length;
        int i=0;   //frontIdx
        int j=n-1; 
        while(i <= j){
          if(arr[i]>0 && arr[j]<0 ){  // no builtin fn in java to swap in array ATMK
            int tem=arr[i];
            arr[i++]=arr[j];
            arr[j--]=tem;
          }
          else if(arr[i]<0){
              i++;
          }
          else if(arr[j]>0){
            j--;
          }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print("   "+arr[k]);
        }
    }
 public static void main(String[] args) {
  int arr[]=new int[]{9,1,8,-2,5,-1};
  moveNegative(arr);
}    
    }

// no help -- in new array ,adding neg. no to front side and pos to back side
/*public class negativeNoOneSide {
    public static void moveNegative(int arr[]){
        int n=arr.length;
        int f_idx=0;
        int b_idx=n-1;
     int newArr[]=new int[n];
     for(int i=0;i<n;i++){
        if(arr[i]<0){
          newArr[f_idx++]=arr[i];
        }                                         //{9,1,8,-2,5,-1};
        else if(arr[i]>=0){
          newArr[b_idx]=arr[i];
          b_idx--;
        }
     }
     for(int j=0;j<n;j++){
    System.out.print("  "+newArr[j]);
    }
}
    public static void main(String[] args) {
        int arr[]=new int[]{9,1,8,-2,5,-1};
        moveNegative(arr);
    }   
}*/
