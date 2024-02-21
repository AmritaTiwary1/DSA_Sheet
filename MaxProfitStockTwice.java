import java.util.*;
//no help-Brute force
public class MaxProfitStockTwice {
    public static int maxProfTwice(int arr[]){
        int i=0,j=1;
        int fminBuy=arr[0];
        int sminBuy=Integer.MAX_VALUE;
        int fprofit=Integer.MIN_VALUE;
        int sprofit=Integer.MIN_VALUE;
        int ans=0;
        for (i = 0; i < arr.length; i++) {
             fminBuy=Math.min(arr[i], fminBuy);
             int fcurrProfit=arr[i]-fminBuy;
             fprofit=Math.max(fcurrProfit,fprofit);

          for (j = i+1; j< arr.length; j++) {
            sminBuy=Math.min(arr[j], sminBuy);
            int scurrProfit=arr[j]-sminBuy;
            sprofit=Math.max(scurrProfit, sprofit);
          } 
           ans=Math.max(ans, fprofit+sprofit); 
           sminBuy=Integer.MAX_VALUE;
           sprofit=Integer.MIN_VALUE; 
        }  
return ans;
    }    public static void main(String[] args) {
        // int arr[]=new int[]{10,22,5,75,65,80};
        // int arr[]=new int[]{100,30,15,10,8,25,80};
        // int arr[]=new int[]{90,80,70,60,50};
        int arr[]=new int[]{2,30,15,10,8,25,80};
        int MaxProfit=maxProfTwice(arr);
        System.out.println(MaxProfit);
    }
}
