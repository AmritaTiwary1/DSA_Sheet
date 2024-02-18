import java.util.HashMap;

public class commonInThreeSortedArr {
    public static void common(int shortestArr[],int arr1[],int arr2[]){
        for (int i = 0; i < shortestArr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if(shortestArr[i]==arr1[j]){
                    for (int j2 = 0; j2 < arr2.length; j2++) {
                        if(shortestArr[i]==arr2[j2]){
                            System.out.println(shortestArr[i]);
                        }
                    }

                }
            }
        }
    }        
    public static void main(String[] args) {
        int arr1[] = new int[] { 1, 5, 10, 20, 40, 80 };
        int arr2[] = new int[] { 6, 7, 20, 80, 100 };
        int arr3[] = new int[] { 3, 4, 15, 20, 30, 70, 80, 100 };
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n3 = arr3.length;
        if (n1 <= n2 && n1 <= n3) {
            common(arr1, arr2, arr3);
        } else if (n2 <= n1 && n2 <= n3) {
            common(arr2, arr1, arr3);
        }
    else {
        common(arr3, arr1, arr2);
    }
}}
   /*  // in GFG - Your program took more time than expected     
ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
{
    int i=0,j=0,k=0;
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    while(i<n1 && j<n2 && k<n3){
        if(A[i]==B[j] && B[j]==C[k]){
            if(!numbers.contains(A[i])){
            numbers.add(A[i]);
            i++;
            k++;
            j++;
        }
        }
        else if(A[i]<B[j] || (A[i]<C[k]) ){
            i++;
        }
        else if(A[i]>B[j] || C[k]>B[j]){
            j++;
        }
        else {
           k++; 
        }
    }
    return (numbers);
}*/
// public static void common(int arr1[],int arr2[],int arr3[]){
//   int intersectArr[]=new int[arr1.length];
//   int k=0;
//   for (int i = 0; i < arr1.length; i++) {
//     for (int j = 0; j < arr2.length; j++) {
//         if(arr1[i]==arr2[j]){
//             intersectArr[k++]=arr1[i];
//         }
//     }
// }
//     for (int i = 0; i < arr3.length; i++) {
//         for (int j = 0; j < intersectArr.length; j++) {
//             if(arr3[i]==intersectArr[j]){
//                 System.out.println(intersectArr[j]);
//             }
//         }

//     }
//   }
// public static void main(String[] args) {
//         int arr1[] = new int[] { 1, 5, 10, 20, 40, 80 };
//         int arr2[] = new int[] { 6, 7, 20, 80, 100 };
//         int arr3[] = new int[] { 3, 4, 15, 20, 30, 70, 80, 100 };
//         int n1 = arr1.length;
//         int n2 = arr2.length;
//         int n3 = arr3.length;
//         if (n1 <= n2 && n1 <= n3) {
//             common(arr1, arr2, arr3);
//         } else if (n2 <= n1 && n2 <= n3) {
//             common(arr2, arr1, arr3);
//         }
//     else {
//         common(arr3, arr1, arr2);
//     }
// }}
