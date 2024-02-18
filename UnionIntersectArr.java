import java.util.*;
public class unionIntersect {
    public static void findUnion(int arr1[],int arr2[]) {
        Set<Integer> union=new HashSet<Integer>();
        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }
        System.out.println(union);
    }
    public static void intersect(int arr1[],int arr2[]) {
        int[] intersectArr=new int[20];
        int idx=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if(arr1[i]==arr2[j]){
                    intersectArr[idx++]=arr2[i];
                }
            }
        }
        for (int i = 0; i < idx; i++) {
            System.out.print("  "+intersectArr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr1 = new int[] { 4, 7, 9, 13, 15 };
        int[] arr2 = new int[] { 4, 7, 9, 33, 55 };
        findUnion(arr1, arr2);
        intersect(arr1, arr2);
    }
}
