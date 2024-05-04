// GFG -> time limit exceed , correct output 
//USING RECURSION

class Solution {
    static int numberOfWays(int n) {
        if(n==0){
            return 1;
        }
       if(n==1 || n==2){
           return n;
       }
       
      int verticallyPlaced = numberOfWays(n-1);
      int horizontallyPlaced = numberOfWays(n-2);
      
      return verticallyPlaced + horizontallyPlaced;
     
    }
};
  

