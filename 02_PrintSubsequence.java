import java.util.*;
import java.util.ArrayList;

/*
 OUTPUT : 
 1st output : [abc_, bc_, ac_, c_, ab_, b_, a_, _]
2nd :  [abc, bc, ac, c, ab, b, a, ]
 */

public class allSubsequence_using_substring {

    public static ArrayList<String> seq(String str){

       if(str.length() ==0){
        ArrayList<String> half_ans = new ArrayList<>();
        // half_ans.add("_");    ---> output : [abc_, bc_, ac_, c_, ab_, b_, a_, _]
         half_ans.add("");   // ---> [abc, bc, ac, c, ab, b, a, ]
        return half_ans;
       }
       
       char ch = str.charAt(0);
    String restStr= str.substring(1);

    ArrayList<String> half_ans = seq(restStr);

    ArrayList<String> ans = new ArrayList<>();

    for(String val: half_ans){
        ans.add(ch+val);
        ans.add(val);
    }
  return ans;
 }
    public static void main(String[] args) {
        String str = "abc";
      ArrayList<String> ans = seq(str);
      System.out.println(ans);   
    }
}
